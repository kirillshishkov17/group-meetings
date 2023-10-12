package ru.shishkov.groupmeeting.utils;

import org.springframework.stereotype.Component;
import ru.shishkov.groupmeeting.models.Person;
import ru.shishkov.groupmeeting.services.PersonService;

@Component
public class PersonUtils {

    private final PersonService personService;

    public PersonUtils(PersonService personService) {
        this.personService = personService;
    }

    public Boolean checkAuth(Person person) {
        Person personFromDB = personService.getPersonByLogin(person.getLogin());
        if (personFromDB == null) {
            return false;
        }
        String password = person.getPassword();
        String passwordFromDB = personFromDB.getPassword();
        return passwordFromDB.equals(password);
    }
}
