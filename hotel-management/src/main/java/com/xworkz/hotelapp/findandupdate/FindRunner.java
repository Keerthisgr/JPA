package com.xworkz.hotelapp.findandupdate;

import com.xworkz.hotelapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");
        EntityManager em = emf.createEntityManager();
        HotelEntity hotelEntity = em.find(HotelEntity.class,2);
        System.out.println(hotelEntity);
    }
}
