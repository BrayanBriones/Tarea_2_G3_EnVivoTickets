/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */
public class StandUpPlatea extends Platea {
    @Override
    public void verDisponibilidad() {
        System.out.println("Verificando disponibilidad para Platea en StandUp.");
    }

    @Override
    public void agregarCaracteristica() {
        System.out.println("Características añadidas a Platea en StandUp.");
    }
}
