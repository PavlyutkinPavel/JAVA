package com.football_app.myfootballapp.repository;

import com.football_app.myfootballapp.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    public final SessionFactory sessionFactory;

    public UserRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
        session.close();
    }

    public List<User> findAll() {
        Session session = sessionFactory.openSession();
        Query<User> query = session.createQuery("FROM users ", User.class);
        List<User> users = query.getResultList();
        session.close();
        return users;
    }

    public User findById(Long id) {
        Session session = sessionFactory.openSession();
        User user = session.find(User.class, id);
        session.close();
        return user;
    }

    public void update(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.merge(user);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.remove(user);
        session.getTransaction().commit();
        session.close();
    }
}