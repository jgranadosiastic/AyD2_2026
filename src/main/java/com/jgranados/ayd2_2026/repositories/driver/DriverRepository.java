/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jgranados.ayd2_2026.repositories.driver;

import com.jgranados.ayd2_2026.models.driver.DriverEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jose
 */
@Repository
public interface DriverRepository extends JpaRepository<DriverEntity, Integer>{
    List<DriverEntity> findByName(String name);
    boolean existsByName(String name);
    
    @Query("SELECT CASE WHEN COUNT(de) > 0 THEN true ELSE false END FROM Driver de WHERE de.id <> :id AND de.name = :name")
    boolean existsDriverToUpdateWithName(@Param("id") Integer id, @Param("name") String name);
}
