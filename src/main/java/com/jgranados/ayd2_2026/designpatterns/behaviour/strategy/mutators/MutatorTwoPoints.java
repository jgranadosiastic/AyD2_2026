/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ayd2_2026.designpatterns.behaviour.strategy.mutators;

import com.jgranados.ayd2_2026.designpatterns.behaviour.strategy.Subject;

/**
 *
 * @author jose
 */
public class MutatorTwoPoints implements Mutator {

    @Override
    public Subject mutate(Subject subject) {
        System.out.println("Mutation two points");
        return subject;
    }
    
}
