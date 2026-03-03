/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.controllers.drivers;

import com.jgranados.ayd2_2026.dto.drivers.DriverResponse;
import com.jgranados.ayd2_2026.dto.drivers.NewDriverRequest;
import com.jgranados.ayd2_2026.dto.drivers.UpdateDriverRequest;
import com.jgranados.ayd2_2026.exceptions.DuplicatedEntityException;
import com.jgranados.ayd2_2026.exceptions.NotFoundException;
import com.jgranados.ayd2_2026.exceptions.ServiceException;
import com.jgranados.ayd2_2026.models.driver.DriverEntity;
import com.jgranados.ayd2_2026.services.driver.DriverService;
import java.util.List;
import javax.sql.rowset.serial.SerialException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose
 */
@RestController
@RequestMapping("/v1/drivers")
public class DriverController {

    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping
    public ResponseEntity<DriverResponse> createDriver(@RequestBody NewDriverRequest newDriver)
            throws DuplicatedEntityException {
        DriverResponse response;

        response = driverService.create(newDriver);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DriverResponse> getDriverById(@PathVariable("id") Integer driverId) throws NotFoundException {
        DriverEntity driver = driverService.getById(driverId);
        DriverResponse driverResponse = new DriverResponse(driver);

        return ResponseEntity.ok(driverResponse);
    }

    @GetMapping
    public ResponseEntity<List<DriverResponse>> findAllDrivers() {
        List<DriverResponse> dtos = driverService.findAll().stream()
                .map(DriverResponse::new)
                .toList();
        
        return ResponseEntity.ok(dtos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDriver(@PathVariable("id") Integer driverId)
            throws NotFoundException {
        driverService.deleteDriver(driverId);
        
        return ResponseEntity.accepted().build();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<DriverResponse> updateDriver(@PathVariable("id") Integer id,
            @RequestBody UpdateDriverRequest data) throws ServiceException {
        DriverResponse driverUpdated = driverService.updateDriver(id, data);
        
        return ResponseEntity.ok(driverUpdated);
    }

}
