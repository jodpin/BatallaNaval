
package data;

import UI.Tablero;


public interface Player {
    
    public void disparar(Jugador j);
    
    public void disparar (JugadorPC j);
           
    public void ubicarBarco(Tablero tablero, Submarino m);
    
    public void ubicarBarco(Tablero tablero, Barcoc m);
    
    public void ubicarBarco(Tablero tablero, Lancha l);
    
    public void ubicarBarco(Tablero tablero, PortaAviones pa);
    
    public void ubicarBarco(Tablero tablero, SubmarinoB m2);
    
}
