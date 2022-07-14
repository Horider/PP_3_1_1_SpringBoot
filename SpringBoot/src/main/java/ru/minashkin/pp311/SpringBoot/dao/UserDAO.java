package ru.minashkin.pp311.SpringBoot.dao;


import ru.minashkin.pp311.SpringBoot.models.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();

    User findOne(int id);

    void save(User user);

    void update(User userUpdate);

    void delete(int id);
}
