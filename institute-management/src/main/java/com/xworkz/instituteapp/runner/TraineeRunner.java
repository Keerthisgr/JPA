package com.xworkz.instituteapp.runner;

import com.xworkz.instituteapp.entity.TraineeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TraineeRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usha");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        TraineeEntity traineeEntity = new TraineeEntity(1,"Keerthi","GO19","MCA",2024);
        List<TraineeEntity> list = new ArrayList<>();
        list.add(new TraineeEntity(null,"Bhoomika","GO19","MCA",2024));
        list.add(new TraineeEntity(null,"Poojitha","GO19","MCA",2024));
        list.add(new TraineeEntity(null,"Manasa","GO19","BE",2024));
        list.add(new TraineeEntity(null,"Kavya","GO19","BE",2024));

        entityManager.getTransaction().begin();
        for(TraineeEntity traine : list) {
            entityManager.persist(traine);
        }
        entityManager.getTransaction().commit();
    }
}
