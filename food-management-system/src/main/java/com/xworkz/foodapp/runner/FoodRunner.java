package com.xworkz.foodapp.runner;

import com.xworkz.foodapp.entity.FoodEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class FoodRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Keerthi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        FoodEntity foodEntity = new FoodEntity(1,"Biriyani",280.90,true,"Zomato");
        List<FoodEntity> list = new ArrayList<>();
        list.add(new FoodEntity(null,"Edli",120.90,true,"Swiggy"));
        list.add(new FoodEntity(null,"Palav",220.90,true,"Swiggy"));
        list.add(new FoodEntity(null,"Roti",80.90,true,"Zomato"));
        list.add(new FoodEntity(null,"Egg Biriyani",180.90,true,"Zomato"));

        entityManager.getTransaction().begin();
        for(FoodEntity food : list) {
            entityManager.persist(food);
        }
//        entityManager.getTransaction().commit();
    }
}
