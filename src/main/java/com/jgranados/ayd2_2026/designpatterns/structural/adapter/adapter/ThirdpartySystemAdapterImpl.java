package com.jgranados.ayd2_2026.designpatterns.structural.adapter.adapter;


import com.jgranados.ayd2_2026.designpatterns.structural.adapter.Student;
import com.jgranados.ayd2_2026.designpatterns.structural.adapter.thirdparty.ThirdpartySystem;
import java.util.List;

public class ThirdpartySystemAdapterImpl implements ThirdpartySystemAdapter {

    private ThirdpartySystem thirdpartySystem = new ThirdpartySystem();

    @Override
    public void processStudents(List<Student> students) {
        thirdpartySystem.processStudents(adaptListToStringMatrix(students));
    }

    private String[][] adaptListToStringMatrix(List<Student> students) {
        String[][] studentsThirdparty = new String[students.size()][2];
        for (int i = 0; i < students.size(); i++) {
            studentsThirdparty[i][0] = students.get(0).id();
            studentsThirdparty[i][1] = students.get(0).fullName();
        }

        return studentsThirdparty;
    }

    @Override
    public List<Student> getStudents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
