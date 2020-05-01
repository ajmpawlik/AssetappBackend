package com.pluralsight.conferencedemo.repositories;


import com.pluralsight.conferencedemo.models.AssetFinanceDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetFinanceDefinitionRepository extends JpaRepository<AssetFinanceDefinition, Long> {

}
