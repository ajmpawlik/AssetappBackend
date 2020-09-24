package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.models.AssetFinanceDefinition;
import com.pluralsight.conferencedemo.repositories.AssetFinanceDefinitionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/asset_finance_definitions")
public class AssetFinanceDefinitionController {

  @Autowired
 private AssetFinanceDefinitionRepository assetFinanceDefinitionRepository;

  @GetMapping
  public List<AssetFinanceDefinition> list() {
    return assetFinanceDefinitionRepository.findAll();
  }

// Connection checked
//  @GetMapping
//  public Long list() {
//    return 146L;
//  }

    // id specifies the specific session
  @GetMapping
  @RequestMapping("{id}")
  public AssetFinanceDefinition get(@PathVariable Long id) {
    return assetFinanceDefinitionRepository.getOne(id);
  }

  //   POST END POINT
//  creates a new session, if you pass a session info to the API end point
//   things only get committed to the database once flushed.
  @PostMapping
  @ResponseStatus (HttpStatus.CREATED) //optional status mapping
  public AssetFinanceDefinition create (@RequestBody final AssetFinanceDefinition assetFinanceDefinition) {
    return assetFinanceDefinitionRepository.saveAndFlush(assetFinanceDefinition);
  }

  // DELETE END POINT
  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable Long id) {
    assetFinanceDefinitionRepository.deleteById(id);
  }

//  PUT (replaces all the attributes to be replaced, if use PATCH then it is allowed to update only some of the attributes)
  @RequestMapping(value = "{id}", method = RequestMethod.PUT)
  public AssetFinanceDefinition update(@PathVariable Long id, @RequestBody AssetFinanceDefinition assetFinanceDefinition) {
    AssetFinanceDefinition existingAssetFinanceDefinition = assetFinanceDefinitionRepository.getOne(id);
    BeanUtils.copyProperties(assetFinanceDefinition, existingAssetFinanceDefinition, "id");
    return assetFinanceDefinitionRepository.saveAndFlush(existingAssetFinanceDefinition);
  }

}
