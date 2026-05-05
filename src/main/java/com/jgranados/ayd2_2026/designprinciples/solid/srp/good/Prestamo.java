/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.srp.good;

import com.jgranados.ayd2_2026.designprinciples.solid.srp.bad.Libro;
import java.util.Date;

/**
 *
 * @author jose
 */
public class Prestamo {
    
    
    private String usuarioActual;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Libro libro;
    /*
    // 2. Responsabilidad de registrar prestamo
    public void prestar(String usuario, Libro libro) {
        if (libro.isPrestado()) {
            System.out.println("Libro ya está prestado");
            return;
        }
        libro.setPrestar(true);
        this.usuarioActual = usuario;
        this.fechaPrestamo = new Date();
        System.out.println("Libro '" + libro.getTitulo() + "' prestado a " + usuario);
    }
    
    
    // 3. Responsabilidad de registrar devolucion
    public void devolver() {
        if (!prestado) {
            System.out.println("Libro no estaba prestado");
            return;
        }
        this.prestado = false;
        this.fechaDevolucion = new Date();
        System.out.println("Libro '" + titulo + "' devuelto");
    }*/
}
