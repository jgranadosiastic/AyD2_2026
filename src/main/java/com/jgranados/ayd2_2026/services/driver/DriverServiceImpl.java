/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.services.driver;

import com.jgranados.ayd2_2026.dto.drivers.DriverResponse;
import com.jgranados.ayd2_2026.dto.drivers.NewDriverRequest;
import com.jgranados.ayd2_2026.dto.drivers.UpdateDriverRequest;
import com.jgranados.ayd2_2026.exceptions.DuplicatedEntityException;
import com.jgranados.ayd2_2026.exceptions.NotFoundException;
import com.jgranados.ayd2_2026.models.driver.DriverEntity;
import com.jgranados.ayd2_2026.repositories.driver.DriverRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jose
 */
@Service
public class DriverServiceImpl implements DriverService {

    private final DriverRepository repository;

    @Autowired
    public DriverServiceImpl(DriverRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public DriverResponse create(NewDriverRequest newDriverRequest) throws DuplicatedEntityException {
        
        if (repository.existsByName(newDriverRequest.getName())) {
            throw new DuplicatedEntityException(".......");
        }
        
        DriverEntity newEntity = newDriverRequest.createEntity();
        
        newEntity = repository.save(newEntity);
        
        return new DriverResponse(newEntity);
    }

    @Override
    public DriverEntity getById(Integer id) throws NotFoundException {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Driver not found"));
    }

    @Override
    public List<DriverEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteDriver(Integer id) throws NotFoundException {
        DriverEntity driver = getById(id);
        repository.deleteById(driver.getId());
    }

    @Override
    public DriverResponse updateDriver(Integer id, UpdateDriverRequest dataToUpdate) throws NotFoundException, DuplicatedEntityException {
        DriverEntity driverToUpdate = getById(id);
        boolean exits = repository.existsDriverToUpdateWithName(id, dataToUpdate.getName());
        
        if (exits) {
            throw new DuplicatedEntityException("Driver already exits.");
        }
        
        driverToUpdate.setName(dataToUpdate.getName());
        driverToUpdate.setAge(dataToUpdate.getAge());
        
        repository.save(driverToUpdate);
        
        return new DriverResponse(driverToUpdate);
    }
    
    
}
