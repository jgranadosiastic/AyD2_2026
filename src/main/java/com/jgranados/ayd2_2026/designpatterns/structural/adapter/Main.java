package com.jgranados.ayd2_2026.designpatterns.structural.adapter;



import com.jgranados.ayd2_2026.designpatterns.structural.adapter.adapter.StudentCollectionAdapter;
import com.jgranados.ayd2_2026.designpatterns.structural.adapter.adapter.StudentCollectionAdapterImpl;
import com.jgranados.ayd2_2026.designpatterns.structural.adapter.adapter.ThirdpartySystemAdapter;
import com.jgranados.ayd2_2026.designpatterns.structural.adapter.adapter.ThirdpartySystemAdapterImpl;
import com.jgranados.ayd2_2026.designpatterns.structural.adapter.studentservice.StudentService;
import com.jgranados.ayd2_2026.designpatterns.structural.adapter.thirdparty.ThirdpartySystem;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        ThirdpartySystem thirdpartySystem = new ThirdpartySystem();

        StudentService studentService = new StudentService();
        List<Student> students = studentService.getStudents();
        
        StudentCollectionAdapter adapterCollection = new StudentCollectionAdapterImpl();
        thirdpartySystem.processStudents(adapterCollection.adapt(students));
        
        
        ///----------------------------------------------------
        ThirdpartySystemAdapter thirdPartyAdapter = new ThirdpartySystemAdapterImpl();
        
        thirdPartyAdapter.processStudents(students);
        

    }


}
