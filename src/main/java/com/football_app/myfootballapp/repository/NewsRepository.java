package com.football_app.myfootballapp.repository;

import com.football_app.myfootballapp.domain.News;
import jakarta.persistence.criteria.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class NewsRepository {
    public final SessionFactory sessionFactory;

    public NewsRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(News news) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(news);
        session.getTransaction().commit();
        session.close();
    }

    public List<News> findAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<News> criteria = criteriaBuilder.createQuery(News.class);
        Root<News> root = criteria.from(News.class);
        criteria.select(root);
        List<News> newsList = session.createQuery(criteria).getResultList();
        session.close();
        return newsList;
    }

    public News findById(Long id) {
        News news = null;
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<News> criteria = criteriaBuilder.createQuery(News.class);
        Root<News> root = criteria.from(News.class);//складываем в этот класс метаинфу о классе
        criteria.select(root).where(criteriaBuilder.equal(root.get("id"), id));
        List<News> resultList = session.createQuery(criteria).getResultList();
        session.close();
        if(!resultList.isEmpty()){
            news = resultList.get(0);
        }
        return news;
    }

    public void update(News news) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaUpdate<News> criteria = cb.createCriteriaUpdate(News.class);
        Root<News> root = criteria.from(News.class);
        criteria.set("title", news.getTitle());
        criteria.set("content", news.getContent());
        criteria.set("publicationDate", news.getPublicationDate());
        criteria.where(cb.equal(root.get("id"), news.getId()));

        session.beginTransaction();
        session.createMutationQuery(criteria).executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    public void delete(News news) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaDelete<News> criteria = cb.createCriteriaDelete(News.class);
        Root<News> root = criteria.from(News.class);
        criteria.where(cb.equal(root.get("id"), news.getId()));

        session.beginTransaction();
        session.createMutationQuery(criteria).executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
