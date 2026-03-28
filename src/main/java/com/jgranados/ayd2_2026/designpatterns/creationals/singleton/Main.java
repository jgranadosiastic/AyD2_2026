/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designpatterns.creationals.singleton;

import java.sql.Connection;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        Connection con = DBConnectionSingleton.getInstance().getConnection();
    }
}
