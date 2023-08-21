package com.football_app.myfootballapp.repository;

import com.football_app.myfootballapp.domain.Player;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerRepository {
    public final EntityManager entityManager;

    public PlayerRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //CREATE
    public void save(Player player) {
        entityManager.getTransaction().begin();
        entityManager.persist(player);
        entityManager.getTransaction().commit();
    }

    public List<Player> findAll() {
        Query query = entityManager.createQuery("FROM players ");
        return query.getResultList();
    }

    public Player findById(Long id) {
        return entityManager.find(Player.class, id);
    }

    //DELETE
    public void delete(Long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(Player.class, id));
        entityManager.getTransaction().commit();
    }

    //UPDATE
    public void update(Player player){
        entityManager.getTransaction().begin();
        entityManager.merge(player);
        entityManager.getTransaction().commit();
    }

}
