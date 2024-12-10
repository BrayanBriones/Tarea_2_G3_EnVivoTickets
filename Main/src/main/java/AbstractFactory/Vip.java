/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */
public class Vip extends Ticket{
    public void verDisponibilidad() {
        System.out.println("Verificando disponibilidad del ticket platea...");
    }

    public void agregarCaracteristica() {
        System.out.println("Características adicionales al ticket platea añadidas.");
    }
}
