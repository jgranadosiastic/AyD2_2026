/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jgranados.ayd2_2026.services.authentication;

import com.jgranados.ayd2_2026.dto.authentication.AuthenticationRequestDTO;
import com.jgranados.ayd2_2026.dto.authentication.JwtResponseDTO;

/**
 *
 * @author jose
 */
public interface AuthenticationService {
    
    JwtResponseDTO authenticateAndGetToken(AuthenticationRequestDTO authDTO);
}