/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.ocp.good.descuentos;

import com.jgranados.ayd2_2026.designprinciples.solid.ocp.good.Descuento;

/**
 *
 * @author jose
 */
public class DescuentoTemporada implements Descuento {

    @Override
    public void aplicarDescuento(double precio) {
        System.out.println("Descuento temporada: "
                + (precio * 0.90));
    }
    
}
