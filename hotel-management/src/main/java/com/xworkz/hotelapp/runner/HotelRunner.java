package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.entity.HotelDetailsEntity;
import com.xworkz.hotelapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HotelRunner {
    public static void main(String[] args) {
        HotelEntity hotelEntity = new HotelEntity();
//        hotelEntity.setId(8);
//        hotelEntity.setHotelName("Vidarthi bhavan");
//        hotelEntity.setContactNumber(9986886892L);
//        hotelEntity.setRating(5.0);
//        hotelEntity.setType("Veg");
//        hotelEntity.setLocation("Karnataka sanga");
//        hotelEntity.setPincode(577406);

        HotelDetailsEntity hotelDetailsEntity = new HotelDetailsEntity();
        hotelDetailsEntity.setId(7);
        hotelDetailsEntity.setName("Monsoon");
        hotelDetailsEntity.setAddress("Sagara");
        hotelDetailsEntity.setNumberOfRooms(12);
        hotelDetailsEntity.setNumberOfFloors(2);
        hotelDetailsEntity.setRating(5.0);
        hotelDetailsEntity.setTotalReviews(1218);
        hotelDetailsEntity.setAcceptedPaymentMethods("Online and offline");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("keerthi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotelDetailsEntity);
        entityManager.getTransaction().commit();
    }
}
