package calculadora;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author Jose Ignacio
 */
public class Calculadora extends javax.swing.JFrame {

    public float numero1, numero2;
    public String operador;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtentrada = new javax.swing.JTextField();
        btn_oscuro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_signo = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_x = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtentrada.setEditable(false);
        txtentrada.setBackground(new java.awt.Color(244, 253, 251));
        txtentrada.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        txtentrada.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtentrada.setBorder(null);
        jPanel1.add(txtentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 80));

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkmode_1.png"))); // NOI18N
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 20));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("•");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 20));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("•");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_igual.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        btn_9.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        btn_signo.setFont(new java.awt.Font("Roboto Light", 0, 15)); // NOI18N
        btn_signo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_signo.setText("+/-");
        btn_signo.setFocusPainted(false);
        btn_signo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_signo.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_signo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_signo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_signo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        btn_porcentaje.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_porcentaje.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        btn_dividir.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_dividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_dividir.setText("/");
        btn_dividir.setFocusPainted(false);
        btn_dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dividir.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_dividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_dividir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        btn_x.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_x.setText("x");
        btn_x.setFocusPainted(false);
        btn_x.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_x.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_x.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_x.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xActionPerformed(evt);
            }
        });
        jPanel2.add(btn_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        btn_menos.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_menos.setText("-");
        btn_menos.setFocusPainted(false);
        btn_menos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_menos.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_menos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_menos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        btn_mas.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_mas.setText("+");
        btn_mas.setFocusPainted(false);
        btn_mas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mas.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_mas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_mas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        btn_c.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_c.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btn_7.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        btn_8.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        btn_4.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        btn_5.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        btn_6.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        btn_1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        btn_2.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        btn_3.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        btn_0.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_0.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btn_punto.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_punto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 340, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtentrada.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        txtentrada.setText(txtentrada.getText() + "7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        txtentrada.setText(txtentrada.getText() + "8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        txtentrada.setText(txtentrada.getText() + "9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        txtentrada.setText(txtentrada.getText() + "4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        txtentrada.setText(txtentrada.getText() + "5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        txtentrada.setText(txtentrada.getText() + "6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        txtentrada.setText(txtentrada.getText() + "1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        txtentrada.setText(txtentrada.getText() + "2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        txtentrada.setText(txtentrada.getText() + "3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_signoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signoActionPerformed
        try {
            String entero;
            double cambio;
            cambio = Double.parseDouble(txtentrada.getText());
            cambio = (cambio * -1);
            if (cambio % 1 == 0) {
                entero = Double.toString(cambio);
                txtentrada.setText(entero.substring(0, entero.length() - 2));
            } else {
                txtentrada.setText(Double.toString(cambio));
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_signoActionPerformed


    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        try {
            numero1 = Float.parseFloat(txtentrada.getText());
            operador = "%";
            txtentrada.setText("");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        try {
            numero1 = Float.parseFloat(txtentrada.getText());
            operador = "/";
            txtentrada.setText("");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void btn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xActionPerformed
        try {
            numero1 = Float.parseFloat(txtentrada.getText());
            operador = "*";
            txtentrada.setText("");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_xActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        try {

            numero1 = Float.parseFloat(txtentrada.getText());
            operador = "-";
            txtentrada.setText("");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masActionPerformed
        try {

            numero1 = Float.parseFloat(txtentrada.getText());
            operador = "+";
            txtentrada.setText("");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_masActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        if (!txtentrada.getText().contains(".")) {
            txtentrada.setText((txtentrada.getText() + "."));
        }
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        txtentrada.setText(txtentrada.getText() + "0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        String entero;
        float Resultado;
        try {
            numero2 = Float.parseFloat(txtentrada.getText());
            switch (operador) {
                case "+" -> {
                    Resultado = (numero1 + numero2);
                    if (Resultado % 1 == 0) {
                        entero = Float.toString(Resultado);
                        txtentrada.setText(entero.substring(0, entero.length() - 2));
                    } else {
                        txtentrada.setText(Float.toString(Resultado));
                    }
                }
                case "-" -> {
                    Resultado = (numero1 - numero2);
                    if (Resultado % 1 == 0) {
                        entero = Float.toString(Resultado);
                        txtentrada.setText(entero.substring(0, entero.length() - 2));
                    } else {
                        txtentrada.setText(Float.toString(Resultado));
                    }
                }

                case "*" -> {
                    Resultado = (numero1 * numero2);
                    if (Resultado % 1 == 0) {
                        entero = Float.toString(Resultado);
                        txtentrada.setText(entero.substring(0, entero.length() - 2));
                    } else {
                        txtentrada.setText(Float.toString(Resultado));
                    }
                }

                case "/" -> {
                    Resultado = (numero1 / numero2);
                    if (numero1 == 0 || numero2 == 0) {
                        txtentrada.setText("Error");
                    } else if (Resultado % 1 == 0) {
                        entero = Float.toString(Resultado);
                        txtentrada.setText(entero.substring(0, entero.length() - 2));
                    } else {
                        txtentrada.setText(Float.toString(Resultado));
                    }
                }
                case "%" -> {
                    txtentrada.setText(Double.toString(numero2 * (numero1 / 100.0)));
                }

            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_btn_igualActionPerformed

    boolean modoOscuro = false;
    
    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if(!modoOscuro){
        jPanel1.setBackground(Color.decode("#212b41"));
        txtentrada.setBackground(Color.decode("#212b41"));
        txtentrada.setForeground(Color.decode("#0db387"));
        jPanel2.setBackground(Color.decode("#2e3951"));
        
        cambiarcolorbtn1(btn_x);
        cambiarcolorbtn1(btn_c);
        cambiarcolorbtn1(btn_dividir);
        cambiarcolorbtn1(btn_signo);
        cambiarcolorbtn1(btn_mas);
        cambiarcolorbtn1(btn_menos);
        cambiarcolorbtn1(btn_porcentaje);
       
        
        cambiarcolorbtn2(btn_1);
        cambiarcolorbtn2(btn_2);
        cambiarcolorbtn2(btn_3);
        cambiarcolorbtn2(btn_4);
        cambiarcolorbtn2(btn_5);
        cambiarcolorbtn2(btn_6);
        cambiarcolorbtn2(btn_7);
        cambiarcolorbtn2(btn_8);
        cambiarcolorbtn2(btn_9);
        cambiarcolorbtn2(btn_0);
        cambiarcolorbtn2(btn_punto);
        
        btn_oscuro.setIcon(new ImageIcon(getClass().getResource("/images/darkmode_2.png")));
        
        btn_igual.setIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
        btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png")));
        btn_igual.setForeground(Color.BLACK);
        
        modoOscuro = true;
        }else{
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        
        
        }
       
        
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    public void cambiarcolorbtn1(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png")));
        btn.setForeground(Color.decode("#0db387"));
    }
    
    
    public void cambiarcolorbtn2(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#96a8a0"));
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_signo;
    private javax.swing.JButton btn_x;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtentrada;
    // End of variables declaration//GEN-END:variables
}
