package com.xworkz.ecommerceapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ecommerce_product")
public class ProductEntity {
    @Id
    private Integer id;
    @Column(name = "product_name")
    private String productName;
    private String type;
    @Column(name = "is_good")
    private Boolean isGood;
    private Double price;
}
