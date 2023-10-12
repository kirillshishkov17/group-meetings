package ru.shishkov.groupmeeting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shishkov.groupmeeting.models.Person;
import ru.shishkov.groupmeeting.repositories.PersonRepository;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public Person getPersonByLogin(String login) {
        return personRepository.getPersonByLogin(login);
    }

    public void savePerson(Person person) {
        personRepository.save(person);
    }
}
