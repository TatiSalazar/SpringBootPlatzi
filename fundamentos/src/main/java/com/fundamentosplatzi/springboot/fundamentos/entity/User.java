package com.fundamentosplatzi.springboot.fundamentos.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name="id_user", nullable = false, unique = true)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String email;

    @Column(length = 50)
    private String birthDate;

   
}