/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designpatterns.behaviour.strategy;

import com.jgranados.ayd2_2026.designpatterns.behaviour.strategy.mutators.Mutator;
import com.jgranados.ayd2_2026.designpatterns.behaviour.strategy.mutators.MutatorRandom;
import com.jgranados.ayd2_2026.designpatterns.behaviour.strategy.mutators.MutatorTwoPoints;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        String option;
        System.out.println("Elija mutacion");
        System.out.println("1. Aleatorio");
        System.out.println("2. Dos puntos");
        Scanner scanner =new Scanner(System.in);
        option = scanner.nextLine();
        
        GeneticAlgotirhm ga = new GeneticAlgotirhm();
        Mutator selected;
        if (option.equals("1")) {
            selected = new MutatorRandom();
        } else {
            selected = new MutatorTwoPoints();
        }
        
        ga.mutateSubject(new Subject(), selected);
    }
}
