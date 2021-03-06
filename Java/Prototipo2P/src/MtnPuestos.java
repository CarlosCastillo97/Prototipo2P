/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class MtnPuestos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmMantCargos
     */
    public MtnPuestos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMantPuesto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodP = new javax.swing.JTextField();
        txtNomP = new javax.swing.JTextField();
        txtEstadoP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGenCod = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnCambio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscarxNom = new javax.swing.JButton();

        setClosable(true);
        setTitle("Mantenimiento Puestos");

        panelMantPuesto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Código Puesto:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Puesto:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Estad Puesto:");

        txtCodP.setEditable(false);
        txtCodP.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtNomP.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtEstadoP.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("MANTENIMIENTO PUESTOS");

        btnGenCod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGenCod.setText("Generar Código");
        btnGenCod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenCodActionPerformed(evt);
            }
        });

        btnAlta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAlta.setText("Alta");
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnBaja.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBaja.setText("Baja");
        btnBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnCambio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCambio.setText("Cambio");
        btnCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Buscar por Código:");

        txtBuscar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscarxNom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBuscarxNom.setText("Buscar");
        btnBuscarxNom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarxNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarxNomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMantPuestoLayout = new javax.swing.GroupLayout(panelMantPuesto);
        panelMantPuesto.setLayout(panelMantPuestoLayout);
        panelMantPuestoLayout.setHorizontalGroup(
            panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMantPuestoLayout.createSequentialGroup()
                        .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(47, 47, 47)
                                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodP)
                                    .addComponent(txtNomP)
                                    .addComponent(txtEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenCod))
                            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(55, 55, 55)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarxNom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMantPuestoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );
        panelMantPuestoLayout.setVerticalGroup(
            panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnBaja)
                    .addComponent(btnCambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarxNom))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenCodActionPerformed
        String validacion;
        Random random = new Random();
        int valorRandom = random.nextInt(9999)+1;
        validacion=txtNomP.getText();
        if(validacion.equals("")){
            JOptionPane.showMessageDialog(null, "Por Favor, ingrese un nombre para el Puesto");
        }else{
            ObtenerInicial(txtNomP.getText());
            iTexto+=valorRandom;
            txtCodP.setText(iTexto.toLowerCase());
        }
    }//GEN-LAST:event_btnGenCodActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // TODO add your handling code here:
                //Eliminar por Codigo
         try {
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from puesto where id_puesto = ?");
            
            pst.setString(1, txtBuscar.getText().trim());
            pst.executeUpdate();
            
            txtCodP.setText("");
            txtNomP.setText("");
            txtEstadoP.setText("");
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        } catch (Exception e) {
        }    
    }//GEN-LAST:event_btnBajaActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarxNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarxNomActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Prototipo2P", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from puesto where id_puesto = ?");
            pst.setString(1, txtBuscar.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txtNomP.setText(rs.getString("nombre_puesto"));
                txtCodP.setText(rs.getString("id_puesto"));
                txtEstadoP.setText(rs.getString("estado_puesto"));
            } else {
               JOptionPane.showMessageDialog(null, "Puesto no registrado.");
            }
            
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_btnBuscarxNomActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Prototipo2P", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into puesto values(?,?,?)");
           
            pst.setString(1, txtCodP.getText().trim());
            pst.setString(2, txtNomP.getText().trim());
            pst.setString(3, txtEstadoP.getText().trim());
            pst.executeUpdate();
            
            txtNomP.setText("");
            txtCodP.setText("");
            txtEstadoP.setText("");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        }catch (Exception e){
            
        }
           
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txtBuscar.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Prototipo2P", "root", "");
            PreparedStatement pst = cn.prepareStatement("update puesto set id_puesto = ?, nombre_puesto = ?, estado_puesto = ?  where id_puesto = " + ID);
            
            pst.setString(1, txtCodP.getText().trim());
            pst.setString(2, txtNomP.getText().trim());
            pst.setString(3, txtEstadoP.getText().trim());
            pst.executeUpdate();
            
           JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCambioActionPerformed
    String iTexto="";
    private void ObtenerInicial(String texto){
        for(int i=0; i<5; i++){
            iTexto=iTexto+texto.charAt(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnBuscarxNom;
    private javax.swing.JButton btnCambio;
    private javax.swing.JButton btnGenCod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelMantPuesto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodP;
    private javax.swing.JTextField txtEstadoP;
    private javax.swing.JTextField txtNomP;
    // End of variables declaration//GEN-END:variables
}
