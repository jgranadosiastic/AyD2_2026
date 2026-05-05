/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.lsp.good;

/**
 *
 * @author jose
 */
public class MAin {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(5, 4);
        Cuadrado cuadrado = new Cuadrado(4);
        
        procesarFigura(cuadrado);
        procesarFigura(rec);
        
    }
    
    public static void procesarFigura(FiguraGEometrica figura) {
        double area = figura.calcularArea();
        System.out.println("ARea de figura: " + area);
    }
}
