package ru.shishkov.groupmeeting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shishkov.groupmeeting.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Ваши кастомные запросы, если необходимо
}