package Negocios;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Juego1 extends javax.swing.JFrame {

    public int x = -12;
    public int y = -12;
    public int x2 = -12;
    public int y2 = -12;
    public int orientacion = 0;

    
    public int obtenerX(JButton b) {

        
        int x = ((b.getX() - 10) / 25);
        return x;
        
    }

    public int obtenerY(JButton b) {

        int y = ((b.getY() - 24) / 25);
        return y;
    }

    public Juego1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b110 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b210 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        b310 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b47 = new javax.swing.JButton();
        b48 = new javax.swing.JButton();
        b49 = new javax.swing.JButton();
        b410 = new javax.swing.JButton();
        b51 = new javax.swing.JButton();
        b52 = new javax.swing.JButton();
        b53 = new javax.swing.JButton();
        b54 = new javax.swing.JButton();
        b55 = new javax.swing.JButton();
        b56 = new javax.swing.JButton();
        b57 = new javax.swing.JButton();
        b58 = new javax.swing.JButton();
        b59 = new javax.swing.JButton();
        b510 = new javax.swing.JButton();
        b61 = new javax.swing.JButton();
        b62 = new javax.swing.JButton();
        b63 = new javax.swing.JButton();
        b64 = new javax.swing.JButton();
        b65 = new javax.swing.JButton();
        b66 = new javax.swing.JButton();
        b67 = new javax.swing.JButton();
        b68 = new javax.swing.JButton();
        b69 = new javax.swing.JButton();
        b610 = new javax.swing.JButton();
        b71 = new javax.swing.JButton();
        b72 = new javax.swing.JButton();
        b73 = new javax.swing.JButton();
        b74 = new javax.swing.JButton();
        b75 = new javax.swing.JButton();
        b76 = new javax.swing.JButton();
        b77 = new javax.swing.JButton();
        b78 = new javax.swing.JButton();
        b79 = new javax.swing.JButton();
        b710 = new javax.swing.JButton();
        b81 = new javax.swing.JButton();
        b82 = new javax.swing.JButton();
        b83 = new javax.swing.JButton();
        b84 = new javax.swing.JButton();
        b85 = new javax.swing.JButton();
        b86 = new javax.swing.JButton();
        jButton217 = new javax.swing.JButton();
        b88 = new javax.swing.JButton();
        b89 = new javax.swing.JButton();
        b810 = new javax.swing.JButton();
        b91 = new javax.swing.JButton();
        b92 = new javax.swing.JButton();
        b93 = new javax.swing.JButton();
        b94 = new javax.swing.JButton();
        b95 = new javax.swing.JButton();
        b96 = new javax.swing.JButton();
        b97 = new javax.swing.JButton();
        b98 = new javax.swing.JButton();
        b99 = new javax.swing.JButton();
        b910 = new javax.swing.JButton();
        b101 = new javax.swing.JButton();
        b102 = new javax.swing.JButton();
        b103 = new javax.swing.JButton();
        b104 = new javax.swing.JButton();
        b105 = new javax.swing.JButton();
        b106 = new javax.swing.JButton();
        b107 = new javax.swing.JButton();
        b108 = new javax.swing.JButton();
        b109 = new javax.swing.JButton();
        b1010 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        PanelJuego = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        B20 = new javax.swing.JButton();
        B30 = new javax.swing.JButton();
        B40 = new javax.swing.JButton();
        B50 = new javax.swing.JButton();
        B60 = new javax.swing.JButton();
        B70 = new javax.swing.JButton();
        B80 = new javax.swing.JButton();
        B90 = new javax.swing.JButton();
        B100 = new javax.swing.JButton();
        B111 = new javax.swing.JButton();
        B112 = new javax.swing.JButton();
        B113 = new javax.swing.JButton();
        B114 = new javax.swing.JButton();
        B115 = new javax.swing.JButton();
        B116 = new javax.swing.JButton();
        B117 = new javax.swing.JButton();
        B118 = new javax.swing.JButton();
        B119 = new javax.swing.JButton();
        B120 = new javax.swing.JButton();
        B211 = new javax.swing.JButton();
        B121 = new javax.swing.JButton();
        B122 = new javax.swing.JButton();
        B123 = new javax.swing.JButton();
        B124 = new javax.swing.JButton();
        B125 = new javax.swing.JButton();
        B126 = new javax.swing.JButton();
        B127 = new javax.swing.JButton();
        B128 = new javax.swing.JButton();
        B129 = new javax.swing.JButton();
        B311 = new javax.swing.JButton();
        B130 = new javax.swing.JButton();
        B131 = new javax.swing.JButton();
        B132 = new javax.swing.JButton();
        B133 = new javax.swing.JButton();
        B134 = new javax.swing.JButton();
        B135 = new javax.swing.JButton();
        B136 = new javax.swing.JButton();
        B137 = new javax.swing.JButton();
        B138 = new javax.swing.JButton();
        B411 = new javax.swing.JButton();
        B139 = new javax.swing.JButton();
        B140 = new javax.swing.JButton();
        B141 = new javax.swing.JButton();
        B142 = new javax.swing.JButton();
        B143 = new javax.swing.JButton();
        B144 = new javax.swing.JButton();
        B145 = new javax.swing.JButton();
        B146 = new javax.swing.JButton();
        B147 = new javax.swing.JButton();
        B511 = new javax.swing.JButton();
        B148 = new javax.swing.JButton();
        B149 = new javax.swing.JButton();
        B150 = new javax.swing.JButton();
        B151 = new javax.swing.JButton();
        B152 = new javax.swing.JButton();
        B153 = new javax.swing.JButton();
        B154 = new javax.swing.JButton();
        B155 = new javax.swing.JButton();
        B156 = new javax.swing.JButton();
        B611 = new javax.swing.JButton();
        B157 = new javax.swing.JButton();
        B158 = new javax.swing.JButton();
        B159 = new javax.swing.JButton();
        B160 = new javax.swing.JButton();
        B161 = new javax.swing.JButton();
        B162 = new javax.swing.JButton();
        B163 = new javax.swing.JButton();
        B164 = new javax.swing.JButton();
        B165 = new javax.swing.JButton();
        B711 = new javax.swing.JButton();
        B166 = new javax.swing.JButton();
        B167 = new javax.swing.JButton();
        B168 = new javax.swing.JButton();
        B169 = new javax.swing.JButton();
        B170 = new javax.swing.JButton();
        B171 = new javax.swing.JButton();
        B172 = new javax.swing.JButton();
        B173 = new javax.swing.JButton();
        B174 = new javax.swing.JButton();
        B811 = new javax.swing.JButton();
        B175 = new javax.swing.JButton();
        B176 = new javax.swing.JButton();
        B177 = new javax.swing.JButton();
        B178 = new javax.swing.JButton();
        B179 = new javax.swing.JButton();
        B180 = new javax.swing.JButton();
        B181 = new javax.swing.JButton();
        B182 = new javax.swing.JButton();
        B183 = new javax.swing.JButton();
        B911 = new javax.swing.JButton();
        B184 = new javax.swing.JButton();
        B185 = new javax.swing.JButton();
        B186 = new javax.swing.JButton();
        B187 = new javax.swing.JButton();
        B188 = new javax.swing.JButton();
        B189 = new javax.swing.JButton();
        B190 = new javax.swing.JButton();
        B191 = new javax.swing.JButton();
        B192 = new javax.swing.JButton();
        B1011 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        vertical = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        horizontal = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        B17 = new javax.swing.JButton();
        B18 = new javax.swing.JButton();
        B19 = new javax.swing.JButton();
        B110 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        B23 = new javax.swing.JButton();
        B24 = new javax.swing.JButton();
        B25 = new javax.swing.JButton();
        B26 = new javax.swing.JButton();
        B27 = new javax.swing.JButton();
        B28 = new javax.swing.JButton();
        B29 = new javax.swing.JButton();
        B210 = new javax.swing.JButton();
        B31 = new javax.swing.JButton();
        B32 = new javax.swing.JButton();
        B33 = new javax.swing.JButton();
        B34 = new javax.swing.JButton();
        B35 = new javax.swing.JButton();
        B36 = new javax.swing.JButton();
        B37 = new javax.swing.JButton();
        B38 = new javax.swing.JButton();
        B39 = new javax.swing.JButton();
        B310 = new javax.swing.JButton();
        B41 = new javax.swing.JButton();
        B42 = new javax.swing.JButton();
        B43 = new javax.swing.JButton();
        B44 = new javax.swing.JButton();
        B45 = new javax.swing.JButton();
        B46 = new javax.swing.JButton();
        B47 = new javax.swing.JButton();
        B48 = new javax.swing.JButton();
        B49 = new javax.swing.JButton();
        B410 = new javax.swing.JButton();
        B51 = new javax.swing.JButton();
        B52 = new javax.swing.JButton();
        B53 = new javax.swing.JButton();
        B54 = new javax.swing.JButton();
        B55 = new javax.swing.JButton();
        B56 = new javax.swing.JButton();
        B57 = new javax.swing.JButton();
        B58 = new javax.swing.JButton();
        B59 = new javax.swing.JButton();
        B510 = new javax.swing.JButton();
        B61 = new javax.swing.JButton();
        B62 = new javax.swing.JButton();
        B63 = new javax.swing.JButton();
        B64 = new javax.swing.JButton();
        B65 = new javax.swing.JButton();
        B66 = new javax.swing.JButton();
        B67 = new javax.swing.JButton();
        B68 = new javax.swing.JButton();
        B69 = new javax.swing.JButton();
        B610 = new javax.swing.JButton();
        B71 = new javax.swing.JButton();
        B72 = new javax.swing.JButton();
        B73 = new javax.swing.JButton();
        B74 = new javax.swing.JButton();
        B75 = new javax.swing.JButton();
        B76 = new javax.swing.JButton();
        B77 = new javax.swing.JButton();
        B78 = new javax.swing.JButton();
        B79 = new javax.swing.JButton();
        B710 = new javax.swing.JButton();
        B81 = new javax.swing.JButton();
        B82 = new javax.swing.JButton();
        B83 = new javax.swing.JButton();
        B84 = new javax.swing.JButton();
        B85 = new javax.swing.JButton();
        B86 = new javax.swing.JButton();
        B87 = new javax.swing.JButton();
        B88 = new javax.swing.JButton();
        B89 = new javax.swing.JButton();
        B810 = new javax.swing.JButton();
        B91 = new javax.swing.JButton();
        B92 = new javax.swing.JButton();
        B93 = new javax.swing.JButton();
        B94 = new javax.swing.JButton();
        B95 = new javax.swing.JButton();
        B96 = new javax.swing.JButton();
        B97 = new javax.swing.JButton();
        B98 = new javax.swing.JButton();
        B99 = new javax.swing.JButton();
        B910 = new javax.swing.JButton();
        B101 = new javax.swing.JButton();
        B102 = new javax.swing.JButton();
        B103 = new javax.swing.JButton();
        B104 = new javax.swing.JButton();
        B105 = new javax.swing.JButton();
        B106 = new javax.swing.JButton();
        B107 = new javax.swing.JButton();
        B108 = new javax.swing.JButton();
        B109 = new javax.swing.JButton();
        B1010 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        b11.setMnemonic('b');
        b11.setToolTipText("");
        b11.setActionCommand("boton1");
        b11.setName("boton1"); // NOI18N
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });

        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });

        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });

        b110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b110ActionPerformed(evt);
            }
        });

        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });

        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });

        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });

        b38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b38ActionPerformed(evt);
            }
        });

        b56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b56ActionPerformed(evt);
            }
        });

        b99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b99ActionPerformed(evt);
            }
        });

        b109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b109ActionPerformed(evt);
            }
        });

        b1010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1010ActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("1");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("2");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("3");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("4");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("5");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("6");

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("7");

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("8");

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("9");

        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("10");

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("A");

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("B");

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("C");

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("D");

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("E");

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("F");

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("G");

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("H");

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("I");

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("J");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b310, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(b41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b410, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(b51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b510, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(b61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b610, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(b71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b710, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(b81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b85, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b86, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton217, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b89, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b810, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(b91, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b92, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b93, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b94, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b95, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b96, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b97, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b98, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b99, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b910, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(b101, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b103, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b108, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b109, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b1010, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b210, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b110, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b110, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b210, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b310, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b410, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b510, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b610, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b710, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b85, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b86, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton217, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b89, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b810, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b91, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b92, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b93, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b94, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b95, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b96, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b97, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b98, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b99, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b910, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b101, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b103, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b108, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b109, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1010, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelJuego.setBackground(new java.awt.Color(255, 255, 255));
        PanelJuego.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        PanelJuego.setPreferredSize(new java.awt.Dimension(1100, 881));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "MI BASE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 15))); // NOI18N

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        B20.setMnemonic('b');
        B20.setToolTipText("");
        B20.setActionCommand("boton1");
        B20.setName("boton1"); // NOI18N
        B20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B20ActionPerformed(evt);
            }
        });

        B30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B30ActionPerformed(evt);
            }
        });

        B40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B40ActionPerformed(evt);
            }
        });

        B50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B50ActionPerformed(evt);
            }
        });

        B60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B60ActionPerformed(evt);
            }
        });

        B70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B70ActionPerformed(evt);
            }
        });

        B80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B80ActionPerformed(evt);
            }
        });

        B90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B90ActionPerformed(evt);
            }
        });

        B100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B100ActionPerformed(evt);
            }
        });

        B111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B111ActionPerformed(evt);
            }
        });

        B112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B112ActionPerformed(evt);
            }
        });

        B113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B113ActionPerformed(evt);
            }
        });

        B114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B114ActionPerformed(evt);
            }
        });

        B115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B115ActionPerformed(evt);
            }
        });

        B116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B116ActionPerformed(evt);
            }
        });

        B117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B117ActionPerformed(evt);
            }
        });

        B118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B118ActionPerformed(evt);
            }
        });

        B119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B119ActionPerformed(evt);
            }
        });

        B120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B120ActionPerformed(evt);
            }
        });

        B211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B211ActionPerformed(evt);
            }
        });

        B121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B121ActionPerformed(evt);
            }
        });

        B122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B122ActionPerformed(evt);
            }
        });

        B123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B123ActionPerformed(evt);
            }
        });

        B124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B124ActionPerformed(evt);
            }
        });

        B125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B125ActionPerformed(evt);
            }
        });

        B126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B126ActionPerformed(evt);
            }
        });

        B127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B127ActionPerformed(evt);
            }
        });

        B128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B128ActionPerformed(evt);
            }
        });

        B129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B129ActionPerformed(evt);
            }
        });

        B311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B311ActionPerformed(evt);
            }
        });

        B130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B130ActionPerformed(evt);
            }
        });

        B131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B131ActionPerformed(evt);
            }
        });

        B132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B132ActionPerformed(evt);
            }
        });

        B133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B133ActionPerformed(evt);
            }
        });

        B134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B134ActionPerformed(evt);
            }
        });

        B135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B135ActionPerformed(evt);
            }
        });

        B136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B136ActionPerformed(evt);
            }
        });

        B137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B137ActionPerformed(evt);
            }
        });

        B138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B138ActionPerformed(evt);
            }
        });

        B411.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B411ActionPerformed(evt);
            }
        });

        B139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B139ActionPerformed(evt);
            }
        });

        B140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B140ActionPerformed(evt);
            }
        });

        B141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B141ActionPerformed(evt);
            }
        });

        B142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B142ActionPerformed(evt);
            }
        });

        B143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B143ActionPerformed(evt);
            }
        });

        B144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B144ActionPerformed(evt);
            }
        });

        B145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B145ActionPerformed(evt);
            }
        });

        B146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B146ActionPerformed(evt);
            }
        });

        B147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B147ActionPerformed(evt);
            }
        });

        B511.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B511ActionPerformed(evt);
            }
        });

        B148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B148ActionPerformed(evt);
            }
        });

        B149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B149ActionPerformed(evt);
            }
        });

        B150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B150ActionPerformed(evt);
            }
        });

        B151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B151ActionPerformed(evt);
            }
        });

        B152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B152ActionPerformed(evt);
            }
        });

        B153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B153ActionPerformed(evt);
            }
        });

        B154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B154ActionPerformed(evt);
            }
        });

        B155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B155ActionPerformed(evt);
            }
        });

        B156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B156ActionPerformed(evt);
            }
        });

        B611.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B611ActionPerformed(evt);
            }
        });

        B157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B157ActionPerformed(evt);
            }
        });

        B158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B158ActionPerformed(evt);
            }
        });

        B159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B159ActionPerformed(evt);
            }
        });

        B160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B160ActionPerformed(evt);
            }
        });

        B161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B161ActionPerformed(evt);
            }
        });

        B162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B162ActionPerformed(evt);
            }
        });

        B163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B163ActionPerformed(evt);
            }
        });

        B164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B164ActionPerformed(evt);
            }
        });

        B165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B165ActionPerformed(evt);
            }
        });

        B711.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B711ActionPerformed(evt);
            }
        });

        B166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B166ActionPerformed(evt);
            }
        });

        B167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B167ActionPerformed(evt);
            }
        });

        B168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B168ActionPerformed(evt);
            }
        });

        B169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B169ActionPerformed(evt);
            }
        });

        B170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B170ActionPerformed(evt);
            }
        });

        B171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B171ActionPerformed(evt);
            }
        });

        B172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B172ActionPerformed(evt);
            }
        });

        B173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B173ActionPerformed(evt);
            }
        });

        B174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B174ActionPerformed(evt);
            }
        });

        B811.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B811ActionPerformed(evt);
            }
        });

        B175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B175ActionPerformed(evt);
            }
        });

        B176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B176ActionPerformed(evt);
            }
        });

        B177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B177ActionPerformed(evt);
            }
        });

        B178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B178ActionPerformed(evt);
            }
        });

        B179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B179ActionPerformed(evt);
            }
        });

        B180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B180ActionPerformed(evt);
            }
        });

        B181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B181ActionPerformed(evt);
            }
        });

        B182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B182ActionPerformed(evt);
            }
        });

        B183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B183ActionPerformed(evt);
            }
        });

        B911.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B911ActionPerformed(evt);
            }
        });

        B184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B184ActionPerformed(evt);
            }
        });

        B185.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B185ActionPerformed(evt);
            }
        });

        B186.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B186ActionPerformed(evt);
            }
        });

        B187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B187ActionPerformed(evt);
            }
        });

        B188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B188ActionPerformed(evt);
            }
        });

        B189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B189ActionPerformed(evt);
            }
        });

        B190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B190ActionPerformed(evt);
            }
        });

        B191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B191ActionPerformed(evt);
            }
        });

        B192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B192ActionPerformed(evt);
            }
        });

        B1011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1011ActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("1");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("2");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("3");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("4");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("5");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("6");

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("7");

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("8");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("9");

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("10");

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("A");

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("B");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("C");

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("D");

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("E");

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("F");

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("G");

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("H");

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("I");

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("J");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B90, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B100, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B111, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B112, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B113, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B114, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B115, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B116, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B117, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B118, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B119, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B120, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B211, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B121, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B122, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B123, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B124, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B125, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B129, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B311, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B130, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B131, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B133, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B134, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B135, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B136, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B137, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B138, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B411, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B139, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B140, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B141, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B142, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B143, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B144, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B145, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B146, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B147, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B511, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B148, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B149, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B150, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B151, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B152, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B153, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B154, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B155, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B156, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B611, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B157, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B158, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B159, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B160, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B161, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B162, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B163, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B164, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B165, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B711, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B166, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B167, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B168, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B169, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B170, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B171, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B172, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B173, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B174, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B811, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B175, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B176, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B177, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B178, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B179, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B180, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B181, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B182, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B183, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B911, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(B184, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B185, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B186, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B187, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B188, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B189, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B190, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B191, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B192, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B1011, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B90, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B100, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B111, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B112, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B113, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B114, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B115, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B116, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B117, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B118, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B119, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B120, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B211, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B121, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B122, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B123, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B124, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B125, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B129, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B311, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B130, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B131, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B133, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B134, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B135, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B136, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B137, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B138, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B411, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B139, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B140, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B141, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B142, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B143, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B144, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B145, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B146, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B147, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B511, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B148, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B149, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B150, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B151, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B152, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B153, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B154, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B155, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B156, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B611, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B157, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B158, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B159, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B160, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B161, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B162, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B163, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B164, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B165, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B711, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B166, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B167, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B168, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B169, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B170, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B171, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B172, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B173, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B174, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B811, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B175, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B176, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B177, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B178, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B179, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B180, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B181, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B182, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B183, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B911, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B184, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B185, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B186, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B187, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B188, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B189, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B190, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B191, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B192, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1011, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        vertical.setText("Vertical");
        vertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verticalActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        horizontal.setText("Horizontal");
        horizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horizontalActionPerformed(evt);
            }
        });

        jLabel61.setForeground(new java.awt.Color(255, 0, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setToolTipText("asd");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "MI BASE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 15))); // NOI18N

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        B11.setMnemonic('b');
        B11.setToolTipText("");
        B11.setActionCommand("boton1");
        B11.setName("boton1"); // NOI18N
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });

        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });

        B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14ActionPerformed(evt);
            }
        });

        B15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B15ActionPerformed(evt);
            }
        });

        B16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B16ActionPerformed(evt);
            }
        });

        B17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B17ActionPerformed(evt);
            }
        });

        B18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B18ActionPerformed(evt);
            }
        });

        B19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B19ActionPerformed(evt);
            }
        });

        B110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B110ActionPerformed(evt);
            }
        });

        B21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B21ActionPerformed(evt);
            }
        });

        B22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B22ActionPerformed(evt);
            }
        });

        B23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B23ActionPerformed(evt);
            }
        });

        B24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B24ActionPerformed(evt);
            }
        });

        B25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B25ActionPerformed(evt);
            }
        });

        B26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B26ActionPerformed(evt);
            }
        });

        B27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B27ActionPerformed(evt);
            }
        });

        B28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B28ActionPerformed(evt);
            }
        });

        B29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B29ActionPerformed(evt);
            }
        });

        B210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B210ActionPerformed(evt);
            }
        });

        B31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B31ActionPerformed(evt);
            }
        });

        B32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B32ActionPerformed(evt);
            }
        });

        B33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B33ActionPerformed(evt);
            }
        });

        B34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B34ActionPerformed(evt);
            }
        });

        B35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B35ActionPerformed(evt);
            }
        });

        B36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B36ActionPerformed(evt);
            }
        });

        B37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B37ActionPerformed(evt);
            }
        });

        B38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B38ActionPerformed(evt);
            }
        });

        B39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B39ActionPerformed(evt);
            }
        });

        B310.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B310ActionPerformed(evt);
            }
        });

        B41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B41ActionPerformed(evt);
            }
        });

        B42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B42ActionPerformed(evt);
            }
        });

        B43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B43ActionPerformed(evt);
            }
        });

        B44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B44ActionPerformed(evt);
            }
        });

        B45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B45ActionPerformed(evt);
            }
        });

        B46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B46ActionPerformed(evt);
            }
        });

        B47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B47ActionPerformed(evt);
            }
        });

        B48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B48ActionPerformed(evt);
            }
        });

        B49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B49ActionPerformed(evt);
            }
        });

        B410.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B410ActionPerformed(evt);
            }
        });

        B51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B51ActionPerformed(evt);
            }
        });

        B52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B52ActionPerformed(evt);
            }
        });

        B53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B53ActionPerformed(evt);
            }
        });

        B54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B54ActionPerformed(evt);
            }
        });

        B55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B55ActionPerformed(evt);
            }
        });

        B56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B56ActionPerformed(evt);
            }
        });

        B57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B57ActionPerformed(evt);
            }
        });

        B58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B58ActionPerformed(evt);
            }
        });

        B59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B59ActionPerformed(evt);
            }
        });

        B510.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B510ActionPerformed(evt);
            }
        });

        B61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B61ActionPerformed(evt);
            }
        });

        B62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B62ActionPerformed(evt);
            }
        });

        B63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B63ActionPerformed(evt);
            }
        });

        B64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B64ActionPerformed(evt);
            }
        });

        B65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B65ActionPerformed(evt);
            }
        });

        B66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B66ActionPerformed(evt);
            }
        });

        B67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B67ActionPerformed(evt);
            }
        });

        B68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B68ActionPerformed(evt);
            }
        });

        B69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B69ActionPerformed(evt);
            }
        });

        B610.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B610ActionPerformed(evt);
            }
        });

        B71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B71ActionPerformed(evt);
            }
        });

        B72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B72ActionPerformed(evt);
            }
        });

        B73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B73ActionPerformed(evt);
            }
        });

        B74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B74ActionPerformed(evt);
            }
        });

        B75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B75ActionPerformed(evt);
            }
        });

        B76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B76ActionPerformed(evt);
            }
        });

        B77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B77ActionPerformed(evt);
            }
        });

        B78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B78ActionPerformed(evt);
            }
        });

        B79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B79ActionPerformed(evt);
            }
        });

        B710.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B710ActionPerformed(evt);
            }
        });

        B81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B81ActionPerformed(evt);
            }
        });

        B82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B82ActionPerformed(evt);
            }
        });

        B83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B83ActionPerformed(evt);
            }
        });

        B84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B84ActionPerformed(evt);
            }
        });

        B85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B85ActionPerformed(evt);
            }
        });

        B86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B86ActionPerformed(evt);
            }
        });

        B87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B87ActionPerformed(evt);
            }
        });

        B88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B88ActionPerformed(evt);
            }
        });

        B89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B89ActionPerformed(evt);
            }
        });

        B810.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B810ActionPerformed(evt);
            }
        });

        B91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B91ActionPerformed(evt);
            }
        });

        B92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B92ActionPerformed(evt);
            }
        });

        B93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B93ActionPerformed(evt);
            }
        });

        B94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B94ActionPerformed(evt);
            }
        });

        B95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B95ActionPerformed(evt);
            }
        });

        B96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B96ActionPerformed(evt);
            }
        });

        B97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B97ActionPerformed(evt);
            }
        });

        B98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B98ActionPerformed(evt);
            }
        });

        B99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B99ActionPerformed(evt);
            }
        });

        B910.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B910ActionPerformed(evt);
            }
        });

        B101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B101ActionPerformed(evt);
            }
        });

        B102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B102ActionPerformed(evt);
            }
        });

        B103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B103ActionPerformed(evt);
            }
        });

        B104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B104ActionPerformed(evt);
            }
        });

        B105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B105ActionPerformed(evt);
            }
        });

        B106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B106ActionPerformed(evt);
            }
        });

        B107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B107ActionPerformed(evt);
            }
        });

        B108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B108ActionPerformed(evt);
            }
        });

        B109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B109ActionPerformed(evt);
            }
        });

        B1010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1010ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("5");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("6");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("7");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("8");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("9");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("10");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("A");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("B");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("C");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("D");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("E");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("F");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("G");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("H");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("I");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("J");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B110, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B210, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B310, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B410, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B510, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B610, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B710, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B85, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B86, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B87, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B89, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B810, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B91, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B92, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B93, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B94, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B95, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B96, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B97, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B98, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B99, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B910, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B101, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B103, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B108, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B109, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B1010, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B110, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B210, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B310, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B410, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B510, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B610, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B710, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B85, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B86, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B87, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B89, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B810, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B91, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B92, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B93, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B94, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B95, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B96, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B97, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B98, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B99, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B910, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B101, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B103, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B108, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B109, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1010, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout PanelJuegoLayout = new javax.swing.GroupLayout(PanelJuego);
        PanelJuego.setLayout(PanelJuegoLayout);
        PanelJuegoLayout.setHorizontalGroup(
            PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJuegoLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelJuegoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelJuegoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelJuegoLayout.createSequentialGroup()
                                .addComponent(vertical, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(horizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212)
                                .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelJuegoLayout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(279, 279, 279))
        );
        PanelJuegoLayout.setVerticalGroup(
            PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJuegoLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addGap(29, 29, 29)
                .addGroup(PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vertical)
                    .addComponent(horizontal)
                    .addComponent(jSalir))
                .addGap(328, 328, 328)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B18ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        x = obtenerX(b18);
        y = obtenerY(b18);
    }//GEN-LAST:event_b18ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        x = obtenerX(b11);
        y = obtenerY(b11);

    }//GEN-LAST:event_b11ActionPerformed

      private void b21ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        x = obtenerX(b18);
        y = obtenerY(b18);
    }                                   

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        x = obtenerX(b11);
        y = obtenerY(b11);

    } 
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed

    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void B24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B24ActionPerformed
        x = obtenerX(b24);
        y = obtenerY(b24);
    }//GEN-LAST:event_B24ActionPerformed

    private void jButton192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton192ActionPerformed

    }//GEN-LAST:event_jButton192ActionPerformed

    private void b109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b109ActionPerformed
        x = obtenerX(b109);
        y = obtenerY(b109);
    }//GEN-LAST:event_b109ActionPerformed

    private void b56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b56ActionPerformed

        x = obtenerX(b56);
        y = obtenerY(b56);
    }//GEN-LAST:event_b56ActionPerformed

    private void b38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b38ActionPerformed
        x = obtenerX(b38);
        y = obtenerY(b38);
    }//GEN-LAST:event_b38ActionPerformed

    private void b1010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1010ActionPerformed
        x = obtenerX(b1010);
        y = obtenerY(b1010);

    }//GEN-LAST:event_b1010ActionPerformed

    private void b99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b99ActionPerformed
        x = obtenerX(b99);
        y = obtenerY(b99);
    }//GEN-LAST:event_b99ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        x = obtenerX(b13);
        y = obtenerY(b13);
    }//GEN-LAST:event_b13ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        x = obtenerX(b15);
        y = obtenerY(b15);
    }//GEN-LAST:event_b15ActionPerformed

    private void b110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b110ActionPerformed
        x = obtenerX(b110);
        y = obtenerY(b110);        // TODO add your handling code here:
    }//GEN-LAST:event_b110ActionPerformed

    private void verticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verticalActionPerformed
        vertical.setEnabled(false);
    }//GEN-LAST:event_verticalActionPerformed

    private void horizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horizontalActionPerformed
        horizontal.setEnabled(false);
    }//GEN-LAST:event_horizontalActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        x = obtenerX(b12);
        y = obtenerY(b12);
    }//GEN-LAST:event_b12ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        x = obtenerX(b14);
        y = obtenerY(b14);
    }//GEN-LAST:event_b14ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        x = obtenerX(b16);
        y = obtenerY(b16);
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        x = obtenerX(b17);
        y = obtenerY(b17);
    }//GEN-LAST:event_b17ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        x = obtenerX(b19);
        y = obtenerY(b19);
    }//GEN-LAST:event_b19ActionPerformed

  
 
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void B1010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1010ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1010ActionPerformed

    private void B110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B110ActionPerformed
        x2 = obtenerX(B110);
        y2 = obtenerY(B110);
    }//GEN-LAST:event_B110ActionPerformed

    private void B19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B19ActionPerformed
        x2 = obtenerX(B19);
        y2 = obtenerY(B19);// TODO add your handling code here:
    }//GEN-LAST:event_B19ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        x2 = obtenerX(B11);
        y2 = obtenerY(B11);// TODO add your handling code here:
    }//GEN-LAST:event_B11ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        x2 = obtenerX(B12);
        y2 = obtenerY(B12); // TODO add your handling code here:
    }//GEN-LAST:event_B12ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
        x2 = obtenerX(B13);
        y2 = obtenerY(B13);// TODO add your handling code here:
    }//GEN-LAST:event_B13ActionPerformed

    private void B14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14ActionPerformed
        x2 = obtenerX(B14);
        y2 = obtenerY(B14);// TODO add your handling code here:
    }//GEN-LAST:event_B14ActionPerformed

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B15ActionPerformed
        x2 = obtenerX(B15);
        y2 = obtenerY(B15);// TODO add your handling code here:
    }//GEN-LAST:event_B15ActionPerformed

    private void B16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B16ActionPerformed
        x2 = obtenerX(B16);
        y2 = obtenerY(B16);// TODO add your handling code here:
    }//GEN-LAST:event_B16ActionPerformed

    private void B17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B17ActionPerformed
        x2 = obtenerX(B17);
        y2 = obtenerY(B17);// TODO add your handling code here:
    }//GEN-LAST:event_B17ActionPerformed

    private void B21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B21ActionPerformed
        x2 = obtenerX(B21);
        y2 = obtenerY(B21);// TODO add your handling code here:
    }//GEN-LAST:event_B21ActionPerformed

    private void B22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B22ActionPerformed
        x2 = obtenerX(B22);
        y2 = obtenerY(B22);
    }//GEN-LAST:event_B22ActionPerformed

    private void B23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B23ActionPerformed
        x2 = obtenerX(B23);
        y2 = obtenerY(B23); // TODO add your handling code here:
    }//GEN-LAST:event_B23ActionPerformed

    private void B25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B25ActionPerformed
        x2 = obtenerX(B25);
        y2 = obtenerY(B25);// TODO add your handling code here:
    }//GEN-LAST:event_B25ActionPerformed

    private void B26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B26ActionPerformed
        x2 = obtenerX(B26);
        y2 = obtenerY(B26);// TODO add your handling code here:
    }//GEN-LAST:event_B26ActionPerformed

    private void B27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B27ActionPerformed
        x2 = obtenerX(B27);
        y2 = obtenerY(B27);// TODO add your handling code here:
    }//GEN-LAST:event_B27ActionPerformed

    private void B28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B28ActionPerformed
        x2 = obtenerX(B28);
        y2 = obtenerY(B28);// TODO add your handling code here:
    }//GEN-LAST:event_B28ActionPerformed

    private void B29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B29ActionPerformed
        x2 = obtenerX(B29);
        y2 = obtenerY(B29);// TODO add your handling code here:
    }//GEN-LAST:event_B29ActionPerformed

    private void B210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B210ActionPerformed
        x2 = obtenerX(B210);
        y2 = obtenerY(B210);// TODO add your handling code here:
    }//GEN-LAST:event_B210ActionPerformed

    private void B31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B31ActionPerformed
        x2 = obtenerX(B31);
        y2 = obtenerY(B31);// TODO add your handling code here:
    }//GEN-LAST:event_B31ActionPerformed

    private void B32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B32ActionPerformed
        x2 = obtenerX(B32);
        y2 = obtenerY(B32);// TODO add your handling code here:
    }//GEN-LAST:event_B32ActionPerformed

    private void B33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B33ActionPerformed
        x2 = obtenerX(B33);
        y2 = obtenerY(B33);// TODO add your handling code here:
    }//GEN-LAST:event_B33ActionPerformed

    private void B34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B34ActionPerformed
        x2 = obtenerX(B34);
        y2 = obtenerY(B34);// TODO add your handling code here:
    }//GEN-LAST:event_B34ActionPerformed

    private void B35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B35ActionPerformed
        x2 = obtenerX(B35);
        y2 = obtenerY(B35);// TODO add your handling code here:
    }//GEN-LAST:event_B35ActionPerformed

    private void B36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B36ActionPerformed
        x2 = obtenerX(B36);
        y2 = obtenerY(B36);// TODO add your handling code here:
    }//GEN-LAST:event_B36ActionPerformed

    private void B37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B37ActionPerformed
        x2 = obtenerX(B37);
        y2 = obtenerY(B37);// TODO add your handling code here:
    }//GEN-LAST:event_B37ActionPerformed

    private void B38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B38ActionPerformed
        x2 = obtenerX(B38);
        y2 = obtenerY(B38);// TODO add your handling code here:
    }//GEN-LAST:event_B38ActionPerformed

    private void B39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B39ActionPerformed
        x2 = obtenerX(B39);
        y2 = obtenerY(B39);// TODO add your handling code here:
    }//GEN-LAST:event_B39ActionPerformed

    private void B310ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B310ActionPerformed
        x2 = obtenerX(B310);
        y2 = obtenerY(B310);// TODO add your handling code here:
    }//GEN-LAST:event_B310ActionPerformed

    private void B41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B41ActionPerformed
        x2 = obtenerX(B41);
        y2 = obtenerY(B41);// TODO add your handling code here:
    }//GEN-LAST:event_B41ActionPerformed

    private void B42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B42ActionPerformed
        x2 = obtenerX(B42);
        y2 = obtenerY(B42); // TODO add your handling code here:
    }//GEN-LAST:event_B42ActionPerformed

    private void B43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B43ActionPerformed
        x2 = obtenerX(B43);
        y2 = obtenerY(B43);// TODO add your handling code here:
    }//GEN-LAST:event_B43ActionPerformed

    private void B44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B44ActionPerformed
        x2 = obtenerX(B44);
        y2 = obtenerY(B44);  // TODO add your handling code here:
    }//GEN-LAST:event_B44ActionPerformed

    private void B45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B45ActionPerformed
        x2 = obtenerX(B45);
        y2 = obtenerY(B45);// TODO add your handling code here:
    }//GEN-LAST:event_B45ActionPerformed

    private void B46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B46ActionPerformed
        x2 = obtenerX(B46);
        y2 = obtenerY(B46);// TODO add your handling code here:
    }//GEN-LAST:event_B46ActionPerformed

    private void B47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B47ActionPerformed
        x2 = obtenerX(B47);
        y2 = obtenerY(B47);// TODO add your handling code here:
    }//GEN-LAST:event_B47ActionPerformed

    private void B48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B48ActionPerformed
        x2 = obtenerX(B48);
        y2 = obtenerY(B48);// TODO add your handling code here:
    }//GEN-LAST:event_B48ActionPerformed

    private void B49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B49ActionPerformed
        x2 = obtenerX(B49);
        y2 = obtenerY(B49);// TODO add your handling code here:
    }//GEN-LAST:event_B49ActionPerformed

    private void B410ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B410ActionPerformed
        x2 = obtenerX(B410);
        y2 = obtenerY(B410);// TODO add your handling code here:
    }//GEN-LAST:event_B410ActionPerformed

    private void B51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B51ActionPerformed
        x2 = obtenerX(B51);
        y2 = obtenerY(B51); // TODO add your handling code here:
    }//GEN-LAST:event_B51ActionPerformed

    private void B52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B52ActionPerformed
        x2 = obtenerX(B52);
        y2 = obtenerY(B52);// TODO add your handling code here:
    }//GEN-LAST:event_B52ActionPerformed

    private void B53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B53ActionPerformed
        x2 = obtenerX(B53);
        y2 = obtenerY(B53);// TODO add your handling code here:
    }//GEN-LAST:event_B53ActionPerformed

    private void B54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B54ActionPerformed
        x2 = obtenerX(B54);
        y2 = obtenerY(B54);// TODO add your handling code here:
    }//GEN-LAST:event_B54ActionPerformed

    private void B55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B55ActionPerformed
        x2 = obtenerX(B55);
        y2 = obtenerY(B55);// TODO add your handling code here:
    }//GEN-LAST:event_B55ActionPerformed

    private void B56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B56ActionPerformed
        x2 = obtenerX(B56);
        y2 = obtenerY(B56);// TODO add your handling code here:
    }//GEN-LAST:event_B56ActionPerformed

    private void B57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B57ActionPerformed
        x2 = obtenerX(B57);
        y2 = obtenerY(B57);// TODO add your handling code here:
    }//GEN-LAST:event_B57ActionPerformed

    private void B58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B58ActionPerformed
        x2 = obtenerX(B58);
        y2 = obtenerY(B58);// TODO add your handling code here:
    }//GEN-LAST:event_B58ActionPerformed

    private void B59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B59ActionPerformed
        x2 = obtenerX(B59);
        y2 = obtenerY(B59);// TODO add your handling code here:
    }//GEN-LAST:event_B59ActionPerformed

    private void B510ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B510ActionPerformed
        x2 = obtenerX(B510);
        y2 = obtenerY(B510);// TODO add your handling code here:
    }//GEN-LAST:event_B510ActionPerformed

    private void B61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B61ActionPerformed
        x2 = obtenerX(B61);
        y2 = obtenerY(B61); // TODO add your handling code here:
    }//GEN-LAST:event_B61ActionPerformed

    private void B62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B62ActionPerformed
        x2 = obtenerX(B62);
        y2 = obtenerY(B62);// TODO add your handling code here:
    }//GEN-LAST:event_B62ActionPerformed

    private void B63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B63ActionPerformed
        x2 = obtenerX(B63);
        y2 = obtenerY(B63);// TODO add your handling code here:
    }//GEN-LAST:event_B63ActionPerformed

    private void B64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B64ActionPerformed
        x2 = obtenerX(B64);
        y2 = obtenerY(B64);// TODO add your handling code here:
    }//GEN-LAST:event_B64ActionPerformed

    private void B65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B65ActionPerformed
        x2 = obtenerX(B65);
        y2 = obtenerY(B65);// TODO add your handling code here:
    }//GEN-LAST:event_B65ActionPerformed

    private void B66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B66ActionPerformed
        x2 = obtenerX(B66);
        y2 = obtenerY(B66);// TODO add your handling code here:
    }//GEN-LAST:event_B66ActionPerformed

    private void B67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B67ActionPerformed
        x2 = obtenerX(B67);
        y2 = obtenerY(B67);// TODO add your handling code here:
    }//GEN-LAST:event_B67ActionPerformed

    private void B68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B68ActionPerformed
        x2 = obtenerX(B68);
        y2 = obtenerY(B68);// TODO add your handling code here:
    }//GEN-LAST:event_B68ActionPerformed

    private void B69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B69ActionPerformed
        x2 = obtenerX(B69);
        y2 = obtenerY(B69);// TODO add your handling code here:
    }//GEN-LAST:event_B69ActionPerformed

    private void B610ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B610ActionPerformed
        x2 = obtenerX(B610);
        y2 = obtenerY(B610);// TODO add your handling code here:
    }//GEN-LAST:event_B610ActionPerformed

    private void B71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B71ActionPerformed
        x2 = obtenerX(B71);
        y2 = obtenerY(B71);// TODO add your handling code here:
    }//GEN-LAST:event_B71ActionPerformed

    private void B72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B72ActionPerformed
        x2 = obtenerX(B72);
        y2 = obtenerY(B72);// TODO add your handling code here:
    }//GEN-LAST:event_B72ActionPerformed

    private void B73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B73ActionPerformed
        x2 = obtenerX(B73);
        y2 = obtenerY(B73);// TODO add your handling code here:
    }//GEN-LAST:event_B73ActionPerformed

    private void B74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B74ActionPerformed
        x2 = obtenerX(B74);
        y2 = obtenerY(B74);// TODO add your handling code here:
    }//GEN-LAST:event_B74ActionPerformed

    private void B75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B75ActionPerformed
        x2 = obtenerX(B75);
        y2 = obtenerY(B75);// TODO add your handling code here:
    }//GEN-LAST:event_B75ActionPerformed

    private void B76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B76ActionPerformed
        x2 = obtenerX(B76);
        y2 = obtenerY(B76);// TODO add your handling code here:
    }//GEN-LAST:event_B76ActionPerformed

    private void B77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B77ActionPerformed
        x2 = obtenerX(B77);
        y2 = obtenerY(B77);// TODO add your handling code here:
    }//GEN-LAST:event_B77ActionPerformed

    private void B78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B78ActionPerformed
        x2 = obtenerX(B78);
        y2 = obtenerY(B78);// TODO add your handling code here:
    }//GEN-LAST:event_B78ActionPerformed

    private void B79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B79ActionPerformed
        x2 = obtenerX(B79);
        y2 = obtenerY(B79);// TODO add your handling code here:
    }//GEN-LAST:event_B79ActionPerformed

    private void B710ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B710ActionPerformed
        x2 = obtenerX(B710);
        y2 = obtenerY(B710);// TODO add your handling code here:
    }//GEN-LAST:event_B710ActionPerformed

    private void B81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B81ActionPerformed
        x2 = obtenerX(B81);
        y2 = obtenerY(B81); // TODO add your handling code here:
    }//GEN-LAST:event_B81ActionPerformed

    private void B82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B82ActionPerformed
        x2 = obtenerX(B82);
        y2 = obtenerY(B82); // TODO add your handling code here:
    }//GEN-LAST:event_B82ActionPerformed

    private void B83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B83ActionPerformed
        x2 = obtenerX(B83);
        y2 = obtenerY(B83);// TODO add your handling code here:
    }//GEN-LAST:event_B83ActionPerformed

    private void B84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B84ActionPerformed
        x2 = obtenerX(B84);
        y2 = obtenerY(B84);// TODO add your handling code here:
    }//GEN-LAST:event_B84ActionPerformed

    private void B85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B85ActionPerformed
        x2 = obtenerX(B85);
        y2 = obtenerY(B85);// TODO add your handling code here:
    }//GEN-LAST:event_B85ActionPerformed

    private void B86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B86ActionPerformed
        x2 = obtenerX(B86);
        y2 = obtenerY(B86);// TODO add your handling code here:
    }//GEN-LAST:event_B86ActionPerformed

    private void B87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B87ActionPerformed
        x2 = obtenerX(B87);
        y2 = obtenerY(B87);// TODO add your handling code here:
    }//GEN-LAST:event_B87ActionPerformed

    private void B88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B88ActionPerformed
        x2 = obtenerX(B88);
        y2 = obtenerY(B88);// TODO add your handling code here:
    }//GEN-LAST:event_B88ActionPerformed

    private void B89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B89ActionPerformed
        x2 = obtenerX(B89);
        y2 = obtenerY(B89);// TODO add your handling code here:
    }//GEN-LAST:event_B89ActionPerformed

    private void B810ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B810ActionPerformed
        x2 = obtenerX(B810);
        y2 = obtenerY(B810);// TODO add your handling code here:
    }//GEN-LAST:event_B810ActionPerformed

    private void B91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B91ActionPerformed
        x2 = obtenerX(B91);
        y2 = obtenerY(B91);// TODO add your handling code here:
    }//GEN-LAST:event_B91ActionPerformed

    private void B92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B92ActionPerformed
        x2 = obtenerX(B92);
        y2 = obtenerY(B92);// TODO add your handling code here:
    }//GEN-LAST:event_B92ActionPerformed

    private void B93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B93ActionPerformed
        x2 = obtenerX(B93);
        y2 = obtenerY(B93);// TODO add your handling code here:
    }//GEN-LAST:event_B93ActionPerformed

    private void B94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B94ActionPerformed
        x2 = obtenerX(B94);
        y2 = obtenerY(B94);// TODO add your handling code here:
    }//GEN-LAST:event_B94ActionPerformed

    private void B95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B95ActionPerformed
        x2 = obtenerX(B95);
        y2 = obtenerY(B95);// TODO add your handling code here:
    }//GEN-LAST:event_B95ActionPerformed

    private void B96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B96ActionPerformed
        x2 = obtenerX(B96);
        y2 = obtenerY(B96);// TODO add your handling code here:
    }//GEN-LAST:event_B96ActionPerformed

    private void B97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B97ActionPerformed
        x2 = obtenerX(B97);
        y2 = obtenerY(B97);// TODO add your handling code here:
    }//GEN-LAST:event_B97ActionPerformed

    private void B98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B98ActionPerformed
        x2 = obtenerX(B98);
        y2 = obtenerY(B98);// TODO add your handling code here:
    }//GEN-LAST:event_B98ActionPerformed

    private void B99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B99ActionPerformed
        x2 = obtenerX(B99);
        y2 = obtenerY(B99);// TODO add your handling code here:
    }//GEN-LAST:event_B99ActionPerformed

    private void B910ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B910ActionPerformed
        x2 = obtenerX(B910);
        y2 = obtenerY(B910);// TODO add your handling code here:
    }//GEN-LAST:event_B910ActionPerformed

    private void B101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B101ActionPerformed
        x2 = obtenerX(B101);
        y2 = obtenerY(B101);// TODO add your handling code here:
    }//GEN-LAST:event_B101ActionPerformed

    private void B102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B102ActionPerformed
        x2 = obtenerX(B102);
        y2 = obtenerY(B102);// TODO add your handling code here:
    }//GEN-LAST:event_B102ActionPerformed

    private void B103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B103ActionPerformed
        x2 = obtenerX(B103);
        y2 = obtenerY(B103);// TODO add your handling code here:
    }//GEN-LAST:event_B103ActionPerformed

    private void B104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B104ActionPerformed
        x2 = obtenerX(B104);
        y2 = obtenerY(B104);// TODO add your handling code here:
    }//GEN-LAST:event_B104ActionPerformed

    private void B105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B105ActionPerformed
        x2 = obtenerX(B105);
        y2 = obtenerY(B105);// TODO add your handling code here:
    }//GEN-LAST:event_B105ActionPerformed

    private void B106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B106ActionPerformed
        x2 = obtenerX(B106);
        y2 = obtenerY(B106);// TODO add your handling code here:
    }//GEN-LAST:event_B106ActionPerformed

    private void B107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B107ActionPerformed
        x2 = obtenerX(B107);
        y2 = obtenerY(B107);// TODO add your handling code here:
    }//GEN-LAST:event_B107ActionPerformed

    private void B108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B108ActionPerformed
        x2 = obtenerX(B108);
        y2 = obtenerY(B108);// TODO add your handling code here:
    }//GEN-LAST:event_B108ActionPerformed

    private void B109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B109ActionPerformed
        x2 = obtenerX(B109);
        y2 = obtenerY(B109);// TODO add your handling code here:
    }//GEN-LAST:event_B109ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
       
    }//GEN-LAST:event_b23ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b24ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b25ActionPerformed

    private void B20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B20ActionPerformed

    private void B30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B30ActionPerformed

    private void B40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B40ActionPerformed

    private void B50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B50ActionPerformed

    private void B60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B60ActionPerformed

    private void B70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B70ActionPerformed

    private void B80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B80ActionPerformed

    private void B90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B90ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B90ActionPerformed

    private void B100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B100ActionPerformed

    private void B111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B111ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B111ActionPerformed

    private void B112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B112ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B112ActionPerformed

    private void B113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B113ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B113ActionPerformed

    private void B114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B114ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B114ActionPerformed

    private void B115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B115ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B115ActionPerformed

    private void B116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B116ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B116ActionPerformed

    private void B117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B117ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B117ActionPerformed

    private void B118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B118ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B118ActionPerformed

    private void B119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B119ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B119ActionPerformed

    private void B120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B120ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B120ActionPerformed

    private void B211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B211ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B211ActionPerformed

    private void B121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B121ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B121ActionPerformed

    private void B122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B122ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B122ActionPerformed

    private void B123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B123ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B123ActionPerformed

    private void B124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B124ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B124ActionPerformed

    private void B125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B125ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B125ActionPerformed

    private void B126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B126ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B126ActionPerformed

    private void B127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B127ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B127ActionPerformed

    private void B128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B128ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B128ActionPerformed

    private void B129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B129ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B129ActionPerformed

    private void B311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B311ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B311ActionPerformed

    private void B130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B130ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B130ActionPerformed

    private void B131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B131ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B131ActionPerformed

    private void B132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B132ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B132ActionPerformed

    private void B133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B133ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B133ActionPerformed

    private void B134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B134ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B134ActionPerformed

    private void B135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B135ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B135ActionPerformed

    private void B136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B136ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B136ActionPerformed

    private void B137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B137ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B137ActionPerformed

    private void B138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B138ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B138ActionPerformed

    private void B411ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B411ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B411ActionPerformed

    private void B139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B139ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B139ActionPerformed

    private void B140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B140ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B140ActionPerformed

    private void B141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B141ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B141ActionPerformed

    private void B142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B142ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B142ActionPerformed

    private void B143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B143ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B143ActionPerformed

    private void B144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B144ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B144ActionPerformed

    private void B145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B145ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B145ActionPerformed

    private void B146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B146ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B146ActionPerformed

    private void B147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B147ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B147ActionPerformed

    private void B511ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B511ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B511ActionPerformed

    private void B148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B148ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B148ActionPerformed

    private void B149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B149ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B149ActionPerformed

    private void B150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B150ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B150ActionPerformed

    private void B151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B151ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B151ActionPerformed

    private void B152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B152ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B152ActionPerformed

    private void B153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B153ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B153ActionPerformed

    private void B154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B154ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B154ActionPerformed

    private void B155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B155ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B155ActionPerformed

    private void B156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B156ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B156ActionPerformed

    private void B611ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B611ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B611ActionPerformed

    private void B157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B157ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B157ActionPerformed

    private void B158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B158ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B158ActionPerformed

    private void B159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B159ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B159ActionPerformed

    private void B160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B160ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B160ActionPerformed

    private void B161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B161ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B161ActionPerformed

    private void B162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B162ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B162ActionPerformed

    private void B163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B163ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B163ActionPerformed

    private void B164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B164ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B164ActionPerformed

    private void B165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B165ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B165ActionPerformed

    private void B711ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B711ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B711ActionPerformed

    private void B166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B166ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B166ActionPerformed

    private void B167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B167ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B167ActionPerformed

    private void B168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B168ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B168ActionPerformed

    private void B169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B169ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B169ActionPerformed

    private void B170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B170ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B170ActionPerformed

    private void B171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B171ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B171ActionPerformed

    private void B172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B172ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B172ActionPerformed

    private void B173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B173ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B173ActionPerformed

    private void B174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B174ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B174ActionPerformed

    private void B811ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B811ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B811ActionPerformed

    private void B175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B175ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B175ActionPerformed

    private void B176ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B176ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B176ActionPerformed

    private void B177ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B177ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B177ActionPerformed

    private void B178ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B178ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B178ActionPerformed

    private void B179ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B179ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B179ActionPerformed

    private void B180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B180ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B180ActionPerformed

    private void B181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B181ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B181ActionPerformed

    private void B182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B182ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B182ActionPerformed

    private void B183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B183ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B183ActionPerformed

    private void B911ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B911ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B911ActionPerformed

    private void B184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B184ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B184ActionPerformed

    private void B185ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B185ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B185ActionPerformed

    private void B186ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B186ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B186ActionPerformed

    private void B187ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B187ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B187ActionPerformed

    private void B188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B188ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B188ActionPerformed

    private void B189ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B189ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B189ActionPerformed

    private void B190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B190ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B190ActionPerformed

    private void B191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B191ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B191ActionPerformed

    private void B192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B192ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B192ActionPerformed

    private void B1011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1011ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1011ActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jSalirActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton B100;
    public javax.swing.JButton B101;
    public javax.swing.JButton B1010;
    public javax.swing.JButton B1011;
    public javax.swing.JButton B102;
    public javax.swing.JButton B103;
    public javax.swing.JButton B104;
    public javax.swing.JButton B105;
    public javax.swing.JButton B106;
    public javax.swing.JButton B107;
    public javax.swing.JButton B108;
    public javax.swing.JButton B109;
    public javax.swing.JButton B11;
    public javax.swing.JButton B110;
    public javax.swing.JButton B111;
    public javax.swing.JButton B112;
    public javax.swing.JButton B113;
    public javax.swing.JButton B114;
    public javax.swing.JButton B115;
    public javax.swing.JButton B116;
    public javax.swing.JButton B117;
    public javax.swing.JButton B118;
    public javax.swing.JButton B119;
    public javax.swing.JButton B12;
    public javax.swing.JButton B120;
    public javax.swing.JButton B121;
    public javax.swing.JButton B122;
    public javax.swing.JButton B123;
    public javax.swing.JButton B124;
    public javax.swing.JButton B125;
    public javax.swing.JButton B126;
    public javax.swing.JButton B127;
    public javax.swing.JButton B128;
    public javax.swing.JButton B129;
    public javax.swing.JButton B13;
    public javax.swing.JButton B130;
    public javax.swing.JButton B131;
    public javax.swing.JButton B132;
    public javax.swing.JButton B133;
    public javax.swing.JButton B134;
    public javax.swing.JButton B135;
    public javax.swing.JButton B136;
    public javax.swing.JButton B137;
    public javax.swing.JButton B138;
    public javax.swing.JButton B139;
    public javax.swing.JButton B14;
    public javax.swing.JButton B140;
    public javax.swing.JButton B141;
    public javax.swing.JButton B142;
    public javax.swing.JButton B143;
    public javax.swing.JButton B144;
    public javax.swing.JButton B145;
    public javax.swing.JButton B146;
    public javax.swing.JButton B147;
    public javax.swing.JButton B148;
    public javax.swing.JButton B149;
    public javax.swing.JButton B15;
    public javax.swing.JButton B150;
    public javax.swing.JButton B151;
    public javax.swing.JButton B152;
    public javax.swing.JButton B153;
    public javax.swing.JButton B154;
    public javax.swing.JButton B155;
    public javax.swing.JButton B156;
    public javax.swing.JButton B157;
    public javax.swing.JButton B158;
    public javax.swing.JButton B159;
    public javax.swing.JButton B16;
    public javax.swing.JButton B160;
    public javax.swing.JButton B161;
    public javax.swing.JButton B162;
    public javax.swing.JButton B163;
    public javax.swing.JButton B164;
    public javax.swing.JButton B165;
    public javax.swing.JButton B166;
    public javax.swing.JButton B167;
    public javax.swing.JButton B168;
    public javax.swing.JButton B169;
    public javax.swing.JButton B17;
    public javax.swing.JButton B170;
    public javax.swing.JButton B171;
    public javax.swing.JButton B172;
    public javax.swing.JButton B173;
    public javax.swing.JButton B174;
    public javax.swing.JButton B175;
    public javax.swing.JButton B176;
    public javax.swing.JButton B177;
    public javax.swing.JButton B178;
    public javax.swing.JButton B179;
    public javax.swing.JButton B18;
    public javax.swing.JButton B180;
    public javax.swing.JButton B181;
    public javax.swing.JButton B182;
    public javax.swing.JButton B183;
    public javax.swing.JButton B184;
    public javax.swing.JButton B185;
    public javax.swing.JButton B186;
    public javax.swing.JButton B187;
    public javax.swing.JButton B188;
    public javax.swing.JButton B189;
    public javax.swing.JButton B19;
    public javax.swing.JButton B190;
    public javax.swing.JButton B191;
    public javax.swing.JButton B192;
    public javax.swing.JButton B20;
    public javax.swing.JButton B21;
    public javax.swing.JButton B210;
    public javax.swing.JButton B211;
    public javax.swing.JButton B22;
    public javax.swing.JButton B23;
    public javax.swing.JButton B24;
    public javax.swing.JButton B25;
    public javax.swing.JButton B26;
    public javax.swing.JButton B27;
    public javax.swing.JButton B28;
    public javax.swing.JButton B29;
    public javax.swing.JButton B30;
    public javax.swing.JButton B31;
    public javax.swing.JButton B310;
    public javax.swing.JButton B311;
    public javax.swing.JButton B32;
    public javax.swing.JButton B33;
    public javax.swing.JButton B34;
    public javax.swing.JButton B35;
    public javax.swing.JButton B36;
    public javax.swing.JButton B37;
    public javax.swing.JButton B38;
    public javax.swing.JButton B39;
    public javax.swing.JButton B40;
    public javax.swing.JButton B41;
    public javax.swing.JButton B410;
    public javax.swing.JButton B411;
    public javax.swing.JButton B42;
    public javax.swing.JButton B43;
    public javax.swing.JButton B44;
    public javax.swing.JButton B45;
    public javax.swing.JButton B46;
    public javax.swing.JButton B47;
    public javax.swing.JButton B48;
    public javax.swing.JButton B49;
    public javax.swing.JButton B50;
    public javax.swing.JButton B51;
    public javax.swing.JButton B510;
    public javax.swing.JButton B511;
    public javax.swing.JButton B52;
    public javax.swing.JButton B53;
    public javax.swing.JButton B54;
    public javax.swing.JButton B55;
    public javax.swing.JButton B56;
    public javax.swing.JButton B57;
    public javax.swing.JButton B58;
    public javax.swing.JButton B59;
    public javax.swing.JButton B60;
    public javax.swing.JButton B61;
    public javax.swing.JButton B610;
    public javax.swing.JButton B611;
    public javax.swing.JButton B62;
    public javax.swing.JButton B63;
    public javax.swing.JButton B64;
    public javax.swing.JButton B65;
    public javax.swing.JButton B66;
    public javax.swing.JButton B67;
    public javax.swing.JButton B68;
    public javax.swing.JButton B69;
    public javax.swing.JButton B70;
    public javax.swing.JButton B71;
    public javax.swing.JButton B710;
    public javax.swing.JButton B711;
    public javax.swing.JButton B72;
    public javax.swing.JButton B73;
    public javax.swing.JButton B74;
    public javax.swing.JButton B75;
    public javax.swing.JButton B76;
    public javax.swing.JButton B77;
    public javax.swing.JButton B78;
    public javax.swing.JButton B79;
    public javax.swing.JButton B80;
    public javax.swing.JButton B81;
    public javax.swing.JButton B810;
    public javax.swing.JButton B811;
    public javax.swing.JButton B82;
    public javax.swing.JButton B83;
    public javax.swing.JButton B84;
    public javax.swing.JButton B85;
    public javax.swing.JButton B86;
    public javax.swing.JButton B87;
    public javax.swing.JButton B88;
    public javax.swing.JButton B89;
    public javax.swing.JButton B90;
    public javax.swing.JButton B91;
    public javax.swing.JButton B910;
    public javax.swing.JButton B911;
    public javax.swing.JButton B92;
    public javax.swing.JButton B93;
    public javax.swing.JButton B94;
    public javax.swing.JButton B95;
    public javax.swing.JButton B96;
    public javax.swing.JButton B97;
    public javax.swing.JButton B98;
    public javax.swing.JButton B99;
    public javax.swing.JPanel PanelJuego;
    public javax.swing.JButton b101;
    public javax.swing.JButton b1010;
    public javax.swing.JButton b102;
    public javax.swing.JButton b103;
    public javax.swing.JButton b104;
    public javax.swing.JButton b105;
    public javax.swing.JButton b106;
    public javax.swing.JButton b107;
    public javax.swing.JButton b108;
    public javax.swing.JButton b109;
    public javax.swing.JButton b11;
    public javax.swing.JButton b110;
    public javax.swing.JButton b12;
    public javax.swing.JButton b13;
    public javax.swing.JButton b14;
    public javax.swing.JButton b15;
    public javax.swing.JButton b16;
    public javax.swing.JButton b17;
    public javax.swing.JButton b18;
    public javax.swing.JButton b19;
    public javax.swing.JButton b21;
    public javax.swing.JButton b210;
    public javax.swing.JButton b22;
    public javax.swing.JButton b23;
    public javax.swing.JButton b24;
    public javax.swing.JButton b25;
    public javax.swing.JButton b26;
    public javax.swing.JButton b27;
    public javax.swing.JButton b28;
    public javax.swing.JButton b29;
    public javax.swing.JButton b31;
    public javax.swing.JButton b310;
    public javax.swing.JButton b32;
    public javax.swing.JButton b33;
    public javax.swing.JButton b34;
    public javax.swing.JButton b35;
    public javax.swing.JButton b36;
    public javax.swing.JButton b37;
    public javax.swing.JButton b38;
    public javax.swing.JButton b39;
    public javax.swing.JButton b41;
    public javax.swing.JButton b410;
    public javax.swing.JButton b42;
    public javax.swing.JButton b43;
    public javax.swing.JButton b44;
    public javax.swing.JButton b45;
    public javax.swing.JButton b46;
    public javax.swing.JButton b47;
    public javax.swing.JButton b48;
    public javax.swing.JButton b49;
    public javax.swing.JButton b51;
    public javax.swing.JButton b510;
    public javax.swing.JButton b52;
    public javax.swing.JButton b53;
    public javax.swing.JButton b54;
    public javax.swing.JButton b55;
    public javax.swing.JButton b56;
    public javax.swing.JButton b57;
    public javax.swing.JButton b58;
    public javax.swing.JButton b59;
    public javax.swing.JButton b61;
    public javax.swing.JButton b610;
    public javax.swing.JButton b62;
    public javax.swing.JButton b63;
    public javax.swing.JButton b64;
    public javax.swing.JButton b65;
    public javax.swing.JButton b66;
    public javax.swing.JButton b67;
    public javax.swing.JButton b68;
    public javax.swing.JButton b69;
    public javax.swing.JButton b71;
    public javax.swing.JButton b710;
    public javax.swing.JButton b72;
    public javax.swing.JButton b73;
    public javax.swing.JButton b74;
    public javax.swing.JButton b75;
    public javax.swing.JButton b76;
    public javax.swing.JButton b77;
    public javax.swing.JButton b78;
    public javax.swing.JButton b79;
    public javax.swing.JButton b81;
    public javax.swing.JButton b810;
    public javax.swing.JButton b82;
    public javax.swing.JButton b83;
    public javax.swing.JButton b84;
    public javax.swing.JButton b85;
    public javax.swing.JButton b86;
    public javax.swing.JButton b88;
    public javax.swing.JButton b89;
    public javax.swing.JButton b91;
    public javax.swing.JButton b910;
    public javax.swing.JButton b92;
    public javax.swing.JButton b93;
    public javax.swing.JButton b94;
    public javax.swing.JButton b95;
    public javax.swing.JButton b96;
    public javax.swing.JButton b97;
    public javax.swing.JButton b98;
    public javax.swing.JButton b99;
    public javax.swing.JButton horizontal;
    public javax.swing.JButton jButton217;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanel9;
    public javax.swing.JButton jSalir;
    public javax.swing.JButton vertical;
    // End of variables declaration//GEN-END:variables
}
