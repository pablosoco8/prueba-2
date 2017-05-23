/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.Serializable;

/**
 *
 * @author DAM113
 */
public class Alumno implements Serializable{

    private int noExpediente;
    private String nombre;
    private Float nota1;
    private Float nota2;
    private Float nota3;
    private Grupo grupo;

    public Alumno(int noExpediente, String nombre, Float nota1, Float nota2, Float nota3, Grupo grupo) {
        this.noExpediente = noExpediente;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.grupo = grupo;
    }

    public int getNoExpediente() {
        return noExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public Float getNota1() {
        return nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public Float getNota3() {
        return nota3;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alumno) {
            if (((Alumno) obj).getNoExpediente() == this.noExpediente) {

                return true;
            }
        }

        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

}
