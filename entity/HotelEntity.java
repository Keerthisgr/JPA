package com.xworkz.hotelapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotel_management")
public class HotelEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "location")
    private String location;
    @Column(name = "pincode")
    private Integer pincode;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "c_no")
    private Long contactNumber;
    @Column(name = "type")
    private String type;
}
