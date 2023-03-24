package ru.novikov.springtestshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.novikov.springtestshop.domain.User;

public interface UserRepository extends JpaRepository <User, Long> {
    User findFirstByName(String name);
}
