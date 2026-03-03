/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.controllers.drivers;

import com.jgranados.ayd2_2026.controllers.CommonMvcTest;
import com.jgranados.ayd2_2026.dto.drivers.DriverResponse;
import com.jgranados.ayd2_2026.exceptionhandler.ControllerExceptionHandler;
import com.jgranados.ayd2_2026.exceptions.NotFoundException;
import com.jgranados.ayd2_2026.models.driver.DriverEntity;
import com.jgranados.ayd2_2026.services.driver.DriverService;
import java.util.Collections;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 * @author jose
 */
@ContextConfiguration(classes = {DriverController.class, DriverService.class, ControllerExceptionHandler.class})
public class DriverControllerTest extends CommonMvcTest {

    private static final Integer DRIVER_ID = 1;
    private static final String DRIVER_NAME = "driver name";
    private static final int DRIVER_AGE = 21;

    @MockBean
    private DriverService driverService;

    @Test
    public void testFindAllDrivers() throws Exception {
        // Arrange
        DriverEntity driverEntity = new DriverEntity();
        driverEntity.setAge(DRIVER_AGE);
        driverEntity.setName(DRIVER_NAME);
        driverEntity.setId(DRIVER_ID);
        DriverResponse driverDTO = new DriverResponse(driverEntity);
        when(driverService.findAll()).thenReturn(Collections.singletonList(driverEntity));

        // Act
        mockMvc.perform(get("/v1/drivers"))
                // Assert
                .andExpect(status().isOk())
                .andExpect((result) -> {
                    String json = result.getResponse().getContentAsString();
                    Assertions.assertThat(json).isEqualTo(objectMapper.writeValueAsString(Collections.singletonList(driverDTO)));
                });
                /*.andExpect(MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(Collections.singletonList(driverDTO))));*/
    }

    @Test
    public void testDeleteDriver() throws Exception {
        // Act
        mockMvc.perform(delete("/v1/drivers/{driverId}", DRIVER_ID)
                /*.with(csrf())*/)
                // Assert
                .andExpect(status().isAccepted());
        verify(driverService).deleteDriver(DRIVER_ID);
    }

    @Test
    public void testDeleteDriverWhenDriverDoesNotExists() throws Exception {
        // Arrange
        doThrow(NotFoundException.class).when(driverService).deleteDriver(DRIVER_ID);

        // Act
        mockMvc.perform(delete("/v1/drivers/{driverId}", DRIVER_ID)
                /*.with(csrf())*/)
                // Assert
                .andExpect(status().isNotFound());
        verify(driverService).deleteDriver(DRIVER_ID);
    }
}
