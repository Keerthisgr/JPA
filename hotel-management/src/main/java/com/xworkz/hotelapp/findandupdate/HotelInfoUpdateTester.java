package com.xworkz.hotelapp.findandupdate;

import com.xworkz.hotelapp.entity.HotelDetailsEntity;
import com.xworkz.hotelapp.entity.HotelInfoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HotelInfoUpdateTester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            HotelInfoEntity hotelInfoEntity = em.find(HotelInfoEntity.class,1);
            if(hotelInfoEntity != null){
                hotelInfoEntity.setName("Souparnika");
                hotelInfoEntity.setContactPersonName("Chaithra");
                transaction.begin();
                em.merge(hotelInfoEntity);
                transaction.commit();
                em.close();
            }
        }catch (Exception e){
            transaction.rollback();
            e.getMessage();
        }
    }
}
