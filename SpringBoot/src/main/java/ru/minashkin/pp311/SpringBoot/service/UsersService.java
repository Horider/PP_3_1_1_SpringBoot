package ru.minashkin.pp311.SpringBoot.service;

import org.springframework.stereotype.Service;
import ru.minashkin.pp311.SpringBoot.models.User;

import java.util.List;

@Service
public interface UsersService {

    List<User> findAll();

    User findOne(int id);

    void save(User user);

    void update(int id, User userUpdate);

    void delete(int id);
}
