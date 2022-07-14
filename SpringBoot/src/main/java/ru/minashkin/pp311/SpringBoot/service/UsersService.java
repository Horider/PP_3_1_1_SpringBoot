package ru.minashkin.pp311.SpringBoot.service;

import org.springframework.transaction.annotation.Transactional;
import ru.minashkin.pp311.SpringBoot.models.User;

import java.util.List;

public interface UsersService {

    List<User> findAll();

    User findOne(int id);

    @Transactional
    void save(User user);

    @Transactional
    void update(User userUpdate);

    @Transactional
    void delete(int id);
}
