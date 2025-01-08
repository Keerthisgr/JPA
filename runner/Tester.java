package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.entity.HotelInfoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {
    public static void main(String[] args) {
        HotelInfoEntity hotelInfoEntity = new HotelInfoEntity();
        hotelInfoEntity.setId(7);
        hotelInfoEntity.setName("Om shanthi");
        hotelInfoEntity.setNumberOfRooms(12);
        hotelInfoEntity.setHotelType("Luxury");
        hotelInfoEntity.setLocation("Shree Nagar");
        hotelInfoEntity.setRoomCategories("Single");
        hotelInfoEntity.setContactPersonPosition("Manager");
        hotelInfoEntity.setContactPersonName("Shashi");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("keerthi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotelInfoEntity);
        entityManager.getTransaction().commit();
    }
}
