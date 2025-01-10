package com.xworkz.foodapp.runner;

import com.xworkz.foodapp.entity.DeliveryAppEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class DeliveryRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Keerthi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        DeliveryAppEntity deliveryAppEntity = new DeliveryAppEntity(1,"Zomato","zomato.in",true,2012);
        List<DeliveryAppEntity> list = new ArrayList<>();
        list.add(new DeliveryAppEntity(null,"Swiggy","swiggy.in",false,2010));
        list.add(new DeliveryAppEntity(null,"Blinkit","blinkit.in",true,2018));
        list.add(new DeliveryAppEntity(null,"Flipcart","flipcart.in",true,2008));
        list.add(new DeliveryAppEntity(null,"Myntra","myntra.in",true,2016));

        entityManager.getTransaction().begin();
        for(DeliveryAppEntity deliveryApp : list) {
            entityManager.persist(deliveryApp);
        }
        entityManager.getTransaction().commit();
    }
}
