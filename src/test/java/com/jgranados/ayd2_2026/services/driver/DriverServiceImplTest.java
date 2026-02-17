/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.services.driver;

import com.jgranados.ayd2_2026.dto.drivers.DriverResponse;
import com.jgranados.ayd2_2026.dto.drivers.NewDriverRequest;
import com.jgranados.ayd2_2026.exceptions.DuplicatedEntityException;
import com.jgranados.ayd2_2026.models.driver.DriverEntity;
import com.jgranados.ayd2_2026.repositories.driver.DriverRepository;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author jose
 */
@ExtendWith(MockitoExtension.class)
public class DriverServiceImplTest {

    private static final String DRIVER_NAME = "Juanito Perez";
    private static final Integer DRIVER_AGE = 18;

    @Mock
    private DriverRepository repository;
    @InjectMocks
    private DriverServiceImpl driverService;

    @Test
    void testCreateDriver() throws Exception {
        // Arrange
        NewDriverRequest newDriverRequest = new NewDriverRequest(DRIVER_NAME, DRIVER_AGE);
        ArgumentCaptor<DriverEntity> driverCapture = ArgumentCaptor.forClass(DriverEntity.class);

        DriverEntity newDriverEntity = new DriverEntity();
        newDriverEntity.setName(DRIVER_NAME);
        newDriverEntity.setAge(DRIVER_AGE);
        when(repository.save(eq(newDriverEntity))).thenReturn(newDriverEntity);

        // Act
        DriverResponse result = driverService.create(newDriverRequest);

        // Assert
        assertAll(
                () -> verify(repository).save(driverCapture.capture()),
                () -> assertEquals(DRIVER_NAME, driverCapture.getValue().getName()),
                () -> assertEquals(DRIVER_AGE, driverCapture.getValue().getAge()),
                () -> assertEquals(DRIVER_NAME, result.getName()),
                () -> assertEquals(DRIVER_AGE, result.getAge())
        );

    }

    @Test
    void testCreateDriverWhenDuplicatedName() {
        // Arrange
        NewDriverRequest newDriver = new NewDriverRequest(DRIVER_NAME, DRIVER_AGE);

        when(repository.existsByName(DRIVER_NAME))
                .thenReturn(true);

        // Assert
        Assertions.assertThrows(DuplicatedEntityException.class,
                () -> driverService.create(newDriver));

    }

}
