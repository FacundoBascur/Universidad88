package vistas;

import entidades.*;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.*;

public class ManipNotas extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    InscripcionData ins = new InscripcionData();

    public ManipNotas() {

        initComponents();
        armadoCabecera();
        seteoDeTComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modificarNota = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        listaAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();
        salir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        modificarNota.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        modificarNota.setForeground(new java.awt.Color(0, 0, 0));
        modificarNota.setText("Modificar");
        modificarNota.setBorder(null);
        modificarNota.setBorderPainted(false);
        modificarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarNotaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione un Alumno");

        listaAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        listaAlumnos.setForeground(new java.awt.Color(0, 0, 0));
        listaAlumnos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAlumnosActionPerformed(evt);
            }
        });

        //Agregue este metodo para que la columna id no sea editable
        tablaNotas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex > 1;
            }
        };
        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaNotas.setFocusable(false);
        jScrollPane1.setViewportView(tablaNotas);

        salir.setText("Salir");
        salir.setBorder(null);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(modificarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAlumnosActionPerformed

        tabla.setRowCount(0);

        Alumno seleccionado = (Alumno) listaAlumnos.getSelectedItem();

        for (Inscripcion ins : ins.averiguarInscriptosPorIdAlumno(seleccionado.getIdAlumno())) {
            tabla.addRow(new Object[]{ins.getidInscripcion(), ins.getMateria().getNombre(), ins.getNota()});
        }
    }//GEN-LAST:event_listaAlumnosActionPerformed

    private void modificarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarNotaActionPerformed
        try {

            Alumno alum = (Alumno) listaAlumnos.getSelectedItem();
            int idAlum = alum.getIdAlumno();
            int filaSelec = tablaNotas.getSelectedRow();

            if (filaSelec == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para continuar");
            } else {

                int idMat = Integer.parseInt(tabla.getValueAt(tablaNotas.getSelectedRow(), 0).toString());

                Double nota = Double.parseDouble(tabla.getValueAt(tablaNotas.getSelectedRow(), 2).toString());

                JOptionPane.showMessageDialog(null, idAlum + " " + idMat + " " + nota);

                if (nota < 0 || nota > 10) {

                    JOptionPane.showMessageDialog(null, "Debe colocar una nota entre 0 - 10");
                } else {

                    String[] list = {"Si", "No"};
                    int opcion = JOptionPane.showOptionDialog(null, "¿Confirma modificacion de la calificación?", "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                    if (opcion == 0) {
                        JOptionPane.showMessageDialog(null, idAlum + " " + idMat + " " + nota);
                        ins.modificarNota(idAlum, idMat, nota);
                    } else {
                        JOptionPane.showMessageDialog(null, "La modificación ha sido cancelada");
                    }
                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato de ´Nota´ incorrecto");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        }

        listaAlumnosActionPerformed(evt);
    }//GEN-LAST:event_modificarNotaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void armadoCabecera() {
        String[] titulos = new String[]{"ID", "Nombre", "Nota"};
        tabla.setColumnIdentifiers(titulos);
        tablaNotas.setModel(tabla);
    }

    private void seteoDeTComboBox() {
        AlumnoData alum = new AlumnoData();
        List<Alumno> list = alum.listarAlumnos();

        list.forEach((alumno) -> {
            if (alumno.isActivo()) {
                listaAlumnos.addItem(alumno);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Alumno> listaAlumnos;
    private javax.swing.JButton modificarNota;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaNotas;
    // End of variables declaration//GEN-END:variables
}
