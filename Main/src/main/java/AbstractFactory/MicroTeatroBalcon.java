/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */
public class MicroTeatroBalcon extends Balcon {
    @Override
    public void verDisponibilidad() {
        System.out.println("Verificando disponibilidad para Balcón en MicroTeatro.");
    }

    @Override
    public void agregarCaracteristica() {
        System.out.println("Características añadidas a Balcón en MicroTeatro.");
    }
}