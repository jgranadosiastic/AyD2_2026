/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.dto.users;

import com.jgranados.ayd2_2026.enums.users.Role;
import com.jgranados.ayd2_2026.models.user.User;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

/**
 *
 * @author jose
 */
@Value
public class NewUserRequestDTO {

    @NotBlank
    private final String username;
    @NotBlank
    private final String email;
    @NotBlank
    private final Role role;
    @NotBlank
    private final String password;
    
    public User createUserEntity() {
        User user = new User();
        user.setEmail(getEmail());
        user.setUsername(getUsername());
        user.setRole(getRole());
        
        return user;
    }
}
