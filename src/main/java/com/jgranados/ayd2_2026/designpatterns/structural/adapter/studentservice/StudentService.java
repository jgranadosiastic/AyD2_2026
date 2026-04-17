package com.jgranados.ayd2_2026.designpatterns.structural.adapter.studentservice;


import com.jgranados.ayd2_2026.designpatterns.structural.adapter.Student;
import java.util.Arrays;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return Arrays.asList(new Student("1", "Jose Granados"),
                new Student("2", "Otro estudiante"));
    }
}
