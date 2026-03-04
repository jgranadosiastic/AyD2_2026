/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.services.users;

import com.jgranados.ayd2_2026.dto.users.UserResponseDTO;
import com.jgranados.ayd2_2026.dto.users.NewUserRequestDTO;
import com.jgranados.ayd2_2026.models.user.User;
import com.jgranados.ayd2_2026.repositories.users.UserRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author jose
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository repository,
            PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return repository.findById(username);
    }

    @Override
    public void createUser(NewUserRequestDTO newUser) {
        // TODO validation
        User user = newUser.createUserEntity();
        user.setPassword(passwordEncoder.encode(newUser.getPassword()));
        
        repository.save(user);
    }

    @Override
    public List<UserResponseDTO> findAllUsers() {
        return repository.findAll().stream()
                .map(UserResponseDTO::new)
                .collect(Collectors.toList());
    }
}
