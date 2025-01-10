package com.xworkz.ecommerceapp.runner;

import com.xworkz.ecommerceapp.entity.EcommerceEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Sowmya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EcommerceEntity ecommerceEntity = new EcommerceEntity(1,"Smart Phone",18000.90,"Electronic gadgets",4.5);
        List<EcommerceEntity> list = new ArrayList<>();
        list.add(new EcommerceEntity(null,"Smart watch",3450.90,"Electronic gadget",3.5));
        list.add(new EcommerceEntity(null,"Washing machine",43450.90,"Electronic gadget",4.5));
        list.add(new EcommerceEntity(null,"Iron box",5400.90,"Electronic gadget",5.0));
        list.add(new EcommerceEntity(null,"Television",23750.90,"Electronic gadget",4.5));


        entityManager.getTransaction().begin();
        for (EcommerceEntity ecm : list) {
            entityManager.persist(ecm);
        }
//        entityManager.persist(ecommerceEntity);
//        entityManager.getTransaction().commit();
    }
}
