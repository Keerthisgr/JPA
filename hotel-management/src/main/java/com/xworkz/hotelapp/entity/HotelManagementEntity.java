package com.xworkz.hotelapp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name="hotel")
public class HotelManagementEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String hotelName;
    @Column(name ="location")
    private String location;
    @Column(name = "c_no")
    private String contactNumber;
    @Column(name = "email")
    private String email;
    @Column (name = "website")
    private String website;
    @Column(name = "check_in_time")
    private String checkInTime;
    @Column(name = "check_out_time")
    private String checkOutTime;
}
