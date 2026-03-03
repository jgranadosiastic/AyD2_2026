/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.models.user;

import com.jgranados.ayd2_2026.enums.users.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jose
 */
@Entity(name = "User")
@Table(name = "user_data")
@Data
@NoArgsConstructor
public class User {
    @Id
    @Column
    private String username;
    @Column
    private String email;
    @Column
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column
    private String password;
    @Column
    private LocalDateTime tokenExpiration;
    @Column
    private String token;
}
