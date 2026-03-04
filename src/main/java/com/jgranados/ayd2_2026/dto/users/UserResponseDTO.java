/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.dto.users;

import com.jgranados.ayd2_2026.enums.users.Role;
import com.jgranados.ayd2_2026.models.user.User;
import lombok.Value;

/**
 *
 * @author jose
 */
@Value
public class UserResponseDTO {
    private String username;
    private Role role;
    private String password;
    
    public UserResponseDTO(User userEntity) {
        username = userEntity.getUsername();
        role = userEntity.getRole();
        password = userEntity.getPassword();
    }
}
