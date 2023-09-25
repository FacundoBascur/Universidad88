package vistas;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.AlumnoData;
import persistencia.InscripcionData;
import persistencia.MateriaData;

public class formularioInscripcion2 extends javax.swing.JInternalFrame {
    
     private List<Materia> listaM;
    private List<Alumno> listaA;

    private InscripcionData inscData;
    private AlumnoData alumData;
    private MateriaData mateData;

    private DefaultTableModel modelo;

    
    public formularioInscripcion2() {
        initComponents();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mateData = new MateriaData();
        armarTabla(); // armado de tabla
        alumData = new AlumnoData();
        listaM = (ArrayList<Materia>) mateData.listarMaterias();
        listaA = (ArrayList<Alumno>) alumData.listarAlumnos();
        cargarAlumnos(); // rellenar del combo box    
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioInscriptas = new javax.swing.JRadioButton();
        radioNoInscriptas = new javax.swing.JRadioButton();
        jbSalir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMate = new javax.swing.JTable();
        cboxAlumno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        radioInscriptas.setText("Materias inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        radioNoInscriptas.setText("Materias no inscriptas");
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");

        jbAnular.setText("Anular inscripción");
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jtMate.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtMate);

        cboxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAlumnoActionPerformed(evt);
            }
        });

        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setText("Seleccione un alumno/a:");

        jLabel3.setText("Listado de Materias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbInscribir)
                                .addGap(18, 18, 18)
                                .addComponent(jbAnular)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioInscriptas)
                                .addGap(18, 18, 18)
                                .addComponent(radioNoInscriptas)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInscriptas)
                    .addComponent(radioNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbAnular)
                    .addComponent(jbInscribir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed
        borrarFilasTabla();
        radioNoInscriptas.setSelected(false);
        cargarInscriptas();
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(false);

    }//GEN-LAST:event_radioInscriptasActionPerformed

    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed
        borrarFilasTabla();
        radioInscriptas.setSelected(false);
        cargarInscriptas();
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);

    }//GEN-LAST:event_radioNoInscriptasActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        int filaElegida = jtMate.getSelectedRow();
        if(filaElegida!=-1){
            Alumno alum = (Alumno)cboxAlumno.getSelectedItem();
            int idMate = (Integer)modelo.getValueAt(filaElegida, 0);
            inscData.borrarInscripcion(alum.getIdAlumno(), idMate);

        } else {
            JOptionPane.showMessageDialog(null, "Aún no se seleccionó ninguna fila de la tabla");
        }

    }//GEN-LAST:event_jbAnularActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        int filaElegida = jtMate.getSelectedRow();
        if(filaElegida !=-1){

            Alumno alum = (Alumno) cboxAlumno.getSelectedItem();
            int idMate = (Integer) modelo.getValueAt(filaElegida, 0);
            String nombreMate = (String) modelo.getValueAt(filaElegida, 1);
            int anio=(Integer)modelo.getValueAt(filaElegida, 2);
            Materia mate = new Materia(idMate, nombreMate, anio, true);
            Inscripcion insc = new Inscripcion (alum, mate, 0);
            inscData.guardarInscripcion(insc);
            borrarFilasTabla();
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    
    
    private void cboxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxAlumnoActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtMate;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables

    private void cargarAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void armarTabla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void borrarFilasTabla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cargarInscriptas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}