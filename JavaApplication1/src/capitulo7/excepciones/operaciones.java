/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo7.excepciones;

/**
 *
 * @author T107
 */
public class operaciones {
    public String dividir(int x,int y)throws valoresNonegativosException{
        if(x<0 || y<0)throw new valoresNonegativosException();
        return x/y+"";
    }
}
