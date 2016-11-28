package Negocios;

import UI.Inicio;
import data.Jugador;
import data.JugadorPC;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    static Scanner s = new Scanner(System.in);;

    public static void main(String[] args) {

         
        
        boolean fin = false;
        Inicio in = new Inicio();
        in.setVisible(true);
        
        System.out.println("\t\t BATALLA NAVAL\n");
        

        //if (seleccion == 1) {
        String nombre1 = in.getNombre();
            
            nombre1 = in.getNombre();
            
           
            
            while (!fin) {
                
             Jugador j1= new Jugador(nombre1);
            
            JugadorPC pc = new JugadorPC("PC");
                //System.out.println("\t\n TURNO DEL JUGADOR PC");
                // pc.disparar(j1);

                //System.out.println("\t\n TURNO DEL JUGADOR " + nombre1);
                // j1.disparar(pc);
                
                if(j1.getNumeroAciertos()==17){
                    System.out.println(nombre1 + "\n HA GANADO");
                    fin = true;}
                if(pc.getNumeroAciertos()==17){
                    System.out.println(pc.getNombre() + "\n HA GANADO");
                    fin = true;}
            }
            
        //}

       /* if (seleccion == 2) {
            System.out.println("Nombre del jugador 1:");
            String nombre1 = s.next();
            System.out.println("Nombre del jugador 2:");
            String nombre2 = s.next();
            Jugador j2 = new Jugador(nombre2);
            Jugador j1 = new Jugador(nombre1);
            while (!fin) {
                System.out.println("\t\n TURNO DEL JUGADOR " + j2.getNombre());
                j2.disparar(j1);
                System.out.println("\t\n TURNO DEL JUGADOR " + nombre1);
                j1.disparar(j2);
                
                  
                if(j1.getNumeroAciertos()==17){
                    System.out.println(nombre1 + "\n HA GANADO");
                    fin = true;}
                if(j2.getNumeroAciertos()==17){
                    System.out.println(j2.getNombre() + "\n HA GANADO");
                    fin = true;}
            }
        }*/
    }

    static int seleccionar() {
        int x = 0;
        boolean valorCorrecto = false;
        System.out.println("1. 1 jugador \t\t 2. multijugador");
        do {
            try {

                x = s.nextInt();
                if (x >= 1 && x <= 2) {
                    valorCorrecto = true;
                } else {
                    System.out.println("solo se admiten valores entre 1 y 2");
                }
            } catch (InputMismatchException i) {

                System.out.println("ingrese valores numericos unicamente entre 1 y 2");
                x = s.nextInt();
            }
        } while (!valorCorrecto);
        return x;
    }

}
