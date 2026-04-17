package com.jgranados.ayd2_2026.designpatterns.structural.adapter.thirdparty;

public class ThirdpartySystem {

    // devs in our app cannot modify this code
    public void processStudents(String[][] students) {
        System.out.println("Do something with students");
    }
    
    public String[][] getStudents() {
        /// algo
        return null;
    }
}
