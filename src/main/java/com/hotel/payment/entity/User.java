package com.hotel.payment.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hotel.payment.constant.ICommonConstants;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

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

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "surname")
    private String surName;

    @Column(name = "phone")
    private Integer phone;
    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "status")
    private String status;

    @Column(name = "last_pwd_change")
    @DateTimeFormat(pattern = ICommonConstants.LOCAL_DATE_TIME_FORMAT)
    @JsonFormat(pattern = ICommonConstants.LOCAL_DATE_TIME_FORMAT)
    private LocalDateTime lastPwdChange;

    @CreatedDate
    @Column(name = "created_date")
    @DateTimeFormat(pattern = ICommonConstants.LOCAL_DATE_TIME_FORMAT)
    @JsonFormat(pattern = ICommonConstants.LOCAL_DATE_TIME_FORMAT)
    private LocalDateTime createdDate;

    @CreatedBy
    @Column(name = "created_by")
    private Integer createdBy;

    @LastModifiedDate
    @Column(name = "updated_date")
    @DateTimeFormat(pattern = ICommonConstants.LOCAL_DATE_TIME_FORMAT)
    @JsonFormat(pattern = ICommonConstants.LOCAL_DATE_TIME_FORMAT)
    private LocalDateTime updatedDate;

    @LastModifiedBy
    @Column(name = "updated_by")
    private Integer updatedBy;
    @Column(name = "role_id")
    private String roleName;
}
