/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.Estudiante_Control;
import Modelo.Estudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class JfrBorrar extends javax.swing.JInternalFrame {

     /**
     * variables globales
     */
    private DefaultTableModel modelo = new DefaultTableModel();
    private Estudiante_Control est_con = new Estudiante_Control();
    
    public JfrBorrar(JToggleButton a) {
        initComponents();
        
        //Evento para que desactive el Toggle Button del Desktop.
        addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                a.setSelected(false);                
            }
        });
        
        //Ecento para que suba los datos seleccionando la tabla.
        jtblEstudiantes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (jtblEstudiantes.getSelectedRow() != -1) {
                    jtxtCed.setText((String) jtblEstudiantes.getValueAt(jtblEstudiantes.getSelectedRow(), 0));
                    
                }
            }
        });
        cargarTabla();
    }
    
    //Carga la tabla con ayuda del controlador.
    private void cargarTabla() {

        modelo.setRowCount(0);
        String[] columnas = {"Cedula", "Nombre", "Apellido", "Direccion", "Telefono"};
        modelo.setColumnIdentifiers(columnas);

        ArrayList<Estudiante> registro = est_con.getEstudiantes();
        for (Estudiante est : registro) {
            Object[] lista ={est.getCedula(), est.getNombre(), est.getApellido(), est.getDireccion(), est.getCelular()};
            modelo.addRow(lista);
        }
        jtblEstudiantes.setModel(modelo);
        jtblEstudiantes.getTableHeader().setReorderingAllowed(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtCed = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblEstudiantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JbtnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Eliminar Estudiante");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jtxtCed.setEditable(false);
        jtxtCed.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jtblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblEstudiantes);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cedula");

        JbtnGuardar.setText("Eliminar");
        JbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(JbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtCed, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtCed, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JbtnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Comprobar que no haya campos vacios
    private boolean vacio() {
        if (this.jtxtCed.getText().isBlank() ) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben llenarse");
            return false;
        }
        return true;
    }
    
    //Eliminacion de estudiante vista.
    private void eliminar() {
        if (!this.vacio()) {
            return;
        }
        est_con.eliminarEstudiante(jtxtCed.getText());
        cargarTabla();
        eliminarCampos();
    }
    
    //vacia los campos al terminar
    private void eliminarCampos(){
        this.jtxtCed.setText("");
    }
    private void JbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnGuardarActionPerformed
        eliminar();
    }//GEN-LAST:event_JbtnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblEstudiantes;
    private javax.swing.JTextField jtxtCed;
    // End of variables declaration//GEN-END:variables
}