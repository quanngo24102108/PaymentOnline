package com.hotel.payment.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "room")
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_number")
    private Integer roomNumber;

    @Column(name = "people_number")
    private Integer peopleNumber;

    @Column(name = "price")
    private Double price;

    @Column(name = "size")
    private String size;

    @Column(name = "bedroom_number")
    private Integer bedroomNumber;

    @Column(name = "bathroom_number")
    private Integer bathroomNumber;

    @Column(name = "has_balcony_terrace")
    private Boolean hasBalconyTerrace;

    @Column(name = "view")
    private String view;

    @Column(name = "has_excutive_longue_access")
    private Boolean hasExcutiveLongueAccess;
    @Column(name = "has_separate_shower_bathtub")
    private Boolean hasSeparateShowerBathtub;

    @Column(name = "has_kitchenette")
    private Boolean hasKitchenette;

    @Column(name = "bed_description")
    private String bedDescription;

    @Column(name = "grade")
    private Integer grade;


    @OneToOne(mappedBy = "room")
    private RoomRegister roomRegister;
}
