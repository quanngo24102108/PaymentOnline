package com.hotel.payment.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "room_register")
@Data
public class RoomRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Integer userId;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Room room;

}
