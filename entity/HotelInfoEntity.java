package com.xworkz.hotelapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hotel_info")
public class HotelInfoEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "no_of_rooms")
    private Integer numberOfRooms;
    @Column(name = "room_category")
    private String roomCategories;
    @Column(name = "contact_person")
    private String contactPersonName;
    @Column(name = "contact_person_position")
    private String contactPersonPosition;
    @Column (name = "hotel_type")
    private String hotelType;
}
