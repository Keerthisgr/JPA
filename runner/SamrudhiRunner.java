package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.entity.HotelEntity;
import com.xworkz.hotelapp.entity.HotelManagementEntity;
import com.xworkz.hotelapp.entity.SamrudhiHotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SamrudhiRunner {
    public static void main(String[] args) {

        SamrudhiHotelEntity samrudhiHotelEntity = new SamrudhiHotelEntity();
//        samrudhiHotelEntity.setId(7);
//        samrudhiHotelEntity.setDishName("Biriyani");
//        samrudhiHotelEntity.setCategory("Veg");
//        samrudhiHotelEntity.setPrice(220.80);
//        samrudhiHotelEntity.setDescription("vegetables");
//        samrudhiHotelEntity.setDiscount(10.90);
//        samrudhiHotelEntity.setQuantity(1);
//        samrudhiHotelEntity.setCreatedBy("samrudhi");

        HotelManagementEntity hotelManagementEntity = new HotelManagementEntity();
        hotelManagementEntity.setId(7);
        hotelManagementEntity.setHotelName("Ashoka");
        hotelManagementEntity.setEmail("ashok@gmail.com");
        hotelManagementEntity.setWebsite("ashoka.com");
        hotelManagementEntity.setLocation("B H Road");
        hotelManagementEntity.setContactNumber("9006114565");
        hotelManagementEntity.setCheckInTime("8:00AM");
        hotelManagementEntity.setCheckOutTime("11:00PM");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("keerthi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotelManagementEntity);
        entityManager.getTransaction().commit();
    }
}

