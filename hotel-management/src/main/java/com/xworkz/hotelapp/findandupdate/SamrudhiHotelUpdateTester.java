package com.xworkz.hotelapp.findandupdate;

import com.xworkz.hotelapp.entity.HotelEntity;
import com.xworkz.hotelapp.entity.SamrudhiHotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SamrudhiHotelUpdateTester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            SamrudhiHotelEntity samrudhiHotelEntity = em.find(SamrudhiHotelEntity.class,2);
            if(samrudhiHotelEntity != null){
                samrudhiHotelEntity.setDishName("Kesaribath");
                samrudhiHotelEntity.setDescription("Sweet");
                transaction.begin();
                em.merge(samrudhiHotelEntity);
                transaction.commit();
                em.close();
            }
        }catch (Exception e){
            transaction.rollback();
            e.getMessage();
        }
    }
}
