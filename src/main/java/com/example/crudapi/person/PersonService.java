package com.example.crudapi.person;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public PersonDTO createPerson(PersonDTO personDTO) {
        personRepository.save(getPerson(personDTO));

        return personDTO;
    }

    public PersonDTO getPersonById(Long id){
        return personRepository.findById(id)
                .map(person -> new PersonDTO(person.getName(),
                        person.getCpf(),
                        person.getBirthDate()
                ))
                .orElse(null);
    }

    public Person getPerson(PersonDTO personDTO) {
        Person person = new Person();
        person.setCpf(personDTO.cpf());
        person.setName(personDTO.name());
        person.setBirthDate(personDTO.birthDate());

        return person;
    }

}
