package com.example.crudapi.person;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record PersonDTO(
        @NotBlank
        String name,
        @NotBlank @Size(min = 11, max = 11)
        String cpf,
        @NotNull
        LocalDate birthDate) {
}
