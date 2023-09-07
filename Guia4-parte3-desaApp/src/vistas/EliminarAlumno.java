/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Alumno;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.AlumnoData;
import persistencia.Conexion;

/**
 *
 * @author Facundo
 */
public class EliminarAlumno extends javax.swing.JInternalFrame {

    Conexion con = new Conexion("jdbc:mariadb://localhost:3306/universidaddelapunta", "root", "");
    DefaultTableModel dtm = new DefaultTableModel();
    AlumnoData alumData = new AlumnoData(con);

    public EliminarAlumno() {
        initComponents();
        initComponents();
        String[] titulo = new String[]{"Id", "DNI", "Apellido", "Nombre", "FN", "Estado"};
        dtm.setColumnIdentifiers(titulo);
        tablaEliminar.setModel(dtm);

        //rellenar la tabla
        dtm.setRowCount(0);

        con.buscarConexion();
        List<Alumno> lista = alumData.listarAlumnos();

        lista.forEach((alumno) -> {
            dtm.addRow(new Object[]{alumno.getId(), alumno.getDni(), alumno.getApellido(), alumno.getNombre(), alumno.getFechaNacimiento(), alumno.isEstado()});
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEliminar = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tablaEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaEliminar);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Coloque el DNI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jtDni)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jbEliminar)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEliminar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //metodo del boton borrar

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        try {
            
            
            
            if (Integer.parseInt(jtDni.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Solo numero enteros positivos");
            } else {
                
                
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "  !!ADVERTENCIA!! ¿Desea eliminar?", "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                if (opcion == 0) {
                    alumData.eliminarAlumno(Integer.parseInt(jtDni.getText()));
                    JOptionPane.showMessageDialog(this, "Alumno eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "No se confirmo la eliminacion");
                }
                
                
            }

            dtm.setRowCount(0);

            con.buscarConexion();
            List<Alumno> lista = alumData.listarAlumnos();

            for (Alumno alumno : lista) {
                dtm.addRow(new Object[]{alumno.getId(), alumno.getDni(), alumno.getApellido(), alumno.getNombre(), alumno.getFechaNacimiento(), alumno.isEstado()});
            }

            jtDni.setText("");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Fromato del DNI incorrecto");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTable tablaEliminar;
    // End of variables declaration//GEN-END:variables
}
