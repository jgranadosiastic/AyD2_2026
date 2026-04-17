package com.jgranados.ayd2_2026.designpatterns.structural.adapter.adapter;


import com.jgranados.ayd2_2026.designpatterns.structural.adapter.Student;
import java.util.List;

public interface StudentCollectionAdapter {

    public String[][] adapt(List<Student> students);
}
