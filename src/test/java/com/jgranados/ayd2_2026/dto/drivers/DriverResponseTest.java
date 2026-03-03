/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.jgranados.ayd2_2026.dto.drivers;

import com.jgranados.ayd2_2026.models.driver.DriverEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jose
 */
public class DriverResponseTest {
    
    private static final Integer DRIVER_ID = 1;
    private static final String DRIVER_NAME = "name";
    private static final int DRIVER_AGE = 2;

    @Test
    void testConstructor() {
        // Arrange
        DriverEntity driver = new DriverEntity();
        driver.setId(DRIVER_ID);
        driver.setName(DRIVER_NAME);
        driver.setAge(DRIVER_AGE);

        // Act
        DriverResponse result = new DriverResponse(driver);

        // Assert
        assertAll(
                () -> assertEquals(DRIVER_ID, result.getId()),
                () -> assertEquals(DRIVER_NAME, result.getName()),
                () -> assertEquals(DRIVER_AGE, result.getAge())
        );
    }
    
}
