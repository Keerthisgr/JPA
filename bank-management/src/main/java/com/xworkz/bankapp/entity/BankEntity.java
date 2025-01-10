package com.xworkz.bankapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="bank_information")
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "account_holder")
    private String AccountHolder;
    private Double balance;

}
