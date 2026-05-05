/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.lsp.bad;

/**
 *
 * @author jose
 */
public class Cuadrado extends Rectangulo {

    @Override
    public void setAncho(double ancho) {
        this.ancho = ancho;
        this.alto = ancho;
    }

    @Override
    public void setAlto(double alto) {
        this.ancho = alto;
        this.alto = alto;
    }
}
