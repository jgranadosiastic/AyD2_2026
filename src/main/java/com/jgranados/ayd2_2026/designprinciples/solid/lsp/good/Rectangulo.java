/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.lsp.good;

/**
 *
 * @author jose
 */
public class Rectangulo extends FiguraGEometrica {
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public void setAncho(double ancho) { this.ancho = ancho; }
    public void setAlto(double alto) { this.alto = alto; }
    
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
