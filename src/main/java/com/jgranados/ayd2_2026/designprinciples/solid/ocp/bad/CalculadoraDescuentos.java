/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.ocp.bad;

/**
 *
 * @author jose
 */
public class CalculadoraDescuentos {
    
    
    
    // Método que crece con SWITCH o IF-ELSE
    public double aplicarDescuento(double precio, TipoDescuento tipo) {
        switch (tipo) {
            case TEMPORADA:
                return precio * 0.90;  // 10% descuento
            
            case CLIENTE_FRECUENTE:
                return precio * 0.85;  // 15% descuento
                
            case BLACK_FRIDAY:
                return precio * 0.75;  // 25% descuento
            
            // nuevos descuentos black friday y cumplea;os
            
            default:
                return precio;
        }
    }
}
