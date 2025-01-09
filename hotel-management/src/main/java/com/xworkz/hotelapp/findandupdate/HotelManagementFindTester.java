package com.xworkz.hotelapp.findandupdate;

import com.xworkz.hotelapp.entity.HotelEntity;
import com.xworkz.hotelapp.entity.HotelManagementEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HotelManagementFindTester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("keerthi");
        EntityManager em = emf.createEntityManager();
        HotelManagementEntity hotelManagementEntity = em.find(HotelManagementEntity.class,2);
        System.out.println(hotelManagementEntity);
    }
}
