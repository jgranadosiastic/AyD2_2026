/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.ocp.good;

import com.jgranados.ayd2_2026.designprinciples.solid.ocp.bad.*;

/**
 *
 * @author jose
 */
public class CalculadoraDescuentos {
    
    
    
    public void aplicarDescuento(double precio, Descuento descuento) {
        descuento.aplicarDescuento(precio);
    }
}
