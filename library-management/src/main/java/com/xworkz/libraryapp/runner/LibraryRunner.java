package com.xworkz.libraryapp.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LibraryRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ramesh");
    }
}
