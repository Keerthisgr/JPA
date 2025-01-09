package com.xworkz.hotelapp.findandupdate;

import com.xworkz.hotelapp.entity.HotelDetailsEntity;
import com.xworkz.hotelapp.entity.HotelManagementEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HotelManagementUpdateTester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            HotelManagementEntity hotelManagementEntity = em.find(HotelManagementEntity.class,1);
            if(hotelManagementEntity != null){
                hotelManagementEntity.setHotelName("Monsoon");
                hotelManagementEntity.setEmail("monsoon@gmail.com");
                hotelManagementEntity.setWebsite("monsoon.in");
                transaction.begin();
                em.merge(hotelManagementEntity);
                transaction.commit();
                em.close();
            }
        }catch (Exception e){
            transaction.rollback();
            e.getMessage();
        }
    }
}
