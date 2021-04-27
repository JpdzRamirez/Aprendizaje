/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import javax.swing.DefaultListModel;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
/**
 *
 * @author doble
 */
public class pnlHome extends javax.swing.JPanel implements ListSelectionListener {

    private int posicion;
    /**
     * Creates new form pnlHome
     */
    public pnlHome() {
        initComponents();
        this.posicion=ListaOpciones.getSelectedIndex();
        new CambiaPanel(InfoPanel, new paneles.InfoCalculadora());
        //ListaOpciones.addListSelectionListener(this);
        
    }
    
    public static void main(String []args){
    
    SwingUtilities.invokeLater(new Runnable(){
    public void run(){
    new pnlHome();
    }
    
    });

    }
   
    
    private void inite(){
    ListaOpciones.addListSelectionListener(new ListSelectionListener(){
    @Override
    public void valueChanged(ListSelectionEvent e){
    int index=ListaOpciones.getSelectedIndex();
    if(index==0){
    new CambiaPanel(InfoPanel, new paneles.InfoCalculadora());
    }
    else{
            new CambiaPanel(InfoPanel, new paneles.InfoPOS());
    }
        
    }
    });
    
    }
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        SuperInfo = new javax.swing.JPanel();
        Informacion = new javax.swing.JScrollPane();
        InfoPanel = new javax.swing.JPanel();
        Opciones = new javax.swing.JScrollPane();
        ListaOpciones = new javax.swing.JList<>();
        Seleccion = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 51, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home (1).png"))); // NOI18N
        jLabel1.setText("HOME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        SuperInfo.setBackground(new java.awt.Color(255, 255, 255));

        InfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        InfoPanel.setLayout(new javax.swing.BoxLayout(InfoPanel, javax.swing.BoxLayout.LINE_AXIS));
        Informacion.setViewportView(InfoPanel);

        javax.swing.GroupLayout SuperInfoLayout = new javax.swing.GroupLayout(SuperInfo);
        SuperInfo.setLayout(SuperInfoLayout);
        SuperInfoLayout.setHorizontalGroup(
            SuperInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Informacion)
        );
        SuperInfoLayout.setVerticalGroup(
            SuperInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Informacion)
        );

        ListaOpciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ListaOpciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "CALCULADORA ", "POS" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaOpciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListaOpciones.setSelectedIndex(0);
        Opciones.setViewportView(ListaOpciones);

        Seleccion.setText("Seleccionar");
        Seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(Seleccion)))
                        .addGap(48, 48, 48)
                        .addComponent(SuperInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SuperInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Seleccion)
                        .addContainerGap(129, Short.MAX_VALUE))))
        );
    }// </editor-fold>                        

    private void SeleccionActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int index=ListaOpciones.getSelectedIndex();
    if(index==0){
    new CambiaPanel(InfoPanel, new paneles.InfoCalculadora());
    }
    else{
            new CambiaPanel(InfoPanel, new paneles.InfoPOS());
    }
    }                                         


    // Variables declaration - do not modify                     
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JScrollPane Informacion;
    private javax.swing.JList<String> ListaOpciones;
    private javax.swing.JScrollPane Opciones;
    private javax.swing.JButton Seleccion;
    private javax.swing.JPanel SuperInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration                   

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
