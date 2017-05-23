/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author DAM113
 */
public enum Grupo {
    
    dam1("Pablo"),
    dam2("Cristian"),
    b4("Nacho"),
    c4("Asier"),
    a4("Jesus");
    
    private final String profesor;

    private Grupo(String profesor) {
        this.profesor = profesor;
    }

    public String getProfesor() {
        return profesor;
    }
    
    
}
