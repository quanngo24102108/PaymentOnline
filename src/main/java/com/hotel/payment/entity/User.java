package com.hotel.payment.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String passWord;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "role_id")
    private String roleName;
}
