package com.pluralsight.conferencedemo.controllers;


import com.pluralsight.conferencedemo.models.AssetFinanceDefinition;
import com.pluralsight.conferencedemo.models.SuggestionForm;
import com.pluralsight.conferencedemo.repositories.SuggestionFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/suggestion_form")
public class SuggestionFormController {

  @Autowired
  private SuggestionFormRepository suggestionFormRepository;

  @GetMapping
  public List<SuggestionForm> list() {
    return suggestionFormRepository.findAll();
  }

  //POST END POINT FOR THE FORM

  @PostMapping
  @ResponseStatus (HttpStatus.CREATED)
  public SuggestionForm create (@RequestBody final SuggestionForm suggestionForm) {
    return suggestionFormRepository.saveAndFlush(suggestionForm);
    //TODO check if flush does not clean the db
  }


}
