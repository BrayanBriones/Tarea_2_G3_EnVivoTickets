/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author HP
 */
import AbstractFactory.AbstractFactoryTicket;
import AbstractFactory.Function;
import AbstractFactory.IAvailabilitySeat;
import AbstractFactory.TeatroFactory;
import AbstractFactory.TeatroVip;
import AbstractFactory.Ticket;
import AbstractFactory.Vip;
import ChainOfResponsability.Admin;
import ChainOfResponsability.AtencionAlCliente;
import ChainOfResponsability.SoporteTecnico;
import Decorator.TicketConAlimento;
import Decorator.TicketConBebida;
import Decorator.TicketConEstacionamiento;
import Observer.ClienteNotificacion;
import Observer.Correo;
import Observer.SMS;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        //Ejemplo 1
        // 1. Creación de un ticket usando Abstract Factory
        AbstractFactoryTicket factory = new TeatroFactory();
        Ticket ticketBase = factory.createVip();
        System.out.println("Ticket creado");

        // 2. Adición de características al ticket usando Decorator
        Ticket ticketConAlimento = new TicketConAlimento(ticketBase);
        Ticket ticketConBebida = new TicketConBebida(ticketConAlimento);
        Ticket ticketFinal = new TicketConEstacionamiento(ticketConBebida);

        System.out.println("Ticket final: " + ticketFinal.toString());
        System.out.println("Costo total: " + ticketFinal.getPrice());

        // 3. Notificación al usuario usando Observer
        ClienteNotificacion notificacion = new ClienteNotificacion(01,"Compra de boleto","correo",new Date());
        notificacion.suscribir(new Correo());
        notificacion.notificarClientes("Tu compra del ticket fue exitosa. ¡Disfruta del evento!");
        
        //Ejemplo 2
         // 1. Gestión de funciones y disponibilidad de asientos
        TeatroFactory teatroFactory = new TeatroFactory();
        TeatroVip teatro = (TeatroVip) teatroFactory.createVip();
        
        AtencionAlCliente atencionAlCliente = new AtencionAlCliente() {};
        boolean asientoDisponible = atencionAlCliente.checkDisponibility(5);
        
        if (asientoDisponible) {
            System.out.println("El asiento 5 está disponible. Procediendo con la reserva...");
        } else {
            System.out.println("El asiento A5 no está disponible.");
        }

        // 2. Resolución de problemas usando Chain of Responsibility
        SoporteTecnico soporteTecnico = new SoporteTecnico();
        Admin admin = new Admin();

        // Configuración de la cadena
        atencionAlCliente.setNext(soporteTecnico);
        soporteTecnico.setNext(admin);
        admin.handle("Solicitud");
    }
    
}

