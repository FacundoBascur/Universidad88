package vistas;

import entidades.Alumno;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.AlumnoData;

public class ListarAlumnos extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    AlumnoData alumno = new AlumnoData();

    public ListarAlumnos() {
        initComponents();
        String[] titulos = new String[]{"ID", "DNI", "Apellido", "Nombre", "Fecha", "Estado"};
        tabla.setColumnIdentifiers(titulos);
        tablaAlumnos.setModel(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jtidentificador = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        opciones = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JButton();
        bajaAlta = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("                                                         Busqueda de Alumnos");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(510, 330));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 400));

        //Agregue este metodo para que la columna id no sea editable
        tablaAlumnos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex > 0 && columnIndex < 5;
            }
        };
        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaAlumnos.setCellSelectionEnabled(true);
        tablaAlumnos.setFocusable(false);
        tablaAlumnos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaAlumnos);

        Modificar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        Modificar.setForeground(new java.awt.Color(0, 0, 0));
        Modificar.setText("Modificar");
        Modificar.setBorder(null);
        Modificar.setBorderPainted(false);
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Seleccionar >", "Por ID", "Por DNI", "Todos" }));

        buscar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        buscar.setForeground(new java.awt.Color(0, 0, 0));
        buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Facundo\\Documents\\GitHub\\Universidad88\\Universidad88\\src\\Imagenes\\buscar.png")); // NOI18N
        buscar.setText("Buscar");
        buscar.setBorder(null);
        buscar.setBorderPainted(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        bajaAlta.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        bajaAlta.setForeground(new java.awt.Color(0, 0, 0));
        bajaAlta.setText("Baja/Alta");
        bajaAlta.setBorder(null);
        bajaAlta.setBorderPainted(false);
        bajaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaAltaActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Facundo\\Documents\\GitHub\\Universidad88\\Universidad88\\src\\Imagenes\\cerrar-sesion.png")); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        limpiar.setForeground(new java.awt.Color(0, 0, 0));
        limpiar.setText("Limpiar");
        limpiar.setBorder(null);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(bajaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bajaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        opciones.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

        try {
            if (tablaAlumnos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "No se ha realizado ninguna modificacion");
            } else {

                //En estos variables se guardan los datos obtenidos al seleccionar una fila de la tabla. "tabla.getValueAt(tablaAlumnos.getSelectedRow --> selecciona fila"
                int id = Integer.parseInt(tabla.getValueAt(tablaAlumnos.getSelectedRow(), 0).toString());
                int dni = Integer.parseInt(tabla.getValueAt(tablaAlumnos.getSelectedRow(), 1).toString());
                String ap = tabla.getValueAt(tablaAlumnos.getSelectedRow(), 2).toString();
                String nom = tabla.getValueAt(tablaAlumnos.getSelectedRow(), 3).toString();
                Date fecha = Date.valueOf(tabla.getValueAt(tablaAlumnos.getSelectedRow(), 4).toString());

                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, " Confirmar modificacion", "", 0, JOptionPane.QUESTION_MESSAGE, null, list, ""); // muestra un cuadro de dialogo para confirmar la modificacion del alumno devuelve 0 o 1 dependiendo la opcion que se elija

                if (opcion == 0) {
                    alumno.modificarAlumno(id, dni, ap, nom, fecha);

                } else {
                    JOptionPane.showMessageDialog(this, "Modificacion cancelada");
                }

            }
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error en la modificacion - el DNI colocado no es correcto, excede limites de digitos");
        }

      

    }//GEN-LAST:event_ModificarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        String opcion = opciones.getSelectedItem().toString(); // devuelve en string la opcion que tenemos elegida en el combo box

        if (opcion.equals("Por ID")) {

            try {
                if (jtidentificador.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Coloque ID para continuar");
                } else if (Integer.parseInt(jtidentificador.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Formato de ID incorrecto");

                } else {
                    tabla.setRowCount(0);

                    Alumno alum = alumno.buscarPorId(Integer.parseInt(jtidentificador.getText()));

                    tabla.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre(), alum.getFechaNac(), alum.isActivo()});

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error - caracter invalido");

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "El alumno con el ID solicitado no se encuentra en la base de datos");
            }

        } else if (opcion.equals("Por DNI")) {

            try {
                if (jtidentificador.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Coloque DNI para continuar");
                } else if (Integer.parseInt(jtidentificador.getText()) <= 0 || jtidentificador.getText().length() <= 5) {
                    JOptionPane.showMessageDialog(null, "Formato de DNI incorrecto");

                } else {
                    tabla.setRowCount(0);

                    Alumno alum = alumno.buscarPorDni(Integer.parseInt(jtidentificador.getText()));

                    tabla.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre(), alum.getFechaNac(), alum.isActivo()});

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error - caracter invalido");

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "El alumno con el DNI solicitado no se encuentra en la base de datos");
            }

        } else if (opcion.equals("Todos")) {
            jtidentificador.setText("");
            try {
                tabla.setRowCount(0);
                List<Alumno> lista = alumno.listarAlumnos();

                lista.forEach((alum) -> {
                    tabla.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre(), alum.getFechaNac(), alum.isActivo()}); // metodo para setear el alumno a la tabla. creo el objeto y lo agrego
                });

            } catch (NumberFormatException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error - base de datos vacia");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opción valida para continuar");
        }


    }//GEN-LAST:event_buscarActionPerformed

    private void bajaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaAltaActionPerformed

        if (tablaAlumnos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un alumno para continuar");
        } else {

            int dni = Integer.parseInt(tabla.getValueAt(tablaAlumnos.getSelectedRow(), 1).toString());
            String ap = tabla.getValueAt(tablaAlumnos.getSelectedRow(), 2).toString();
            String nom = tabla.getValueAt(tablaAlumnos.getSelectedRow(), 3).toString();
            boolean estado = Boolean.parseBoolean(tabla.getValueAt(tablaAlumnos.getSelectedRow(), 5).toString());

            if (estado) {
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Confirmar Baja del alumno \n" + ap + " " + nom + "\nDNI = " + dni, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                if (opcion == 0) {
                    alumno.darDeBajaPorDni(dni);
                    buscarActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(this, "Baja cancelada");
                }
            } else {
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Confirmar Alta del alumno \n" + ap + " " + nom + "\nDNI = " + dni, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                if (opcion == 0) {
                    alumno.darDeAlta(dni);
                    buscarActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(this, "Alta cancelada");
                }
            }

        }
    }//GEN-LAST:event_bajaAltaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose(); // metodo para cerrar la vista
    }//GEN-LAST:event_salirActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        jtidentificador.setText("");
    }//GEN-LAST:event_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JButton bajaAlta;
    private javax.swing.JButton buscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtidentificador;
    private javax.swing.JButton limpiar;
    private javax.swing.JComboBox<String> opciones;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
