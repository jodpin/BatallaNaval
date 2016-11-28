package UI;

import Negocios.Juego1;
import java.util.Scanner;

import data.Casilla;

import data.JugadorPC;


public class Tablero {

    public Casilla[][] board = new Casilla[10][10];
    Scanner input;

    public Tablero() {

        {
            for (int r = 0; r < board.length; r++) {

                for (int c = 0; c < board[0].length; c++) {
                    String nombre = "gui" + (r + 1) + (r + 2);

                    board[r][c] = new Casilla(r, c, true, "  .  ", false);

                }
            }
        }
    }

    public void imprimirTablero() {

        System.out.print(" \t");
        for (int i = 0; i < 10; i++) {
            System.out.print("  " + i + "  ");
        }
        System.out.println();
        for (int r = 0; r < board.length; r++) {

            System.out.print(r + "\t");
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(board[r][c].getSimbolo());
            }
            System.out.println();
        }

    }

    public int pedirCoordenadaX(int limite, Juego1 j) {

        int x = 101;
        boolean valorCorrecto = false;
        while (!valorCorrecto) {

            x = j.y2;

            if (x < 0 || x > limite) {

                x = j.y2;
                System.out.print("");
                valorCorrecto = false;
            } else {
                valorCorrecto = true;
                return x;
            }

        }
        return x;

    }

    public int pedirCoordenadaY(int limite, Juego1 j) {

        int x = 200;
        boolean valorCorrecto = false;

        do {
            x = j.x2;
            if (x < 0 || x > limite) {

                x = j.x2;
            } else {
                valorCorrecto = true;
            }

        } while (!valorCorrecto);

        return x;
    }

    public int pedirOrientacion(Juego1 j) {
        int limite = 1;
        int x = 200;
        boolean valorCorrecto = false;
       
        j.vertical.setEnabled(true);
        j.horizontal.setEnabled(true);
        do {
            if (x < 0 || x > limite) {
                System.out.print("");
                if (!j.vertical.isEnabled()) {
                    x = 0;
                    j.vertical.setEnabled(true);
                    j.horizontal.setEnabled(true);
                } else if (!j.horizontal.isEnabled()) {
                    x = 1;
                    j.horizontal.setEnabled(true);
                    j.vertical.setEnabled(true);
                }
                System.out.print("");

            } else {
                valorCorrecto = true;
            }

        } while (!valorCorrecto);

        
        return x;
    }

    /**
     * @return the board
     */
    public Casilla[][] getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(Casilla[][] board) {
        this.board = board;
    }

    public void disparar(JugadorPC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
