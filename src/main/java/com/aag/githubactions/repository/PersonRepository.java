package com.aag.githubactions.repository;


import com.aag.githubactions.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
