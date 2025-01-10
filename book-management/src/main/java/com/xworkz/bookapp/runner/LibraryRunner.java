package com.xworkz.bookapp.runner;

import com.xworkz.bookapp.entity.LibraryEntity;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class LibraryRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Keerthi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        LibraryEntity libraryEntity = new LibraryEntity(1,"Sri sai",4500,"Rajaji nagar","Private");
        List<LibraryEntity> list = new ArrayList<>();
        list.add(new LibraryEntity(null,"Sadhana",5678,"Jaynagar","Govt"));
        list.add(new LibraryEntity(null,"Adhitya",12650,"Mysore","Govt"));
        list.add(new LibraryEntity(null,"Abhijitha",15000,"Rajaji nagar","Private"));
        list.add(new LibraryEntity(null,"Adhya",1200,"Majestic","Govt"));

        entityManager.getTransaction().begin();
        for(LibraryEntity library : list) {
            entityManager.persist(library);
        }
        entityManager.getTransaction().commit();
    }
}
