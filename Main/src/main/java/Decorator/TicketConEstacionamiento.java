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
public class TicketConEstacionamiento extends Ticket{
    public TicketConEstacionamiento(Ticket ticket) {
        super();
        System.out.println("Configuramos el estacionamiento");
    }

    @Override
    public void agregarCaracteristica() {
        super.agregarCaracteristica();
        System.out.println("Estacionamiento añadido al ticket.");
    }
}
