/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T107
 */
public class probar_persistenciaUsuario {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception {
    usuario u=new usuario();
    u.setNombre("arturo");
    u.setEdad(23);
    u.setSueldo(20000);
    
    persistenciaUsuario p=new persistenciaUsuario();
    p.guardarUsuario(u);
    
    
   
}}
