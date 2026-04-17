package com.jgranados.ayd2_2026.designpatterns.structural.adapter.adapter;


import com.jgranados.ayd2_2026.designpatterns.structural.adapter.Student;
import java.util.List;

public interface ThirdpartySystemAdapter {

    public void processStudents(List<Student> students);
    
    public List<Student> getStudents();
}
