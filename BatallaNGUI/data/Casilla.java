
package data;

import javax.swing.JButton;



public class Casilla {
    
    private int posicionX;
    private int posicionY;
    private boolean estado;
    private String simbolo;
    private boolean hayBarco;
    private JButton boton = new JButton();


    public Casilla(int posicionX, int posicionY, boolean estado, String simbolo, boolean barco) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.estado = estado;
        this.simbolo = simbolo;
        this.hayBarco = barco;
    }

    public boolean isHayBarco() {
        return hayBarco;
    }

    public void setHayBarco(boolean hayBarco) {
        this.hayBarco = hayBarco;
    }

    
    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
   
    
    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public void setBoton(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
