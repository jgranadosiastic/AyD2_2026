/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.ocp.bad;

/**
 *
 * @author jose
 */
public class Tienda {

    public static void main(String[] args) {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();

        double precio = 100.0;

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento temporada: "
                + calc.aplicarDescuento(precio, TipoDescuento.TEMPORADA));
        System.out.println("Descuento cliente frecuente: "
                + calc.aplicarDescuento(precio, TipoDescuento.CLIENTE_FRECUENTE));
        
        System.out.println("Descuento Black friday: "
                + calc.aplicarDescuento(precio, TipoDescuento.BLACK_FRIDAY));
    }
}
