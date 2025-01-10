package com.xworkz.bookapp.runner;

import com.xworkz.bookapp.entity.BookEntity;
import org.hibernate.annotations.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class BookRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Keerthi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        BookEntity bookEntity = new BookEntity(1,"Atomic habit","James clear","Fiction",280.90);
        List<BookEntity> list = new ArrayList<>();
        list.add(new BookEntity(null,"Ikegai","John","Non fiction",290.80));
        list.add(new BookEntity(null,"Screat","Adhithya","Fiction",690.80));
        list.add(new BookEntity(null,"Death","Sadhguru","Fiction",340.80));
        list.add(new BookEntity(null,"Health","Sudhamurthy","Non fiction",560.80));
        entityManager.getTransaction().begin();
        for(BookEntity book : list) {
            entityManager.persist(book);
        }
//        entityManager.getTransaction().commit();
    }
}
