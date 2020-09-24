package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.SuggestionForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuggestionFormRepository extends JpaRepository<SuggestionForm, Long> {

}