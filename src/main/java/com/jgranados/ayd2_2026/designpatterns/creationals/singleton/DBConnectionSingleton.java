/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designpatterns.creationals.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jose
 */
public class DBConnectionSingleton {
    private static final String IP = "localhost";
    private static final int PUERTO = 3306;
    private static final String SCHEMA = "hospidb";
    public static final String USER_NAME = "admindba";
    public static final String PASSWORD = "12345";
    public static final String URL = "jdbc:mysql://"
            + IP + ":" + PUERTO + "/" + SCHEMA;
    
    private static DBConnectionSingleton instance;
    
    private Connection connection;
    
    private DBConnectionSingleton() {
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            // manejamos la exception
            System.out.println("Error al conectarse");
            e.printStackTrace();
        }
    }
    
    public static DBConnectionSingleton getInstance() {
        if (instance == null) {
            instance = new DBConnectionSingleton();
        }
        return instance;
    }
    
    public Connection getConnection() {
        return connection;
    }
}
