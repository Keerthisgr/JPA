package com.xworkz.bankapp.runner;

import com.xworkz.bankapp.entity.BankEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class BankRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kiran");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        BankEntity bankEntity = new BankEntity(1,"AXIS","Current","Bhoomika",9000.90);

        List<BankEntity> list = new ArrayList<>();
        list.add(new BankEntity(null, "HDFC", "Savings", "Abhigna", 8900.90));
        list.add(new BankEntity(null, "SBI", "Current", "Abhinav", 9000.90));
        list.add(new BankEntity(null, "Union", "Current", "Akshatha", 19890.90));
        list.add(new BankEntity(null, "Indian", "Saving", "Akhila", 3460.90));
        list.add(new BankEntity(null, "Canara", "Current", "Asha", 3400.90));

        entityManager.getTransaction().begin();
        for (BankEntity be : list) {

//        entityManager.persist(bankEntity);
            entityManager.persist(be);
        }
//            entityManager.getTransaction().commit();
//    }



    }
}
