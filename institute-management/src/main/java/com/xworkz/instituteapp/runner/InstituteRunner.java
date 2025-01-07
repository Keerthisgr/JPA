package com.xworkz.instituteapp.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InstituteRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usha");

    }
}
