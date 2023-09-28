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
        //  cargarTodas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio2 = new javax.swing.JDesktopPane();
        radioNoInscriptas = new javax.swing.JRadioButton();
        radioInscriptas = new javax.swing.JRadioButton();
        cboxAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMate = new javax.swing.JTable();
        jbAnular = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("                                                         Formulario de Inscripción");

        escritorio2.setBackground(new java.awt.Color(204, 204, 204));
        escritorio2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        escritorio2.setForeground(new java.awt.Color(204, 204, 204));

        radioNoInscriptas.setBackground(new java.awt.Color(0, 102, 102));
        radioNoInscriptas.setForeground(new java.awt.Color(204, 204, 204));
        radioNoInscriptas.setText("Materias no inscriptas");
        radioNoInscriptas.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        radioNoInscriptas.setBorderPainted(true);
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        radioInscriptas.setBackground(new java.awt.Color(0, 102, 102));
        radioInscriptas.setForeground(new java.awt.Color(204, 204, 204));
        radioInscriptas.setText("Materias inscriptas");
        radioInscriptas.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        radioInscriptas.setBorderPainted(true);
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        cboxAlumno.setBackground(new java.awt.Color(0, 102, 102));
        cboxAlumno.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        cboxAlumno.setForeground(new java.awt.Color(204, 204, 204));
        cboxAlumno.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        cboxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione un alumno/a:");

        //Agregue este metodo para que la columna id no sea editable
        jtMate = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }
        };
        jtMate.setBackground(new java.awt.Color(0, 102, 102));
        jtMate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jtMate.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jtMate.setForeground(new java.awt.Color(204, 204, 204));
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
        jtMate.setGridColor(new java.awt.Color(0, 0, 0));
        jtMate.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jtMate.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jtMate.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtMate);

        jbAnular.setBackground(new java.awt.Color(0, 102, 102));
        jbAnular.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jbAnular.setForeground(new java.awt.Color(204, 204, 204));
        jbAnular.setText("Anular inscripción");
        jbAnular.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jbInscribir.setBackground(new java.awt.Color(0, 102, 102));
        jbInscribir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jbInscribir.setForeground(new java.awt.Color(204, 204, 204));
        jbInscribir.setText("Inscribir");
        jbInscribir.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Listado de Materias");

        jbSalir.setBackground(new java.awt.Color(0, 102, 102));
        jbSalir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(204, 204, 204));
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        escritorio2.setLayer(radioNoInscriptas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(radioInscriptas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(cboxAlumno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jbAnular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jbInscribir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorio2Layout = new javax.swing.GroupLayout(escritorio2);
        escritorio2.setLayout(escritorio2Layout);
        escritorio2Layout.setHorizontalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorio2Layout.createSequentialGroup()
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel3))
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(radioInscriptas)
                        .addGap(90, 90, 90)
                        .addComponent(radioNoInscriptas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(escritorio2Layout.createSequentialGroup()
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorio2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorio2Layout.createSequentialGroup()
                                .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(jbAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41))
        );
        escritorio2Layout.setVerticalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorio2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInscriptas)
                    .addComponent(radioNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jbSalir))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed
        modelo.setRowCount(0);
        radioNoInscriptas.setSelected(false);
        cargarInscriptas();
        jbAnular.setEnabled(true);
        jbInscribir.setEnabled(false);

    }//GEN-LAST:event_radioInscriptasActionPerformed

    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed
        modelo.setRowCount(0);
        radioInscriptas.setSelected(false);
        cargarNoInscriptas();
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);

    }//GEN-LAST:event_radioNoInscriptasActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        int filaElegida = jtMate.getSelectedRow();
        if (filaElegida != -1) {
            Alumno alum = (Alumno) cboxAlumno.getSelectedItem();
            int idMate = (Integer) modelo.getValueAt(filaElegida, 0);
            inscData.borrarInscripcion(alum.getIdAlumno(), idMate);

        } else {
            JOptionPane.showMessageDialog(null, "Aún no se seleccionó ninguna fila de la tabla");
        }
 radioInscriptas.setSelected(false);
     borrarFilasTabla();
    }//GEN-LAST:event_jbAnularActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        int filaElegida = jtMate.getSelectedRow();

        if (filaElegida == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar la materia a la que desea inscribirse.");
        
        } else {Alumno alum = (Alumno) cboxAlumno.getSelectedItem();
            int idMate = (Integer) modelo.getValueAt(filaElegida, 0);
            String nombreMate = (String) modelo.getValueAt(filaElegida, 1);
            int anio = (Integer) modelo.getValueAt(filaElegida, 2);
            Materia mate = new Materia(idMate, nombreMate, anio, true);
            Inscripcion insc = new Inscripcion(alum, mate, 0);
            inscData.guardarInscripcion(insc);
            borrarFilasTabla();
          radioNoInscriptas.setSelected(false);
    
    }//GEN-LAST:event_jbInscribirActionPerformed

}
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cboxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAlumnoActionPerformed
        borrarFilasTabla();
         radioNoInscriptas.setSelected(false);
         radioInscriptas.setSelected(false);
          jbInscribir.setEnabled(false);
            jbAnular.setEnabled(false);
    }//GEN-LAST:event_cboxAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JDesktopPane escritorio2;
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

    //para ir agregando al cBox
    private void cargarAlumnos() {
        for (Alumno item : listaA) {
            cboxAlumno.addItem(item);
        }
    }

    private void armarTabla() {
        ArrayList<String> filaTitulo = new ArrayList<>();
        filaTitulo.add("ID");
        filaTitulo.add("Nombre");
        filaTitulo.add("Año");
        for (String i : filaTitulo) {
            modelo.addColumn(i);
        }

        jtMate.setModel(modelo);
    }

    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarInscriptas() {
        borrarFilasTabla();
        Alumno elegido = (Alumno) cboxAlumno.getSelectedItem();
        
        List<Materia> lista = inscData.averiguarMateriasInscriptas(elegido.getIdAlumno());

        for (Materia m : lista) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
        }
    }

    private void cargarNoInscriptas() {
        borrarFilasTabla();
        Alumno elegido = (Alumno) cboxAlumno.getSelectedItem();
        
        List<Materia> listaM = inscData.averiguarMateriasNoInscriptas(elegido.getIdAlumno());
        for (Materia m : listaM) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
        }

    }
   

}
