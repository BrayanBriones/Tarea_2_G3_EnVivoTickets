/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import AbstractFactory.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class ClienteNotificacion {
    private int idNotification;
    private String description;
    private String type;
    private Date dateNotification;
    private List<User> clientes;


    public ClienteNotificacion(int idNotification, String description, String type, Date dateNotification) {
        this.idNotification = idNotification;
        this.description = description;
        this.type = type;
        this.dateNotification = dateNotification;
        this.clientes = new ArrayList<>();
    }


    public void suscribir(INotificarCanal canal) {
        System.out.println("Te subscribiste al canal "+canal);
    }


    public void desuscribir(INotificarCanal canal) {
        System.out.println("Te desubscribiste al canal "+canal);
    }

  
    public void notificarClientes(String mensaje) {
        for (User cliente : clientes) {
            System.out.println("Se notifica al cliente: "+cliente+" el siguiente mensaje: "+mensaje);
        }
    }
    public INotificarCanal crearServicioNotificacion(){
        return new Correo();
            
    }
    

}
