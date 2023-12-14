/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Conector;
import java.awt.Graphics;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class JfrEstudiantes extends javax.swing.JFrame {

    
     /**
     * variables globales
     */
    private JfrNuevo frmNuevo;
    private JfrEditar frmEditar;
    private JfrBorrar frmBorrar;
    
    public JfrEstudiantes() {
        initComponents();
        this.setSize(1300,800);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fondo.jpg"));
        Image image = icon.getImage();
        Escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        JtbtnNuevo = new javax.swing.JToggleButton();
        JtbtnEditar = new javax.swing.JToggleButton();
        JtbtnBorrar = new javax.swing.JToggleButton();
        JbtnReportVariable = new javax.swing.JButton();
        JbtnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(650, 500));
        setResizable(false);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtbtnNuevo.setText("Nuevo");
        JtbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtbtnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(JtbtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 140, 58));

        JtbtnEditar.setText("Editar");
        JtbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtbtnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(JtbtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 140, 58));

        JtbtnBorrar.setText("Borrar");
        JtbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtbtnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(JtbtnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 140, 58));

        JbtnReportVariable.setText("Reporte Apellido");
        JbtnReportVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnReportVariableActionPerformed(evt);
            }
        });
        jPanel1.add(JbtnReportVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 140, 58));

        JbtnReporte.setText("Reporte");
        JbtnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(JbtnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 140, 58));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Metodos para abrir y cerrar los jframes internos con el Toggle Button.
    */
    private void AbrirNuevo(){
        if(this.JtbtnNuevo.isSelected()){
                frmNuevo = new JfrNuevo(JtbtnNuevo);
                Escritorio.add(frmNuevo);
                frmNuevo.show();
           
        }else{
            frmNuevo.dispose();
            frmNuevo = null;
        }
    }
    private void JtbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtbtnNuevoActionPerformed
        AbrirNuevo();
    }//GEN-LAST:event_JtbtnNuevoActionPerformed
    private void AbrirEditar(){
        if(this.JtbtnEditar.isSelected()){
                frmEditar = new JfrEditar(JtbtnEditar);
                Escritorio.add(frmEditar);
                frmEditar.show();
           
        }else{
            frmEditar.dispose();
            frmEditar = null;
        }
    }
    private void JtbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtbtnEditarActionPerformed
        AbrirEditar();
    }//GEN-LAST:event_JtbtnEditarActionPerformed
    private void AbrirBorrar(){
        if(this.JtbtnBorrar.isSelected()){
                frmBorrar = new JfrBorrar(JtbtnBorrar);
                Escritorio.add(frmBorrar);
                frmBorrar.show();
           
        }else{
            frmBorrar.dispose();
            frmBorrar = null;
        }
    }
    private void JtbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtbtnBorrarActionPerformed
        AbrirBorrar();
    }//GEN-LAST:event_JtbtnBorrarActionPerformed

    
    private void JbtnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnReporteActionPerformed
        generarReporte();
    }//GEN-LAST:event_JbtnReporteActionPerformed

    private void JbtnReportVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnReportVariableActionPerformed
        reportParam();
    }//GEN-LAST:event_JbtnReportVariableActionPerformed

    //Metodo para generar el reporte.
    private void generarReporte(){
        Conector base = new Conector();
        base.setCon();
        try {
            JasperReport report = JasperCompileManager.compileReport("src/Reportes/grafico.jrxml");
            JasperPrint print = JasperFillManager.fillReport(report, null, base.getCon());
            //Se crea un objeto JasperViewer para guardar el reporte y se lo traspasa a un internal Frame
            JasperViewer viewer = new JasperViewer(print, false);
            JInternalFrame internalFrame = new JInternalFrame("Informe PDF", true, true, true, true);
            internalFrame.getContentPane().add(viewer.getContentPane());
            internalFrame.setSize(600, 400);
            
            // Agregar el visor interno al JDesktopPane
            Escritorio.add(internalFrame);
            internalFrame.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Reporte no encontrado");
        }
    }
    
    //Metodo para generar el reporte de cada estudiante dependiendo del apellido.
    private void reportParam() {
        Conector base = new Conector();
        base.setCon();
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del estudiante");
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("APELLIDO", apellido);
        
        try {
            JasperReport report = JasperCompileManager.compileReport("src/Reportes/maestro.jrxml");
            JasperPrint print = JasperFillManager.fillReport(report, parametros, base.getCon());
            if(print.getPages().size()==0){
                JOptionPane.showMessageDialog(null, "No existe ese apellido en la base de datos");
                return;
            }
            //Se crea un objeto JasperViewer para guardar el reporte y se lo traspasa a un internal Frame
            JasperViewer viewer = new JasperViewer(print, false);
            JInternalFrame internalFrame = new JInternalFrame("Informe "+apellido+" PDF", true, true, true, true);
            internalFrame.getContentPane().add(viewer.getContentPane());
            internalFrame.setSize(600, 400);
            
            // Agregar el visor interno al JDesktopPane
            Escritorio.add(internalFrame);
            internalFrame.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Reporte no encontrado");
        }
    }
    
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
            java.util.logging.Logger.getLogger(JfrEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton JbtnReportVariable;
    private javax.swing.JButton JbtnReporte;
    private javax.swing.JToggleButton JtbtnBorrar;
    private javax.swing.JToggleButton JtbtnEditar;
    private javax.swing.JToggleButton JtbtnNuevo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
