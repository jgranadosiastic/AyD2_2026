/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.srp.bad;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "9780156012195");
        
        // La misma clase hace TODO
        libro.prestar("Juan Pérez");
        libro.enviarNotificacionVencimiento();
        libro.devolver();
        System.out.println(libro.generarReportePrestamo());
        libro.guardarEnArchivo();
        libro.exportarAExcel();
        
        // PROBLEMAS IDENTIFICABLES:
        System.out.println("\n🔴 PROBLEMAS:");
        System.out.println("1. Libro conoce demasiado: préstamos, multas, archivos, emails, Excel");
        System.out.println("2. Si cambia el cálculo de multas, toco Libro (puedo romper préstamos)");
        System.out.println("3. Si cambia el formato de reporte, toco Libro (puedo romper validaciones)");
        System.out.println("4. Difícil probar: cada test arrastra todas las dependencias");
        System.out.println("5. Violación de SRP: múltiples razones para modificar Libro");
    }
}
