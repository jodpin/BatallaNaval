/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

public class Submarino extends Barco{
    
  
	public String[] partes;

	   
    public Submarino(){
    	super(4);
    	partes = new String[super.getTamano()];
        partes[0] = " -|- ";
        partes[1] = " |0| ";
        partes[2] = " |0| ";
        partes[3] = " -|- ";
    }


	   public void dibujarBarco(){
        for(int i = 0; i < partes.length; i++){
            System.out.println(partes[i]);
        }
    }


    
    
    
}
