package com.xworkz.instituteapp.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "institute_details")
public class InstituteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "institute_name")
    private String instituteName;
    @Column(name="no_of_trainee")
    private Integer numberOfTrainee;
    private String location;
    @Column(name = "is_good")
    private Boolean isGood;

}
