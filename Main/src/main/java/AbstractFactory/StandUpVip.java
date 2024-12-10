/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */
public class StandUpVip extends Vip {
    @Override
    public void verDisponibilidad() {
        System.out.println("Verificando disponibilidad para Vip en StandUp.");
    }

    @Override
    public void agregarCaracteristica() {
        System.out.println("Características añadidas a Vip en StandUp.");
    }
}
