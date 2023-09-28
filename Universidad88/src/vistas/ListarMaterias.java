package vistas;

import entidades.Materia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.MateriaData;

public class ListarMaterias extends javax.swing.JInternalFrame {

    private DefaultTableModel model = new DefaultTableModel();
    MateriaData materia = new MateriaData();

    public ListarMaterias() {
        initComponents();
        armarCabecera();
        jTabla.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jCSeleccionar = new javax.swing.JComboBox<>();
        jBModificar = new javax.swing.JButton();
        jBBajaAlta = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setMaximizable(true);
        setTitle("                                            Listar y modificar materias");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        //Agregue este metodo para que la columna id no sea editable
        jTabla = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex > 0 && columnIndex < 3;
            }
        };
        jTabla.setBackground(new java.awt.Color(0, 102, 102));
        jTabla.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jTabla.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTabla.setForeground(new java.awt.Color(204, 204, 204));
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabla.setCellSelectionEnabled(true);
        jTabla.setGridColor(new java.awt.Color(0, 0, 0));
        jTabla.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jTabla.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabla);

        jCSeleccionar.setBackground(new java.awt.Color(0, 102, 102));
        jCSeleccionar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jCSeleccionar.setForeground(new java.awt.Color(204, 204, 204));
        jCSeleccionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Todas", "Activas", "Inactivas" }));
        jCSeleccionar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jCSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSeleccionarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(0, 102, 102));
        jBModificar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(204, 204, 204));
        jBModificar.setText("Modificar");
        jBModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBBajaAlta.setBackground(new java.awt.Color(0, 102, 102));
        jBBajaAlta.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jBBajaAlta.setForeground(new java.awt.Color(204, 204, 204));
        jBBajaAlta.setText("Baja/Alta");
        jBBajaAlta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jBBajaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBajaAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jCSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBajaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jCSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBajaAlta)
                    .addComponent(jBModificar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSeleccionarActionPerformed

        String opciones = jCSeleccionar.getSelectedItem().toString();
        try {
            if (opciones.equals("<Seleccionar>")) {
                model.setRowCount(0);

            } else if (opciones.equals("Todas")) {

                model.setRowCount(0);

                List<Materia> listaMaterias = materia.listarMaterias();
                for (Materia mat : listaMaterias) {

                    model.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAnio(), mat.isActivo()});
                }
            } else if (opciones.equals("Activas")) {

                model.setRowCount(0);

                List<Materia> listaMaterias = materia.listarMaterias();
                for (Materia mat : listaMaterias) {
                    if (mat.isActivo() == true) {
                        model.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAnio(), mat.isActivo()});
                    }
                }
            } else if (opciones.equals("Inactivas")) {

                model.setRowCount(0);

                List<Materia> listaMaterias = materia.listarMaterias();
                for (Materia mat : listaMaterias) {
                    if (mat.isActivo() == false) {
                        model.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAnio(), mat.isActivo()});

                    }
                }
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El item seleccionado es incorrecto.");


    }//GEN-LAST:event_jCSeleccionarActionPerformed
    }
    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        try {
            if (jTabla.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "No se ha realizado ninguna modificación.");
jCSeleccionarActionPerformed(evt);
            } else {

                //En estas variables se guardan los datos obtenidos al seleccionar una fila de la tabla. "tabla.getValueAt(jTabla.getSelectedRow --> selecciona fila"
                int id = Integer.parseInt(model.getValueAt(jTabla.getSelectedRow(), 0).toString());
                String nombre = model.getValueAt(jTabla.getSelectedRow(), 1).toString();
                int anio = Integer.parseInt(model.getValueAt(jTabla.getSelectedRow(), 2).toString());
                if (verificarNombre(nombre) == true) {
                    JOptionPane.showMessageDialog(this, "El campo nombre no debe contener números.");
             jCSeleccionarActionPerformed(evt);
                }else{
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, " Confirmar modificacion", "", 0, JOptionPane.QUESTION_MESSAGE, null, list, ""); // muestra un cuadro de dialogo para confirmar la modificacion de la materia devuelve 0 o 1 dependiendo la opcion que se elija

                if (opcion == 0) {
                    materia.modificarMateria(id, nombre, anio);

                } else {
                    JOptionPane.showMessageDialog(this, "Modificacion cancelada");
                }
              jCSeleccionar.setSelectedItem("<Seleccionar>");
            model.setRowCount(0);
                }
                
           
            }
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El campo año no debe contener letras.");
jCSeleccionarActionPerformed(evt);
        }
// jCSeleccionar.setSelectedItem("<Seleccionar>");
           // model.setRowCount(0);
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBBajaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBajaAltaActionPerformed

        if (jTabla.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No se ha realizado ninguna modificación.");
        } else {

            //En estas variables se guardan los datos obtenidos al seleccionar una fila de la tabla. "tabla.getValueAt(jTabla.getSelectedRow --> selecciona fila"
            int id = Integer.parseInt(model.getValueAt(jTabla.getSelectedRow(), 0).toString());
            String nombre = model.getValueAt(jTabla.getSelectedRow(), 1).toString();
            int anio = Integer.parseInt(model.getValueAt(jTabla.getSelectedRow(), 2).toString());
            boolean estado = Boolean.parseBoolean(model.getValueAt(jTabla.getSelectedRow(), 3).toString());

            if (estado) {
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Confirmar Baja de Materia: \n " + nombre, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                if (opcion == 0) {
                    materia.bajaMateria(id);

                } else {
                    JOptionPane.showMessageDialog(this, "Baja cancelada");
                }
            } else {
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Confirmar Alta de Materia: \n" + nombre, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                if (opcion == 0) {
                    materia.altaMateria(id);

                } else {
                    JOptionPane.showMessageDialog(this, "Alta cancelada");
                }
            }
    }//GEN-LAST:event_jBBajaAltaActionPerformed
        jCSeleccionar.setSelectedItem("<Seleccionar>");
        model.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBajaAlta;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox<String> jCSeleccionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        model.addColumn("Id Materia");
        model.addColumn("Nombre");
        model.addColumn("Año");
        model.addColumn("Estado");

    }

    public boolean verificarNombre(String cadena2) {
        try {
            Integer.parseInt(cadena2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
