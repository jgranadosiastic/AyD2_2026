/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designpatterns.behaviour.strategy;

import com.jgranados.ayd2_2026.designpatterns.behaviour.strategy.mutators.Mutator;

/**
 *
 * @author jose
 */
public class GeneticAlgotirhm {
    
    public Subject mutateSubject(Subject subject, Mutator mutator) {
        return mutator.mutate(subject);
    }
}
