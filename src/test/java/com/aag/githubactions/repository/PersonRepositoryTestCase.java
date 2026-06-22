package com.aag.githubactions.repository;


import com.aag.githubactions.domain.Gender;
import com.aag.githubactions.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTestCase {
    @Autowired
    PersonRepository personRepository;

    @Test
    public void testRepository(){
        Person p = Person.builder().
                name("Juan").
                surname("Pérez").
                email("jp@hotmail.com").
                birthDate(LocalDate.of(1983, 3,19)).
                phoneNumber(666777888).
                gender(Gender.MALE).
                workplace("Empresa 103").build();

        assertEquals("Juan", p.getName());
    }

}