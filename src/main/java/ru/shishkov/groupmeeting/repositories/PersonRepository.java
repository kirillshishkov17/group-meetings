package ru.shishkov.groupmeeting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shishkov.groupmeeting.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person getPersonByLogin(String login);
}