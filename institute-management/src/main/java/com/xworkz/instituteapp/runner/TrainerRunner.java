package com.xworkz.instituteapp.runner;

import com.xworkz.instituteapp.entity.TrainerEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TrainerRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usha");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        TrainerEntity trainerEntity = new TrainerEntity(1,"Devendra","GO19",25000.90,"Xworkz");
        List<TrainerEntity> list = new ArrayList<>();
        list.add(new TrainerEntity(null,"Omkar","BR12",25000.90,"Xworkz"));
        list.add(new TrainerEntity(null,"Hareesh","GO19",25000.90,"Xworkz"));
        list.add(new TrainerEntity(null,"Shantanu","BR12",25000.90,"Xworkz"));
        list.add(new TrainerEntity(null,"Lokesh","BR12",25000.90,"Xworkz"));

        entityManager.getTransaction().begin();
        for(TrainerEntity train : list) {
            entityManager.persist(train);
        }
//        entityManager.getTransaction().commit();
    }
}
