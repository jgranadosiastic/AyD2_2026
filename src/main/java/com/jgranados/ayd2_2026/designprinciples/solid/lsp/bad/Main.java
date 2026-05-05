/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.lsp.bad;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== VIOLACIÓN DE LSP ===\n");

        System.out.println("Con Rectángulo:");
        procesarRectangulo(new Rectangulo());

        System.out.println("\nCon Cuadrado:");
        procesarRectangulo(new Cuadrado());
    }

    // Método que trabaja con Rectángulos
    public static void procesarRectangulo(Rectangulo rect) {
        if (rect instanceof Cuadrado) {
            rect.setAncho(5);
        } else {
            rect.setAncho(5);
            rect.setAlto(4);
        }
        double area = rect.calcularArea();

        System.out.println("Área esperada: 20");
        System.out.println("Área obtenida: " + area);

        if (area != 20) {
            System.out.println("Aqui no puedo sustituir Cuadrado por Rectángulo!");
        }
    }
}
