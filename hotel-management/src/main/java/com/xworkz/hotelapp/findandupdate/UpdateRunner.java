package com.xworkz.hotelapp.findandupdate;

import com.xworkz.hotelapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            HotelEntity hotelEntity = em.find(HotelEntity.class,7);
            if(hotelEntity != null){
                hotelEntity.setHotelName("Monsoon");
                transaction.begin();
                em.merge(hotelEntity);
                transaction.commit();
                em.close();
            }
        }catch (Exception e){
            transaction.rollback();
            e.getMessage();
        }
    }
}
