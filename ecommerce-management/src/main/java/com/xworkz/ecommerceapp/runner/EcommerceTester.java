package com.xworkz.ecommerceapp.runner;

import com.xworkz.ecommerceapp.entity.EcommerceEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class EcommerceTester {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Sowmya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EcommerceEntity ecommerceEntity = new EcommerceEntity(1,"T-shirt",250.80,"Dress",4.6);
        List<EcommerceEntity> list = new ArrayList<>();
        list.add(new EcommerceEntity(null,"Ring",4500.90,"Jewellary",5.0));
        list.add(new EcommerceEntity(null,"Chain",8500.90,"Jewellary",4.0));
        list.add(new EcommerceEntity(null,"Bracelet",3500.90,"Jewellary",3.5));
        list.add(new EcommerceEntity(null,"Anklet",7500.90,"Jewellary",5.0));

        entityManager.getTransaction().begin();
        for(EcommerceEntity ecmm : list) {
            entityManager.persist(ecmm);
        }
        entityManager.getTransaction().commit();
    }
}
