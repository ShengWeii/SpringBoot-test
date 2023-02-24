package com.springboot.test.User.Enity;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;

    @Column(name = "account")
    private Integer account;

    @Column(name="password")
    private Integer password;
}
