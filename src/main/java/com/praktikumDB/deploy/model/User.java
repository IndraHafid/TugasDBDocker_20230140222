package com.praktikumDB.deploy.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "20230140222_users")
public class User {
    @Id
    private String id;
    private String name;
    private String nim;
}
