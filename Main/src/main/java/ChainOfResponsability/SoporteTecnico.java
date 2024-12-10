/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsability;

/**
 *
 * @author HP
 */
public class SoporteTecnico extends AtencionAlCliente implements IStatusFunction {
    private Manejadora next;

    @Override
    public void setNext(Manejadora next) {
        this.next = next;
    }

    @Override
    public void handle(String request) {
        System.out.println("Soporte Técnico maneja la solicitud.");
        if (next != null) {
            next.handle(request);
        }
    }

    @Override
    public void updateState(int idFunction, String newStatus) {
        // Lógica para actualizar estado
        System.out.println("Estado actualizado a: " + newStatus);
    }
}
