package com.example.crudapi.person;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/person")
@AllArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping
    ResponseEntity<PersonDTO> createPerson(@RequestBody @Valid PersonDTO personDTO){
        PersonDTO response = personService.createPerson(personDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("{id}")
    ResponseEntity<PersonDTO> getPersonById(@PathVariable Long id){
        PersonDTO personById = personService.getPersonById(id);

        if(personById == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(personById);
    }

}
