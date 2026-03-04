/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.controllers.users;

import com.jgranados.ayd2_2026.dto.users.NewUserRequestDTO;
import com.jgranados.ayd2_2026.dto.users.UserResponseDTO;
import com.jgranados.ayd2_2026.services.users.UserService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose
 */
@RestController
@RequestMapping("/v1/users")
public class UsersController {
    
    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping
    //@PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<UserResponseDTO>> getAllUsers() {
        return ResponseEntity
                .ok(userService.findAllUsers());
    }
    
    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody NewUserRequestDTO newUser) {
        userService.createUser(newUser);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }
}