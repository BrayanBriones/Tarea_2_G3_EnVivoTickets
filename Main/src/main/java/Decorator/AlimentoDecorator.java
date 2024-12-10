/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

import AbstractFactory.Ticket;

/**
 *
 * @author HP
 */
public class AlimentoDecorator extends Decorator {
    
    public AlimentoDecorator(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Alimento añadido al ticket.");
    }
}
