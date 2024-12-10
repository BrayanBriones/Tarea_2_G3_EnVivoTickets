/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import ChainOfResponsability.*;

/**
 *
 * @author HP
 */
public class Correo implements INotificarCanal {
    @Override
    public void notificarExito(String mensaje) {
        System.out.println("Notificación exitosa por correo: " + mensaje);
    }

    @Override
    public void notificarFracaso(String mensaje) {
        System.out.println("Notificación fallida por correo: " + mensaje);
    }

    @Override
    public void enviar_notificacion(String mensaje, Boolean exito, EventHandler e) {
        System.out.println("Enviando notificacion: " + mensaje);
        if (exito==true){
            e.notificarExito();
        } else{
            e.notificarFracaso(this);
        }
    }
}
