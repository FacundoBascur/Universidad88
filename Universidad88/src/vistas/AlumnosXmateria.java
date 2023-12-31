package vistas;

import entidades.Alumno;
import entidades.Materia;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import persistencia.InscripcionData;
import persistencia.MateriaData;

public class AlumnosXmateria extends javax.swing.JInternalFrame {

    InscripcionData ins = new InscripcionData();
    DefaultTableModel tabla = new DefaultTableModel();
    MateriaData materia = new MateriaData();

    public AlumnosXmateria() {
        initComponents();
        cargarCBox();
        String[] colum = {"ID", "DNI", "Apellido", "Nombre"};
        tabla.setColumnIdentifiers(colum);
        tablaConsulta.setModel(tabla);
        tabla.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();
        salir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        setTitle("                                    Alumnos por materia");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione una materia");

        jCMaterias.setBackground(new java.awt.Color(0, 102, 102));
        jCMaterias.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jCMaterias.setForeground(new java.awt.Color(0, 0, 0));
        jCMaterias.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jCMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMateriasActionPerformed(evt);
            }
        });

        //Agregue este metodo para que la columna id no sea editable
        tablaConsulta = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex > 4;
            }
        };
        tablaConsulta.setBackground(new java.awt.Color(0, 102, 102));
        tablaConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        tablaConsulta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tablaConsulta.setForeground(new java.awt.Color(204, 204, 204));
        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaConsulta.setGridColor(new java.awt.Color(0, 0, 0));
        tablaConsulta.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tablaConsulta.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tablaConsulta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaConsulta);

        salir.setBackground(new java.awt.Color(0, 102, 102));
        salir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        salir.setForeground(new java.awt.Color(204, 204, 204));
        salir.setText("Salir");
        salir.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
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
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jCMaterias, 0, 193, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void jCMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMateriasActionPerformed

        Materia mat = (Materia) jCMaterias.getSelectedItem();
        Alumno alumno = new Alumno();

        List<Alumno> lista = ins.averiguarAlumnosPorMateria(mat.getIdMateria());

        tabla.setRowCount(0);
        for (Alumno ins : ins.averiguarAlumnosPorMateria(mat.getIdMateria())) {

            tabla.addRow(new Object[]{ins.getIdAlumno(), ins.getDni(), ins.getApellido(), ins.getNombre()});

        }
    }//GEN-LAST:event_jCMateriasActionPerformed

    private void cargarCBox() {

        MateriaData materia = new MateriaData();
        List<Materia> lista = materia.listarMaterias();

        for (Materia mat : lista) {
            if (mat.isActivo()) {
                jCMaterias.addItem(mat);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> jCMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaConsulta;
    // End of variables declaration//GEN-END:variables
}
