/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jgranados.ayd2_2026.services.driver;

import com.jgranados.ayd2_2026.dto.drivers.NewDriverRequest;
import com.jgranados.ayd2_2026.exceptions.DuplicatedEntityException;
import com.jgranados.ayd2_2026.models.driver.DriverEntity;



/**
 *
 * @author jose
 */
public interface DriverService {
    
    void create(NewDriverRequest newDriverRequest) throws DuplicatedEntityException;
    
    DriverEntity getById(Integer id);
    
}
