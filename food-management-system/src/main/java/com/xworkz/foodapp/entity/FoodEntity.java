package com.xworkz.foodapp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "food_details")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "food_name")
    private String foodName;
    private Double price;
    @Column(name = "is_good")
    private Boolean isGood;
    @Column(name = "app_name")
    private String appName;
}
