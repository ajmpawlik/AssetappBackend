package com.pluralsight.conferencedemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity(name = "suggestion_form")
public class SuggestionForm {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String suggested_term;
  private String suggested_by;
  private Date suggested_on_date; // TODO to be double checked for the data type

  public SuggestionForm(){}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSuggested_term() {
    return suggested_term;
  }

  public void setSuggested_term(String suggested_term) {
    this.suggested_term = suggested_term;
  }

  public String getSuggested_by() {
    return suggested_by;
  }

  public void setSuggested_by(String suggested_by) {
    this.suggested_by = suggested_by;
  }

  public Date getSuggested_on_date() {
    return suggested_on_date;
  }

  public void setSuggested_on_date(Date suggested_on_date) {
    this.suggested_on_date = suggested_on_date;
  }

}
