/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author HP
 */


public class Map {
    private String disponibilityMap;
    private SelectFunctionsMaps funciones;
    
    public SelectFunctionsMaps selectFunction(){
        return this.funciones;
    }
    public void show_map(){
        System.out.println("Mostrando mapa....");
    }

    
}
