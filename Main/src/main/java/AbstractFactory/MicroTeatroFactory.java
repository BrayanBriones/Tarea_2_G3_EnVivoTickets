/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */
public class MicroTeatroFactory implements AbstractFactoryTicket {
    @Override
    public Platea createPlatea() {
        System.out.println("Creando Platea de MicroTeatro");
        return new MicroTeatroPlatea();
    }

    @Override
    public Balcon createBalcon() {
        System.out.println("Creando Balcón de MicroTeatro");
        return new MicroTeatroBalcon();
    }

    @Override
    public Vip createVip() {
        System.out.println("Creando Vip de MicroTeatro");
        return new MicroTeatroVip();
    }
}
