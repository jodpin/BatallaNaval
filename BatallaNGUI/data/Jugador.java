package data;

import UI.Tablero;
import java.util.Random;
import Negocios.Juego1;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public final class Jugador implements Player {

    

    Juego1 ju;
    JButton[] fila1 = new JButton[10];
    JButton[] fila2 = new JButton[10];
    JButton[] fila3 = new JButton[10];
    JButton[] fila4 = new JButton[10];
    JButton[] fila5 = new JButton[10];
    JButton[] fila6 = new JButton[10];
    JButton[] fila7 = new JButton[10];
    JButton[] fila8 = new JButton[10];
    JButton[] fila9 = new JButton[10];
    JButton[] fila10 = new JButton[10];
    JButton[][] tableroB;

    private String Nombre;
    private final Tablero tablero;
    private Tablero tablero2;
    private int numeroAciertos;

    Submarino m;
    Barcoc b;
    Lancha l;
    PortaAviones pa;
    SubmarinoB sb;

    public Jugador(String Nombre) {

        ju = new Juego1();
        ju.setVisible(true);
        tableroB = new JButton[10][10];
        llenarBotones();
        this.Nombre = Nombre;
        this.tablero = new Tablero();
        tablero2 = new Tablero();
        sb = new SubmarinoB();
        m = new Submarino();
        b = new Barcoc();
        pa = new PortaAviones();
        l = new Lancha();
       

        System.out.println("\n\n UBICAR SUBMARINO");
        m.dibujarBarco();
        ubicarBarco(this.tablero, m);
        this.tablero.imprimirTablero();
        System.out.println("\n\n UBICAR BARCO");
        b.dibujarBarco();
        ubicarBarco(this.tablero, b);
        this.tablero.imprimirTablero();
        System.out.println("\n\n UBICAR PORTA AVIONES");
        pa.dibujarBarco();
        ubicarBarco(this.tablero, pa);
        this.tablero.imprimirTablero();
        System.out.println("\n\n UBICAR SUBMARINO 2");
        sb.dibujarBarco();
        ubicarBarco(this.tablero, sb);
        this.tablero.imprimirTablero();
        System.out.println("\n\n UBICAR LANCHA");
        l.dibujarBarco();
        ubicarBarco(this.tablero, l);
        this.tablero.imprimirTablero();

    }

    @Override
    public void disparar(JugadorPC j) {

        j.getTablero2().imprimirTablero();
        boolean disparo = false;
        int x = tablero.pedirCoordenadaX(9, ju);
        int y = tablero.pedirCoordenadaY(9, ju);
        while (!disparo) {
            if (j.getTablero().getBoard()[x][y].isEstado() == true) {
                j.getTablero2().board[x][y].setSimbolo("  O  ");
                j.getTablero().getBoard()[x][y].setEstado(false);

                disparo = true;

            } else if (j.getTablero().getBoard()[x][y].isEstado() == false && j.getTablero().getBoard()[x][y].isHayBarco() == true) {
                j.getTablero2().board[x][y].setSimbolo("  #  ");
                j.getTablero().getBoard()[x][y].setHayBarco(false);
                this.setNumeroAciertos(j.getNumeroAciertos() + 1);
                disparo = true;

            } else if (j.getTablero().getBoard()[x][y].isEstado() == false && j.getTablero().getBoard()[x][y].isHayBarco() == false) {
                System.out.println("no puede disparar dos veces en la misma casilla");
                x = tablero.pedirCoordenadaX(9, ju);
                y = tablero.pedirCoordenadaY(9, ju);
            }
        }
        j.getTablero2().imprimirTablero();

    }

    @Override
    public void disparar(Jugador j) {

        j.getTablero2().imprimirTablero();
        boolean disparo = false;
        int x = tablero.pedirCoordenadaX(9, ju);
        int y = tablero.pedirCoordenadaY(9, ju);
        while (!disparo) {
            if (j.getTablero().getBoard()[x][y].isEstado() == true) {
                j.getTablero2().board[x][y].setSimbolo("  O  ");
                j.getTablero().getBoard()[x][y].setEstado(false);
                disparo = true;

            } else if (j.getTablero().getBoard()[x][y].isEstado() == false && j.getTablero().getBoard()[x][y].isHayBarco() == true) {
                j.getTablero2().board[x][y].setSimbolo("  #  ");
                j.getTablero().getBoard()[x][y].setHayBarco(false);
                j.setNumeroAciertos(j.getNumeroAciertos() + 1);
                disparo = true;

            } else if (j.getTablero().getBoard()[x][y].isEstado() == false && j.getTablero().getBoard()[x][y].isHayBarco() == false) {
                System.out.println("no puede disparar dos veces en la misma casilla");
                x = tablero.pedirCoordenadaX(9, ju);
                y = tablero.pedirCoordenadaY(9, ju);
            }
        }
        j.getTablero2().imprimirTablero();

    }

    public int getNumeroAciertos() {
        return numeroAciertos;
    }

    public void setNumeroAciertos(int numeroAciertos) {
        this.numeroAciertos = numeroAciertos;
    }

    public Tablero getTablero2() {
        return tablero2;
    }

    public void setTablero2(Tablero tablero2) {
        this.tablero2 = tablero2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Tablero getTablero() {
        return tablero;
    }

    @Override
    public void ubicarBarco(Tablero tablero, Submarino m) {

        
        int x;
        int y;
        boolean ubicacion = false;
        int direccion;

        
        direccion = tablero.pedirOrientacion(ju);
        if (direccion == 0) {
            direccion = -1;
            x = tablero.pedirCoordenadaX(6, ju);
            y = tablero.pedirCoordenadaY(9, ju);

            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x + 1][y].isEstado() == true
                        && tablero.board[x + 2][y].isEstado() == true && tablero.board[x + 3][y].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m.partes[0]);
                    tablero.board[x + 1][y].setEstado(false);
                    tablero.board[x + 1][y].setHayBarco(true);
                    tablero.board[x + 1][y].setSimbolo(m.partes[1]);
                    tablero.board[x + 2][y].setEstado(false);
                    tablero.board[x + 2][y].setHayBarco(true);
                    tablero.board[x + 2][y].setSimbolo(m.partes[2]);
                    tablero.board[x + 3][y].setEstado(false);
                    tablero.board[x + 3][y].setHayBarco(true);
                    tablero.board[x + 3][y].setSimbolo(m.partes[3]);

                    tableroB[x][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y].setEnabled(false);
                    tableroB[x + 1][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 1][y].setEnabled(false);
                    tableroB[x + 2][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 2][y].setEnabled(false);
                    tableroB[x + 3][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 3][y].setEnabled(false);

                } else {
                    ubicacion = false;

                    x = tablero.pedirCoordenadaX(6, ju);
                    y = tablero.pedirCoordenadaY(9, ju);
                }
            }
        } else if (direccion == 1) {
            x = tablero.pedirCoordenadaX(9, ju);
            y = tablero.pedirCoordenadaY(6, ju);

            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x][y + 1].isEstado() == true
                        && tablero.board[x][y + 2].isEstado() == true && tablero.board[x][y + 3].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m.partes[0]);
                    tablero.board[x][y + 1].setEstado(false);
                    tablero.board[x][y + 1].setHayBarco(true);
                    tablero.board[x][y + 1].setSimbolo(m.partes[1]);
                    tablero.board[x][y + 2].setEstado(false);
                    tablero.board[x][y + 2].setHayBarco(true);
                    tablero.board[x][y + 2].setSimbolo(m.partes[2]);
                    tablero.board[x][y + 3].setEstado(false);
                    tablero.board[x][y + 3].setHayBarco(true);
                    tablero.board[x][y + 3].setSimbolo(m.partes[3]);

                    tableroB[x][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y].setEnabled(false);
                    tableroB[x][y + 1].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 1].setEnabled(false);
                    tableroB[x][y + 2].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 2].setEnabled(false);
                    tableroB[x][y + 3].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 3].setEnabled(false);
                } else {
                    ubicacion = false;

                    x = tablero.pedirCoordenadaX(9, ju);
                    y = tablero.pedirCoordenadaY(6, ju);
                }
            }
        }
    }

    @Override
    public void ubicarBarco(Tablero tablero, Barcoc m) {
        int x;
        int y;
        Random rnd = new Random();
        boolean ubicacion = false;
        int direccion;

        direccion = tablero.pedirOrientacion(ju);
        if (direccion == 0) {
            x = tablero.pedirCoordenadaX(7, ju);
            y = tablero.pedirCoordenadaY(9, ju);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x + 1][y].isEstado() == true
                        && tablero.board[x + 1][y].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m.partes[0]);
                    tablero.board[x + 1][y].setEstado(false);
                    tablero.board[x + 1][y].setHayBarco(true);
                    tablero.board[x + 1][y].setSimbolo(m.partes[1]);
                    tablero.board[x + 2][y].setEstado(false);
                    tablero.board[x + 2][y].setHayBarco(true);
                    tablero.board[x + 2][y].setSimbolo(m.partes[2]);

                    tableroB[x][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y].setEnabled(false);
                    tableroB[x + 1][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 1][y].setEnabled(false);
                    tableroB[x + 2][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 2][y].setEnabled(false);

                } else {
                    ubicacion = false;

                    x = tablero.pedirCoordenadaX(7, ju);
                    y = tablero.pedirCoordenadaY(9, ju);

                }
            }
        } else if (direccion == 1) {
            x = tablero.pedirCoordenadaX(9, ju);
            y = tablero.pedirCoordenadaY(7, ju);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x][y + 1].isEstado() == true
                        && tablero.board[x][y + 2].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m.partes[0]);
                    tablero.board[x][y + 1].setEstado(false);
                    tablero.board[x][y + 1].setHayBarco(true);
                    tablero.board[x][y + 1].setSimbolo(m.partes[1]);
                    tablero.board[x][y + 2].setEstado(false);
                    tablero.board[x][y + 2].setHayBarco(true);
                    tablero.board[x][y + 2].setSimbolo(m.partes[2]);

                    tableroB[x][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y].setEnabled(false);
                    tableroB[x][y + 1].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 1].setEnabled(false);
                    tableroB[x][y + 2].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 2].setEnabled(false);

                } else {
                    ubicacion = false;

                    x = tablero.pedirCoordenadaX(9, ju);
                    y = tablero.pedirCoordenadaY(7, ju);

                }
            }
        }
    }

    @Override
    public void ubicarBarco(Tablero tablero, Lancha l) {
        int x;
        int y;
        int direccion;
        Random rnd = new Random();
        boolean ubicacion = false;

        direccion = tablero.pedirOrientacion(ju);
        if (direccion == 0) {
            x = tablero.pedirCoordenadaX(8, ju);
            y = tablero.pedirCoordenadaY(9, ju);
            while (!ubicacion) {

                if (tablero.board[x][y].isEstado() == true && tablero.board[x + 1][y].isEstado() == true) {

                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(l.partes[0]);
                    tablero.board[x + 1][y].setEstado(false);
                    tablero.board[x + 1][y].setHayBarco(true);
                    tablero.board[x + 1][y].setSimbolo(l.partes[1]);

                    tableroB[x][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y].setEnabled(false);
                    tableroB[x + 1][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 1][y].setEnabled(false);
                    ubicacion = true;

                } else {
                    ubicacion = false;

                    x = tablero.pedirCoordenadaX(8, ju);
                    y = tablero.pedirCoordenadaY(9, ju);

                }
            }
        } else if (direccion == 1) {
            x = tablero.pedirCoordenadaX(9, ju);
            y = tablero.pedirCoordenadaY(8, ju);
            while (!ubicacion) {

                if (tablero.board[x][y + 1].isEstado() == true && tablero.board[x][y].isEstado() == true) {

                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(l.partes[0]);
                    tablero.board[x][y + 1].setEstado(false);
                    tablero.board[x][y + 1].setHayBarco(true);
                    tablero.board[x][y + 1].setSimbolo(l.partes[1]);

                    tableroB[x][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y].setEnabled(false);
                    tableroB[x][y + 1].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 1].setEnabled(false);

                    ubicacion = true;

                } else {
                    ubicacion = false;

                    x = tablero.pedirCoordenadaX(9, ju);
                    y = tablero.pedirCoordenadaY(8, ju);

                }
            }
        }
    }

    @Override
    public void ubicarBarco(Tablero tablero, PortaAviones pa) {
        Random rnd = new Random();
        int x;
        int y;
        int direccion;
        boolean ubicacion = false;

        direccion = tablero.pedirOrientacion(ju);
        if (direccion == 0) {
            x = tablero.pedirCoordenadaX(5, ju);
            y = tablero.pedirCoordenadaY(9, ju);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x + 1][y].isEstado() == true
                        && tablero.board[x + 2][y].isEstado() == true && tablero.board[x + 3][y].isEstado() == true
                        && tablero.board[x + 4][y].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(pa.partes[0]);
                    tablero.board[x + 1][y].setEstado(false);
                    tablero.board[x + 1][y].setHayBarco(true);
                    tablero.board[x + 1][y].setSimbolo(pa.partes[1]);
                    tablero.board[x + 2][y].setEstado(false);
                    tablero.board[x + 2][y].setHayBarco(true);
                    tablero.board[x + 2][y].setSimbolo(pa.partes[2]);
                    tablero.board[x + 3][y].setEstado(false);
                    tablero.board[x + 3][y].setHayBarco(true);
                    tablero.board[x + 3][y].setSimbolo(pa.partes[3]);
                    tablero.board[x + 4][y].setEstado(false);
                    tablero.board[x + 4][y].setHayBarco(true);
                    tablero.board[x + 4][y].setSimbolo(pa.partes[4]);

                    tableroB[x][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y].setEnabled(false);
                    tableroB[x + 1][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 1][y].setEnabled(false);
                    tableroB[x + 2][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 2][y].setEnabled(false);
                    tableroB[x + 3][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 3][y].setEnabled(false);
                    tableroB[x + 4][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 4][y].setEnabled(false);
                } else {
                    ubicacion = false;

                    x = tablero.pedirCoordenadaX(5, ju);
                    y = tablero.pedirCoordenadaY(9, ju);

                }
            }
        } else if (direccion == 1) {
            x = tablero.pedirCoordenadaX(9, ju);
            y = tablero.pedirCoordenadaY(5, ju);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x][y + 1].isEstado() == true
                        && tablero.board[x][y + 2].isEstado() == true && tablero.board[x][y + 3].isEstado() == true
                        && tablero.board[x][y + 4].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(pa.partes[0]);
                    tablero.board[x][y + 1].setEstado(false);
                    tablero.board[x][y + 1].setHayBarco(true);
                    tablero.board[x][y + 1].setSimbolo(pa.partes[1]);
                    tablero.board[x][y + 2].setEstado(false);
                    tablero.board[x][y + 2].setHayBarco(true);
                    tablero.board[x][y + 2].setSimbolo(pa.partes[2]);
                    tablero.board[x][y + 3].setEstado(false);
                    tablero.board[x][y + 3].setHayBarco(true);
                    tablero.board[x][y + 3].setSimbolo(pa.partes[3]);
                    tablero.board[x][y + 4].setEstado(false);
                    tablero.board[x][y + 4].setHayBarco(true);
                    tablero.board[x][y + 4].setSimbolo(pa.partes[4]);

                    tableroB[x][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y].setEnabled(false);
                    tableroB[x][y + 1].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 1].setEnabled(false);
                    tableroB[x][y + 2].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 2].setEnabled(false);
                    tableroB[x][y + 3].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 3].setEnabled(false);
                    tableroB[x][y + 4].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 4].setEnabled(false);
                } else {
                    ubicacion = false;

                    x = tablero.pedirCoordenadaX(9, ju);
                    y = tablero.pedirCoordenadaY(5, ju);

                }
            }
        }
    }

    @Override
    public void ubicarBarco(Tablero tablero, SubmarinoB m2) {
        Random rnd = new Random();
        int x;
        int y;
        int direccion;
        boolean ubicacion = false;

        direccion = tablero.pedirOrientacion(ju);
        if (direccion == 0) {
            x = tablero.pedirCoordenadaX(7, ju);
            y = tablero.pedirCoordenadaY(9, ju);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x + 1][y].isEstado() == true
                        && tablero.board[x + 2][y].isEstado() == true) {
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m2.partes[0]);
                    tablero.board[x + 1][y].setEstado(false);
                    tablero.board[x + 1][y].setHayBarco(true);
                    tablero.board[x + 1][y].setSimbolo(m2.partes[1]);
                    tablero.board[x + 2][y].setEstado(false);
                    tablero.board[x + 2][y].setHayBarco(true);
                    tablero.board[x + 2][y].setSimbolo(m2.partes[2]);

                    tableroB[x][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y].setEnabled(false);
                    tableroB[x + 1][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 1][y].setEnabled(false);
                    tableroB[x + 2][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x + 2][y].setEnabled(false);

                    ubicacion = true;

                } else {
                    ubicacion = false;
                    x = tablero.pedirCoordenadaX(7, ju);
                    y = tablero.pedirCoordenadaY(9, ju);

                }
            }
        } else if (direccion == 1) {
            x = tablero.pedirCoordenadaX(9, ju);
            y = tablero.pedirCoordenadaY(7, ju);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x][y + 1].isEstado() == true
                        && tablero.board[x][y + 2].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m2.partes[0]);
                    tablero.board[x][y + 1].setEstado(false);
                    tablero.board[x][y + 1].setHayBarco(true);
                    tablero.board[x][y + 1].setSimbolo(m2.partes[1]);
                    tablero.board[x][y + 2].setEstado(false);
                    tablero.board[x][y + 2].setHayBarco(true);
                    tablero.board[x][y + 2].setSimbolo(m2.partes[2]);

                    tableroB[x][y].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y].setEnabled(false);
                    tableroB[x][y + 1].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 1].setEnabled(false);
                    tableroB[x][y + 2].setBackground(java.awt.Color.GRAY);
                    tableroB[x][y + 2].setEnabled(false);

                } else {

                    ubicacion = false;
                    x = tablero.pedirCoordenadaX(9, ju);
                    y = tablero.pedirCoordenadaY(7, ju);
                }
            }
        }

    }

    public void llenarBotones() {
        fila1[0] = ju.B11;
        fila1[1] = ju.B12;
        fila1[2] = ju.B13;
        fila1[3] = ju.B14;
        fila1[4] = ju.B15;
        fila1[5] = ju.B16;
        fila1[6] = ju.B17;
        fila1[7] = ju.B18;
        fila1[8] = ju.B19;
        fila1[9] = ju.B110;

        fila2[0] = ju.B21;
        fila2[1] = ju.B22;
        fila2[2] = ju.B23;
        fila2[3] = ju.B24;
        fila2[4] = ju.B25;
        fila2[5] = ju.B26;
        fila2[6] = ju.B27;
        fila2[7] = ju.B28;
        fila2[8] = ju.B29;
        fila2[9] = ju.B210;

        fila3[0] = ju.B31;
        fila3[1] = ju.B32;
        fila3[2] = ju.B33;
        fila3[3] = ju.B34;
        fila3[4] = ju.B35;
        fila3[5] = ju.B36;
        fila3[6] = ju.B37;
        fila3[7] = ju.B38;
        fila3[8] = ju.B39;
        fila3[9] = ju.B310;

        fila4[0] = ju.B41;
        fila4[1] = ju.B42;
        fila4[2] = ju.B43;
        fila4[3] = ju.B44;
        fila4[4] = ju.B45;
        fila4[5] = ju.B46;
        fila4[6] = ju.B47;
        fila4[7] = ju.B48;
        fila4[8] = ju.B49;
        fila4[9] = ju.B410;

        fila5[0] = ju.B51;
        fila5[1] = ju.B52;
        fila5[2] = ju.B53;
        fila5[3] = ju.B54;
        fila5[4] = ju.B55;
        fila5[5] = ju.B56;
        fila5[6] = ju.B57;
        fila5[7] = ju.B58;
        fila5[8] = ju.B59;
        fila5[9] = ju.B510;

        fila6[0] = ju.B61;
        fila6[1] = ju.B62;
        fila6[2] = ju.B63;
        fila6[3] = ju.B64;
        fila6[4] = ju.B65;
        fila6[5] = ju.B66;
        fila6[6] = ju.B67;
        fila6[7] = ju.B68;
        fila6[8] = ju.B69;
        fila6[9] = ju.B610;
        
        fila7[0] = ju.B71;
        fila7[1] = ju.B72;
        fila7[2] = ju.B73;
        fila7[3] = ju.B74;
        fila7[4] = ju.B75;
        fila7[5] = ju.B76;
        fila7[6] = ju.B77;
        fila7[7] = ju.B78;
        fila7[8] = ju.B79;
        fila7[9] = ju.B710;

        fila8[0] = ju.B81;
        fila8[1] = ju.B82;
        fila8[2] = ju.B83;
        fila8[3] = ju.B84;
        fila8[4] = ju.B85;
        fila8[5] = ju.B86;
        fila8[6] = ju.B97;
        fila8[7] = ju.B88;
        fila8[8] = ju.B89;
        fila8[9] = ju.B810;

        fila9[0] = ju.B91;
        fila9[1] = ju.B92;
        fila9[2] = ju.B93;
        fila9[3] = ju.B94;
        fila9[4] = ju.B95;
        fila9[5] = ju.B96;
        fila9[6] = ju.B97;
        fila9[7] = ju.B98;
        fila9[8] = ju.B99;
        fila9[9] = ju.B910;

        fila10[0] = ju.B101;
        fila10[1] = ju.B102;
        fila10[2] = ju.B103;
        fila10[3] = ju.B104;
        fila10[4] = ju.B105;
        fila10[5] = ju.B106;
        fila10[6] = ju.B107;
        fila10[7] = ju.B108;
        fila10[8] = ju.B109;
        fila10[9] = ju.B1010;

        tableroB[0] = fila1;
        tableroB[1] = fila2;
        tableroB[2] = fila3;
        tableroB[3] = fila4;
        tableroB[4] = fila5;
        tableroB[5] = fila6;
        tableroB[6] = fila7;
        tableroB[7] = fila8;
        tableroB[8] = fila9;
        tableroB[9] = fila10;

    }

}
