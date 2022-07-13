package ru.minashkin.pp311.SpringBoot.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.minashkin.pp311.SpringBoot.models.User;

import java.util.List;

@Component
public interface UserDAO {

    List<User> findAll();

    User findOne(int id);

    @Transactional
    void save(User user);

    @Transactional
    void update(int id, User userUpdate);

    @Transactional
    void delete(int id);
}
