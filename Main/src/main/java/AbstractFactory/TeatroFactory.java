/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */
public class TeatroFactory implements AbstractFactoryTicket {
    @Override
    public Platea createPlatea() {
        System.out.println("Creando Platea de Teatro");
        return new TeatroPlatea();
    }

    @Override
    public Balcon createBalcon() {
        System.out.println("Creando Balcón de Teatro");
        return new TeatroBalcon();
    }

    @Override
    public Vip createVip() {
        System.out.println("Creando Vip de Teatro");
        return new TeatroVip();
    }
}
