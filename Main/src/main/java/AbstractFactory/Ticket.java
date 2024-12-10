/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */
import java.time.LocalDateTime;

public abstract class Ticket {
    private int idTicket;
    private String status;
    private LocalDateTime presentationDate;
    private int idFunction;
    private int price;
    private String section;
    private int seat;

    public Ticket(int idTicket, String status, LocalDateTime presentationDate, int idFunction, int price, String section, int seat) {
        this.idTicket = idTicket;
        this.status = status;
        this.presentationDate = presentationDate;
        this.idFunction = idFunction;
        this.price = price;
        this.section = section;
        this.seat = seat;
    }
    public Ticket(){
        
    }

    public void verDisponibilidad() {
        System.out.println("Verificando disponibilidad del ticket...");
    }

    public void agregarCaracteristica() {
        System.out.println("Características adicionales al ticket añadidas.");
    }

    // Getters y Setters
    public int getPrice(){
        return this.price;
    }
}
