/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.lsp.bad;

/**
 *
 * @author jose
 */
public class Rectangulo {

    protected double ancho;
    protected double alto;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }
}
