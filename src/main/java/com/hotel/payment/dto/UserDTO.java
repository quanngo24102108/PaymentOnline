package com.hotel.payment.dto;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@ApiResponse
@ToString(exclude = {})
@EqualsAndHashCode(callSuper = false, of = {"id"})
public class UserDTO {
    private Long id;

    private String userName;
    private String passWord;

    private Integer phone;
    private String email;

    private String address;

    private String roleName;
}
