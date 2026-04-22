/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designprinciples.solid.srp.bad;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jose
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean prestado;
    private String usuarioActual;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prestado = false;
    }
    
    public void prestar(String usuario) {
        if (prestado) {
            System.out.println("Libro ya está prestado");
            return;
        }
        this.prestado = true;
        this.usuarioActual = usuario;
        this.fechaPrestamo = new Date();
        System.out.println("Libro '" + titulo + "' prestado a " + usuario);
    }
    
    public void devolver() {
        if (!prestado) {
            System.out.println("Libro no estaba prestado");
            return;
        }
        this.prestado = false;
        this.fechaDevolucion = new Date();
        System.out.println("Libro '" + titulo + "' devuelto");
    }
    
    public double calcularMulta() {
        if (fechaDevolucion == null || fechaPrestamo == null) {
            return 0;
        }
        long diffInMillies = fechaDevolucion.getTime() - fechaPrestamo.getTime();
        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        
        if (diffInDays > 14) { // 14 días de préstamo máximo
            long diasRetraso = diffInDays - 14;
            return diasRetraso * 0.50; // $0.50 por día de retraso
        }
        return 0;
    }
    
     public void guardarEnArchivo() {
        // Guardar en sistema de archivos
        System.out.println("💾 Guardando libro '" + titulo + "' en archivo libros.txt");
    }
    
    public void cargarDeArchivo(String isbn) {
        // Código real: leer archivo, parsear, etc.
        System.out.println("📂 Cargando libro con ISBN " + isbn + " desde archivo");
    }
    
    public String generarReportePrestamo() {
        return String.format("""
            =================================
            REPORTE DE PRÉSTAMO
            =================================
            Título: %s
            Autor: %s
            ISBN: %s
            Usuario: %s
            Fecha préstamo: %s
            Fecha devolución: %s
            Multa: $%.2f
            =================================
            """,
            titulo, autor, isbn,
            usuarioActual != null ? usuarioActual : "N/A",
            fechaPrestamo != null ? fechaPrestamo : "N/A",
            fechaDevolucion != null ? fechaDevolucion : "No devuelto",
            calcularMulta()
        );
    }
    
    public void exportarAExcel() {
        // Código para generar Excel
        System.out.println("Exportando reporte a Excel: " + titulo + ".xls");
    }
    
    public void enviarNotificacionVencimiento() {
        if (prestado && fechaPrestamo != null) {
            long diffInDays = getDiasPrestamo();
            if (diffInDays > 10) { // 10 días, aviso de vencimiento próximo
                System.out.println("📧 Enviando email a " + usuarioActual);
                System.out.println("   Asunto: Tu préstamo de '" + titulo + "' está por vencer");
                System.out.println("   Mensaje: Debes devolverlo en " + (14 - diffInDays) + " días");
            }
        }
    }
    
    private long getDiasPrestamo() {
        Date ahora = new Date();
        long diff = ahora.getTime() - fechaPrestamo.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public boolean isValidISBN() {
        return isbn != null && isbn.matches("\\d{13}"); // ISBN-13: 13 dígitos
    }
    
    public boolean puedeSerPrestado() {
        return !prestado && isValidISBN();
    }
    
    // Getters
    public String getTitulo() { return titulo; }
    public String getUsuarioActual() { return usuarioActual; }
}


