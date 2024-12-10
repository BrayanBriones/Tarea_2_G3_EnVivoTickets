/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;
import Observer.*;

/**
 *
 * @author HP
 */
import Decorator.Decorator;
public class UserPurchase {
    private ClienteNotificacion notificacion_service;
    private String cliente_name;
    private String cliente_lastname;
    private String cliente_method;
    private int cliente_card;
    private IAbstractFactoryPago pago;
    

    public UserPurchase(ClienteNotificacion notificacion_service){
        this.notificacion_service=notificacion_service;

    }
    public void buyTicket(User user) {
        System.out.println("El usuario " + user.getUserName() + " ha comprado un ticket.");
    }
    public void acceder_al_carrito(User u){
        u.mostrar_tickets_reservados();
        u.solicitar_datos_pago();
    }
    public void dar_datos_pago(String cliente_name, String cliente_lastname, String cliente_method, int cliente_card){
        System.out.println("Dando datos de pago...");

    }
    public Decorator ver_opciones_adicionales(Ticket t){
        System.out.println("Mostrando opciones adicionales...");
        return new Decorator(t);
    }
    public void actualizar_costo(){
        System.out.println("Actualizando el costo...");
    }
    public void confirmar_compra(Boolean AgregarAdicionales, Ticket t, User u){
        System.out.println("Confirmando compra");
        if(AgregarAdicionales==true){
            Decorator d= ver_opciones_adicionales(t);
            d.agregarCaracteristica();
            actualizar_costo();
            u.mostrarCostoFinal();
        }
    }
    public void mostrar_resultadoPago(Boolean pagoExitoso){
        System.out.println("Mostrando resultado del pago... ");
        if (pagoExitoso==true){
            INotificarCanal canal= notificacion_service.crearServicioNotificacion();
            canal.notificarExito("Enviando notificacion...");
        } else{
            INotificarCanal canal= notificacion_service.crearServicioNotificacion();
            canal.notificarFracaso("Enviando notificacion...");
        }
        
    }


}