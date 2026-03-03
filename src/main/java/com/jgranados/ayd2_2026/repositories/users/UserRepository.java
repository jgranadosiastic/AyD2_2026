/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jgranados.ayd2_2026.repositories.users;


import com.jgranados.ayd2_2026.models.user.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jose
 */
public interface UserRepository extends CrudRepository<User, String> {
    
    List<User> findAll();
}
