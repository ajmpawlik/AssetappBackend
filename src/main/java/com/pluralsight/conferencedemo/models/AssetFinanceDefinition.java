package com.pluralsight.conferencedemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;


@Entity(name = "asset_finance_definitions")
public class AssetFinanceDefinition {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String definition;

  public AssetFinanceDefinition() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }
}
