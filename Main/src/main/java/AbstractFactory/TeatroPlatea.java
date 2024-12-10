/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */
public class TeatroPlatea extends Platea {
    @Override
    public void verDisponibilidad() {
        System.out.println("Disponibilidad para Teatro Platea verificada.");
    }

    @Override
    public void agregarCaracteristica() {
        System.out.println("Características añadidas a Teatro Platea.");
    }
}
