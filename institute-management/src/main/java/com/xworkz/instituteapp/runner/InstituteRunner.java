package com.xworkz.instituteapp.runner;

import com.xworkz.instituteapp.entity.InstituteEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class InstituteRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usha");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        InstituteEntity institute = new InstituteEntity(1,"Xworkz",12,"Rajaji Nagar",true);

        List<InstituteEntity> list = new ArrayList<>();
        list.add(new InstituteEntity(null,"JSpiders",68,"Rajaji Nagar",true));
        list.add(new InstituteEntity(null,"Besant",52,"Rajaji Nagar",true));
        list.add(new InstituteEntity(null,"JetKing",25,"Rajaji Nagar",true));
        list.add(new InstituteEntity(null,"Tap",72,"Rajaji Nagar",true));

        entityManager.getTransaction().begin();
        for(InstituteEntity l : list){
            entityManager.persist(l);
        }
//        entityManager.getTransaction().commit();


    }
}
