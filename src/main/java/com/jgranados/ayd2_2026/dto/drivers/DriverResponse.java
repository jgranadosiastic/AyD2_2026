/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.dto.drivers;

import com.jgranados.ayd2_2026.models.driver.DriverEntity;
import lombok.Value;

/**
 *
 * @author jose
 */
@Value
public class DriverResponse {
    private Integer id;
    private String name;
    private Integer age;

    public DriverResponse(DriverEntity newEntity) {
        this.age = newEntity.getAge();
        this.name = newEntity.getName();
        this.id = newEntity.getId();
    }
}
