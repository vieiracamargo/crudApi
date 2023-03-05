package com.example.crudapi.person;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "pessoa")
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String name;
    @Column(name = "cpf", nullable = false, length = 11)
    private String cpf;
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate birthDate;
}
