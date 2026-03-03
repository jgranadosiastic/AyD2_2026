/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.dto.drivers;

import com.jgranados.ayd2_2026.models.driver.DriverEntity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Value;

/**
 *
 * @author jose
 */
@Value
public class NewDriverRequest {
    @NotEmpty
    String name;
    @Min(1)
    Integer age;    
    
    public DriverEntity createEntity() {
        DriverEntity newEntity = new DriverEntity();
        newEntity.setName(getName());
        newEntity.setAge(getAge());
        
        return newEntity;
    }
}
