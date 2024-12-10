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
public class Decorator {
    protected Ticket ticket;

    public Decorator(Ticket ticket) {
        this.ticket = ticket;
    }

    public void agregarCaracteristica() {
        ticket.agregarCaracteristica();
    }
}
