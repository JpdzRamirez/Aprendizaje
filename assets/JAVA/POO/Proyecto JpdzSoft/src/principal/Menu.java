/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static java.awt.Frame.MAXIMIZED_BOTH;
import paneles.CambiaPanel;

/**
 *
 * @author doble
 */
public class Menu extends javax.swing.JFrame {
    
    /**
    int tamañoArreglo;
    
    public void setTamañoArreglo(int _tamañoArreglo){
    tamañoArreglo=_tamañoArreglo;
    }
    **/
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
       //this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.uno.setSelected(true);
        new CambiaPanel(pnlPrincipal, new paneles.pnlHome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Board = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();
        ColorBordeR = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Desplegable = new javax.swing.JPanel();
        Menu = new javax.swing.JLabel();
        uno = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        tres = new rsbuttom.RSButtonMetro();
        cuatro = new rsbuttom.RSButtonMetro();
        uno1 = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1309, 814));
        setPreferredSize(new java.awt.Dimension(1309, 814));
        setSize(new java.awt.Dimension(1309, 814));

        Board.setBackground(new java.awt.Color(255, 255, 255));

        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        javax.swing.GroupLayout BoardLayout = new javax.swing.GroupLayout(Board);
        Board.setLayout(BoardLayout);
        BoardLayout.setHorizontalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        BoardLayout.setVerticalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        ColorBordeR.setBackground(new java.awt.Color(255, 51, 51));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/menu.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("JpdzSoft");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Software.png"))); // NOI18N

        javax.swing.GroupLayout ColorBordeRLayout = new javax.swing.GroupLayout(ColorBordeR);
        ColorBordeR.setLayout(ColorBordeRLayout);
        ColorBordeRLayout.setHorizontalGroup(
            ColorBordeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColorBordeRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30))
        );
        ColorBordeRLayout.setVerticalGroup(
            ColorBordeRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColorBordeRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(ColorBordeRLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ColorBordeRLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Desplegable.setBackground(new java.awt.Color(204, 204, 204));
        Desplegable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Menu.setText("Menu");

        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home (1).png"))); // NOI18N
        uno.setText(" Home");
        uno.setColorBorde(javax.swing.BorderFactory.createEtchedBorder());
        uno.setColorHover(new java.awt.Color(255, 204, 0));
        uno.setColorNormal(new java.awt.Color(204, 204, 204));
        uno.setColorPressed(new java.awt.Color(240, 240, 240));
        uno.setColorTextHover(new java.awt.Color(0, 0, 0));
        uno.setColorTextNormal(new java.awt.Color(0, 0, 0));
        uno.setColorTextPressed(new java.awt.Color(0, 0, 0));
        uno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Calculadora.png"))); // NOI18N
        dos.setText("Herramientas Calculadora");
        dos.setColorBorde(javax.swing.BorderFactory.createEtchedBorder());
        dos.setColorHover(new java.awt.Color(255, 204, 0));
        dos.setColorNormal(new java.awt.Color(204, 204, 204));
        dos.setColorPressed(new java.awt.Color(240, 240, 240));
        dos.setColorTextHover(new java.awt.Color(0, 0, 0));
        dos.setColorTextNormal(new java.awt.Color(0, 0, 0));
        dos.setColorTextPressed(new java.awt.Color(0, 0, 0));
        dos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/POS.png"))); // NOI18N
        tres.setText("Herramientas POS");
        tres.setColorBorde(javax.swing.BorderFactory.createEtchedBorder());
        tres.setColorHover(new java.awt.Color(255, 204, 0));
        tres.setColorNormal(new java.awt.Color(204, 204, 204));
        tres.setColorPressed(new java.awt.Color(240, 240, 240));
        tres.setColorTextHover(new java.awt.Color(0, 0, 0));
        tres.setColorTextNormal(new java.awt.Color(0, 0, 0));
        tres.setColorTextPressed(new java.awt.Color(0, 0, 0));
        tres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/contrato.png"))); // NOI18N
        cuatro.setText("Herramienta Listas");
        cuatro.setColorBorde(javax.swing.BorderFactory.createEtchedBorder());
        cuatro.setColorHover(new java.awt.Color(255, 204, 0));
        cuatro.setColorNormal(new java.awt.Color(204, 204, 204));
        cuatro.setColorPressed(new java.awt.Color(240, 240, 240));
        cuatro.setColorTextHover(new java.awt.Color(0, 0, 0));
        cuatro.setColorTextNormal(new java.awt.Color(0, 0, 0));
        cuatro.setColorTextPressed(new java.awt.Color(0, 0, 0));
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        uno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/salida.png"))); // NOI18N
        uno1.setText("Salir");
        uno1.setColorBorde(javax.swing.BorderFactory.createEtchedBorder());
        uno1.setColorHover(new java.awt.Color(255, 204, 0));
        uno1.setColorNormal(new java.awt.Color(204, 204, 204));
        uno1.setColorPressed(new java.awt.Color(240, 240, 240));
        uno1.setColorTextHover(new java.awt.Color(0, 0, 0));
        uno1.setColorTextNormal(new java.awt.Color(0, 0, 0));
        uno1.setColorTextPressed(new java.awt.Color(0, 0, 0));
        uno1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DesplegableLayout = new javax.swing.GroupLayout(Desplegable);
        Desplegable.setLayout(DesplegableLayout);
        DesplegableLayout.setHorizontalGroup(
            DesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesplegableLayout.createSequentialGroup()
                .addGroup(DesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesplegableLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Menu)
                        .addGap(100, 100, 100)
                        .addComponent(uno1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addComponent(uno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DesplegableLayout.createSequentialGroup()
                        .addGroup(DesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DesplegableLayout.setVerticalGroup(
            DesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesplegableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu))
                .addGap(23, 23, 23)
                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(ColorBordeR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ColorBordeR, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(Desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
       new CambiaPanel(pnlPrincipal, new paneles.pnlHerramientas());
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
       new CambiaPanel(pnlPrincipal, new paneles.pnlPOS());
    }//GEN-LAST:event_tresActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
      new CambiaPanel(pnlPrincipal, new paneles.pnlHome());
     
    }//GEN-LAST:event_unoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int posicion = Desplegable.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, Desplegable);
        }else{
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, Desplegable);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
       new CambiaPanel(pnlPrincipal, new paneles.pnlArreglos());
    }//GEN-LAST:event_cuatroActionPerformed

    private void uno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new Menu().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Board;
    private javax.swing.JPanel ColorBordeR;
    private javax.swing.JPanel Desplegable;
    private javax.swing.JLabel Menu;
    private rsbuttom.RSButtonMetro cuatro;
    private rsbuttom.RSButtonMetro dos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlPrincipal;
    private rsbuttom.RSButtonMetro tres;
    private rsbuttom.RSButtonMetro uno;
    private rsbuttom.RSButtonMetro uno1;
    // End of variables declaration//GEN-END:variables
}
