/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author DAM113
 */
public class GestoraNotas extends ArrayList<Alumno>{
    
    private static final String FILENAME="Alumnos.dat";
    
    public boolean comprobarExpediente(String expediente){
    return Pattern.matches("[0-9]{10}", expediente);
    }
    
    public boolean comprobarNombre(String nombre){
    return Pattern.matches("[a-zñáéíóú]+[a-zñáéíóú ]", nombre.toLowerCase());
    }
    
    public boolean comprobarNota1(String nota){
    return Pattern.matches("[0-9]|10|[0-9].[0-9]", nota);
    }   
    
    
    public boolean 

       
    
 
     }
    
    
    
   
