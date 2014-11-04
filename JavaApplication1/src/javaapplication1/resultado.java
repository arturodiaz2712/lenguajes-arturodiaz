package javaapplication1;


import javaapplication1.obtenerDatos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T107
 */
public class resultado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    obtenerDatos nombre=new obtenerDatos("arturo");
    obtenerDatos edad=new obtenerDatos("23");
    System.out.println("el nombre del cliente es "+nombre.getNombre());
    System.out.println("años de edad del cliente"+edad.getEdad());
    
}
}