package ru.minashkin.pp311.SpringBoot.dao;

import org.springframework.stereotype.Repository;
import ru.minashkin.pp311.SpringBoot.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private final EntityManager entityManager;

    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> findAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User findOne(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    public void update(User userUpdate) {
        entityManager.merge(userUpdate);
        entityManager.flush();
    }

    @Override
    public void delete(int id) {
        User user = entityManager.find(User.class, id);
        if (null == user) {
            throw new NullPointerException("User not found");
        } else {
            entityManager.remove(user);
        }
        entityManager.flush();
    }
}
