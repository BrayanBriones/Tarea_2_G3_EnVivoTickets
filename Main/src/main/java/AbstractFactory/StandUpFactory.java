/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */
public class StandUpFactory implements AbstractFactoryTicket {
    @Override
    public Platea createPlatea() {
        System.out.println("Creando Platea de StandUp");
        return new StandUpPlatea();
    }

    @Override
    public Balcon createBalcon() {
        System.out.println("Creando Balcón de StandUp");
        return new StandUpBalcon();
    }

    @Override
    public Vip createVip() {
        System.out.println("Creando Vip de StandUp");
        return new StandUpVip();
    }
}
