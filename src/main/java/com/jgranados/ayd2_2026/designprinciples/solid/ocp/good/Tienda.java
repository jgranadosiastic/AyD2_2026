/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.ocp.good;

import com.jgranados.ayd2_2026.designprinciples.solid.ocp.good.descuentos.DescuentoTemporada;


/**
 *
 * @author jose
 */
public class Tienda {

    public static void main(String[] args) {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();

        double precio = 100.0;

        System.out.println("Precio original: " + precio);
        Descuento temporada = new DescuentoTemporada();
        calc.aplicarDescuento(precio, temporada);
    }
}
