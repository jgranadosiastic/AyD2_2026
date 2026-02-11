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
public class NewDriverRequest {
    String name;
    Integer age;
    
    
    
    public DriverEntity createEntity() {
        DriverEntity newEntity = new DriverEntity();
        newEntity.setName(getName());
        newEntity.setAge(getAge());
        
        return newEntity;
    }
}
