package com.aag.githubactions.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;

@Entity
@Builder
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull

    private String name;
    @NotNull
    private String surname;
    @NotNull
    @Column(unique = true)
    private String email;
    @NotNull
    private LocalDate birthDate;

    private Integer phoneNumber;
    private Gender gender;
    private String workplace;

}


