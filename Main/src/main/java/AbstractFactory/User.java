/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

import java.net.Socket;

/**
 *
 * @author HP
 */
public class User {
    private int idUser;
    private String userName;
    private String lastName;
    private String userEmail;
    private String userPhone;
    private UserPurchase userPurchase;
    private AbstractFactoryTicket factory;
    private Map map;


    public User(int idUser, String userName, String lastName, String userEmail, String userPhone, UserPurchase userPurchase, AbstractFactoryTicket factory, Map map ) {
        this.idUser = idUser;
        this.userName = userName;
        this.lastName = lastName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userPurchase = userPurchase;
        this.factory = factory;
        this.map= map;
    }

    public void printUserInfo() {
        System.out.println("Usuario: " + userName + " " + lastName + ", Email: " + userEmail);
    }
    
    public UserPurchase createUserPurchase(){
        return this.userPurchase;
    }

    public void mostrar_tickets_reservados(){
        System.out.println("Mostrando tickets reservados...");
    }
    public void solicitar_datos_pago(){
        System.out.println("Solicitando Datos...");
    }
    public void mostrarCostoFinal(){
        System.out.println("Mostrando costo final...");
    }
    
    
    // Getters y Setters

    public String getUserName() {
        return userName;
    }

    public void verificar_cliente(){
        System.out.println("Verificando cliente....");
    }
    public void mostrar_detalle(){
        System.out.println("Mostrando detalle...");
    }
    public void enviar_detalles_notificacion(){
        System.out.println("Enviando detalles...");
    }

    
}
