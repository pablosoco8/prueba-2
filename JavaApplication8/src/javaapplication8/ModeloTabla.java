/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAM113
 */
public class ModeloTabla extends DefaultTableModel{
    private ArrayList<Alumno> alumnoArray;

    public ModeloTabla(ArrayList<Alumno> lasNotas) {
        this.alumnoArray = lasNotas;
    }
    
//    private Object[] alumnoArray;
//    public ModeloTabla(Object[]j){
//    this.alumnoArray=j;
//    }

    @Override
    public Object getValueAt(int row, int column) {
    Alumno alumno= alumnoArray.get(row);
    Object[] camposInformacion ={
        alumno.getNombre(),alumno.getNoExpediente(),alumno.getNota1(),
        alumno.getNota2(),alumno.getNota3(),alumno.getGrupo()};
    return camposInformacion[column];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        String[] nombreColumna={"Nombre","Expediente","Nota1","Nota2","Nota3","Grupo"};
        return nombreColumna[column];
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public int getRowCount() {
        return alumnoArray==null?0:this.alumnoArray.size();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class[] lasClases ={String.class,String.class,String.class,String.class,String.class,String.class};
        return lasClases[columnIndex];
    }
  
    
    
   }
