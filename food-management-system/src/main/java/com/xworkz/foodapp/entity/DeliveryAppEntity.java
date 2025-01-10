package com.xworkz.foodapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "delivery_info")
public class DeliveryAppEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "app_name")
    private String appName;
    private String link;
    @Column(name = "is_good")
    private Boolean isGood;
    private Integer year;
}
