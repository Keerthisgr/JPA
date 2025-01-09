package com.xworkz.hotelapp.findandupdate;

import com.xworkz.hotelapp.entity.HotelDetailsEntity;
import com.xworkz.hotelapp.entity.HotelInfoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HotelInfoFindTester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");
        EntityManager em = emf.createEntityManager();
        HotelInfoEntity hotelInfoEntity = em.find(HotelInfoEntity.class,5);
        System.out.println(hotelInfoEntity);
    }
}
