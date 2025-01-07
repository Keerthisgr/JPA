package com.xworkz.accountapp.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Akshatha");
    }
}
