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

public class ListaAlumno extends javax.swing.JInternalFrame {

    Conexion con = new Conexion("jdbc:mariadb://localhost:3306/universidaddelapunta", "root", "");
    DefaultTableModel dtm = new DefaultTableModel();
    AlumnoData alumData = new AlumnoData(con);

    public ListaAlumno() {
        initComponents();
        String[] titulo = new String[]{"Id", "DNI", "Apellido", "Nombre", "FN", "Estado"};
        dtm.setColumnIdentifiers(titulo);
        tablaAlum.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlum = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jbTodos = new javax.swing.JButton();
        jbDni = new javax.swing.JButton();
        nota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbnota = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tablaAlum.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaAlum);

        jLabel1.setText("DNI");

        jbTodos.setText("Listar Todos");
        jbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTodosActionPerformed(evt);
            }
        });

        jbDni.setText("Listar por DNI");
        jbDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDniActionPerformed(evt);
            }
        });

        jLabel2.setText("Nota <");

        jbnota.setText("Listar / nota");
        jbnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jbDni)
                        .addGap(18, 18, 18)
                        .addComponent(jbnota, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jbTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTodos)
                    .addComponent(jbDni)
                    .addComponent(jbnota))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDniActionPerformed

        try {
            if (Integer.parseInt(dni.getText()) < 0) {

                JOptionPane.showMessageDialog(null, "Solo numeros enteros positivos");

            } else if (dni.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se admiten campos vacios");

            } else {
                dtm.setRowCount(0); // para limpiar la tabla
                con.buscarConexion();

                Alumno alumno = alumData.buscarAlumno(Integer.parseInt(dni.getText()));

                dtm.addRow(new Object[]{alumno.getId(), alumno.getDni(), alumno.getApellido(), alumno.getNombre(), alumno.getFechaNacimiento(), alumno.isEstado()});
            }
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }


    }//GEN-LAST:event_jbDniActionPerformed

    private void jbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTodosActionPerformed
        try {

            dtm.setRowCount(0);

            con.buscarConexion();
            List<Alumno> lista = alumData.listarAlumnos();

            for (Alumno alumno : lista) {
                dtm.addRow(new Object[]{alumno.getId(), alumno.getDni(), alumno.getApellido(), alumno.getNombre(), alumno.getFechaNacimiento(), alumno.isEstado()});
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jbTodosActionPerformed

    private void jbnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnotaActionPerformed
          try {
            if (Integer.parseInt(nota.getText()) < 0) {

                JOptionPane.showMessageDialog(null, "Solo numeros enteros positivos");

            } else if (nota.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se admiten campos vacios");

            } else {
                dtm.setRowCount(0); // para limpiar la tabla
                con.buscarConexion();
                List<Alumno> lista = alumData.buscarAlumnosPorCalificacion(Integer.parseInt(nota.getText()));
                for (Alumno alumno : lista) {
                dtm.addRow(new Object[]{alumno.getId(), alumno.getDni(), alumno.getApellido(), alumno.getNombre(), alumno.getFechaNacimiento(), alumno.isEstado()});
            }
               
            }
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jbnotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDni;
    private javax.swing.JButton jbTodos;
    private javax.swing.JButton jbnota;
    private javax.swing.JTextField nota;
    private javax.swing.JTable tablaAlum;
    // End of variables declaration//GEN-END:variables
}
