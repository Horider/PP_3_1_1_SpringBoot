package ru.minashkin.pp311.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.minashkin.pp311.SpringBoot.dao.UserDAO;
import ru.minashkin.pp311.SpringBoot.models.User;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private final UserDAO userDAO;

    @Autowired
    public UsersServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findOne(int id) {
        return userDAO.findOne(id);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void update(int id, User userUpdate) {
        userDAO.update(id, userUpdate);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
