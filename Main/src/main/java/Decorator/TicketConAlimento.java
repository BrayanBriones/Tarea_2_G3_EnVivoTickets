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
public class TicketConAlimento extends Ticket{
    public TicketConAlimento(Ticket ticket) {
        super();
        System.out.println("Configuramos el alimento");
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Alimento añadido al ticket.");
    }
}
