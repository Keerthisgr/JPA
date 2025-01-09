package com.xworkz.hotelapp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "samrudhi")
public class SamrudhiHotelEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "dish_name")
    private String dishName;
    @Column(name = "price")
    private Double price;
    @Column(name = "description")
    private String description;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "category")
    private String category;
    @Column(name = "discount")
    private Double discount;
    @Column(name = "create_by")
    private String createdBy;
}
