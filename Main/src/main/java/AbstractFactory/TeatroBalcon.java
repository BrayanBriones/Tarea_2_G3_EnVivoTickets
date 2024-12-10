/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */
public class TeatroBalcon extends  Balcon {
    @Override
    public void verDisponibilidad() {
        System.out.println("Disponibilidad para Teatro Balcón verificada.");
    }

    @Override
    public void agregarCaracteristica() {
        System.out.println("Características añadidas a Teatro Balcón.");
    }
}
