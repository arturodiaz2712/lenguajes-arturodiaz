/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T107
 */
import java.io.*;


public class persistenciaUsuario {
   
    public void guardarUsuario(usuario u)throws Exception{
    File F=new File("D:\\.archivaldo.xxx"); 
    FileOutputStream foos=new FileOutputStream(F);
    ObjectOutputStream oos=new ObjectOutputStream(foos);
    oos.writeObject(u);
    System.out.println("objeto usuario guardado");
    } 

      public usuario leerUsuario()throws Exception{
      File F=new File("D:\\.archivaldo.xxx"); 
      FileInputStream fis=new FileInputStream(F);
      ObjectInputStream ois=new ObjectInputStream(fis);
      usuario u=(usuario)ois.readObject();
      System.out.println("usuario recobrado");
      return u;
      }
    
}
