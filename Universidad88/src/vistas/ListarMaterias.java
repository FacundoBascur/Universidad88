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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jCSeleccionar = new javax.swing.JComboBox<>();
        jBModificar = new javax.swing.JButton();
        jBBajaAlta = new javax.swing.JButton();

        setClosable(true);
        setTitle("Materias");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Listar Materias");

        //Agregue este metodo para que la columna id no sea editable
        jTabla = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex > 0 && columnIndex < 3;
            }
        };
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
        jTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabla);

        jCSeleccionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Todas", "Activas", "Inactivas" }));
        jCSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSeleccionarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBBajaAlta.setText("Baja/Alta");
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
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jCSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jBModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBajaAlta)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jCSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar)
                    .addComponent(jBBajaAlta))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

            
            } else {

                //En estas variables se guardan los datos obtenidos al seleccionar una fila de la tabla. "tabla.getValueAt(jTabla.getSelectedRow --> selecciona fila"
                int id = Integer.parseInt(model.getValueAt(jTabla.getSelectedRow(), 0).toString());
                String nombre = model.getValueAt(jTabla.getSelectedRow(), 1).toString();
                int anio = Integer.parseInt(model.getValueAt(jTabla.getSelectedRow(), 2).toString());

                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, " Confirmar modificacion", "", 0, JOptionPane.QUESTION_MESSAGE, null, list, ""); // muestra un cuadro de dialogo para confirmar la modificacion de la materia devuelve 0 o 1 dependiendo la opcion que se elija

                if (opcion == 0) {
                    materia.modificarMateria(id, nombre, anio);

                } else {
                    JOptionPane.showMessageDialog(this, "Modificacion cancelada");
                }

            }
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error, se ingresó un tipo de formato incorrecto.");

            jCSeleccionar.setSelectedItem("<Seleccionar>");
            model.setRowCount(0);
        }

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
                    int opcion = JOptionPane.showOptionDialog(null, "Confirmar Baja de Materia: \n " + nombre,"", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

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
    private javax.swing.JLabel jLabel1;
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
}
