/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

import java.util.HashMap;

/**
 *
 * @author HP
 */
public class SelectFunctionsMaps implements IAvailabilitySeat,IReserveSeat{
    private HashMap<Integer, String> seatMap = new HashMap<>();
    
    @Override
    public boolean checkDisponibility(int seat) {
        return !seatMap.containsKey(seat);
    }
    
    @Override
    public void selectSeat(int seat, String user) {
        if (checkDisponibility(seat)) {
            seatMap.put(seat, user);
            System.out.println("Asiento " + seat + " asignado a " + user);
        } else {
            System.out.println("Asiento " + seat + " no disponible.");
        }
    }
}
