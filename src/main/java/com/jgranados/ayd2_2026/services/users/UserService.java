/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jgranados.ayd2_2026.services.users;

import com.jgranados.ayd2_2026.dto.users.NewUserRequestDTO;
import com.jgranados.ayd2_2026.dto.users.UserResponseDTO;
import com.jgranados.ayd2_2026.models.user.User;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author jose
 */
public interface UserService {
    
    Optional<User> findByUsername(String username);
    
    void createUser(NewUserRequestDTO newUser);
    
    List<UserResponseDTO> findAllUsers();
}
