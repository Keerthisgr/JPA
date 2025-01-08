package com.xworkz.hotelapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "another_table")
public class HotelDetailsEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "no_of_rooms")
    private Integer numberOfRooms;
    @Column(name = "no_of_floors")
    private Integer numberOfFloors;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "no_of_reviews")
    private Integer totalReviews;
    @Column(name = "payment_mode")
    private String acceptedPaymentMethods;


}
