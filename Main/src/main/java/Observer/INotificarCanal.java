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
public interface INotificarCanal {
    void notificarExito(String mensaje);
    void notificarFracaso(String mensaje);
    void enviar_notificacion(String mensaje, Boolean exito, EventHandler e);
}
