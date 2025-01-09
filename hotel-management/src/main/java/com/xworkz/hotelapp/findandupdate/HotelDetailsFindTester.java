package com.xworkz.hotelapp.findandupdate;

import com.xworkz.hotelapp.entity.HotelDetailsEntity;
import com.xworkz.hotelapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HotelDetailsFindTester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");
        EntityManager em = emf.createEntityManager();
        HotelDetailsEntity hotelDetailsEntity = em.find(HotelDetailsEntity.class,4);
        System.out.println(hotelDetailsEntity);
    }

}
