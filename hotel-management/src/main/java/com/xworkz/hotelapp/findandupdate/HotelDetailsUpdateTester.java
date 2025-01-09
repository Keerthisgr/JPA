package com.xworkz.hotelapp.findandupdate;

import com.xworkz.hotelapp.entity.HotelDetailsEntity;
import com.xworkz.hotelapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HotelDetailsUpdateTester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            HotelDetailsEntity hotelDetailsEntity = em.find(HotelDetailsEntity.class,4);
            if(hotelDetailsEntity != null){
                hotelDetailsEntity.setName("Souparnika");
                hotelDetailsEntity.setAddress("R R Nagar");
                transaction.begin();
                em.merge(hotelDetailsEntity);
                transaction.commit();
                em.close();
            }
        }catch (Exception e){
            transaction.rollback();
            e.getMessage();
        }
    }
}
