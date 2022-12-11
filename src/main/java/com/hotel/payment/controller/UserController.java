package com.hotel.payment.controller;

import com.hotel.payment.dto.UserDTO;
import com.hotel.payment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> customers(Principal principal) {

        return new ResponseEntity<>(userService.getUser(), HttpStatus.OK);
    }
}
