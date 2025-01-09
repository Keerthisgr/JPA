package com.xworkz.hotelapp.findandupdate;

import com.xworkz.hotelapp.entity.HotelEntity;
import com.xworkz.hotelapp.entity.SamrudhiHotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SamrudhiHotelFindTester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");
        EntityManager em = emf.createEntityManager();
        SamrudhiHotelEntity samrudhiHotelEntity = em.find(SamrudhiHotelEntity.class,5);
        System.out.println(samrudhiHotelEntity);
    }
}
