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
        armarTabla();
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

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
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
        tablaAlumnos.setBackground(new java.awt.Color(0, 102, 102));
        tablaAlumnos.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        tablaAlumnos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tablaAlumnos.setForeground(new java.awt.Color(204, 204, 204));
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
        tablaAlumnos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaAlumnos.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tablaAlumnos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaAlumnos);

        jtidentificador.setBackground(new java.awt.Color(0, 102, 102));
        jtidentificador.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jtidentificador.setForeground(new java.awt.Color(204, 204, 204));
        jtidentificador.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        Modificar.setBackground(new java.awt.Color(0, 102, 102));
        Modificar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        Modificar.setForeground(new java.awt.Color(204, 204, 204));
        Modificar.setText("Modificar");
        Modificar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        opciones.setBackground(new java.awt.Color(0, 102, 102));
        opciones.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        opciones.setForeground(new java.awt.Color(204, 204, 204));
        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Seleccionar >", "Por ID", "Por DNI", "Todos" }));
        opciones.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(0, 102, 102));
        buscar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        buscar.setForeground(new java.awt.Color(204, 204, 204));
        buscar.setText("Buscar");
        buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        bajaAlta.setBackground(new java.awt.Color(0, 102, 102));
        bajaAlta.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        bajaAlta.setForeground(new java.awt.Color(204, 204, 204));
        bajaAlta.setText("Baja/Alta");
        bajaAlta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        bajaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaAltaActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 102, 102));
        salir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(bajaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bajaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
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

                if (verificarApellido(ap)||verificarNombre(nom)||ap.isEmpty()||nom.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se admiten numeros y/o casilleros vacios en Apellido y Nombre");
                      buscarActionPerformed(evt);
                }else{
                    
                    String[] list = {"Si", "No"};
                    int opcion = JOptionPane.showOptionDialog(null, " Confirmar modificacion", "", 0, JOptionPane.QUESTION_MESSAGE, null, list, ""); // muestra un cuadro de dialogo para confirmar la modificacion del alumno devuelve 0 o 1 dependiendo la opcion que se elija

                    if (opcion == 0) {
                        alumno.modificarAlumno(id, dni, ap, nom, fecha);

                    } else {
                        JOptionPane.showMessageDialog(this, "Modificacion cancelada");
                    }
                    
                }
            }
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error en la modificacion - el DNI colocado no es correcto, excede limites de digitos");
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "Error en el formato de fecha");
            
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

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
          jtidentificador.setText("");
         tabla.setRowCount(0);
    }//GEN-LAST:event_opcionesActionPerformed

    private void armarTabla() {
        String[] titulos = new String[]{"ID", "DNI", "Apellido", "Nombre", "Fecha", "Estado"};
        tabla.setColumnIdentifiers(titulos);
        tablaAlumnos.setModel(tabla);
    }

    public boolean verificarApellido(String cadena) {
        try {
            Integer.parseInt(cadena);  
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean verificarNombre(String cadena2) {
        try {
            Integer.parseInt(cadena2);  
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JButton bajaAlta;
    private javax.swing.JButton buscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtidentificador;
    private javax.swing.JComboBox<String> opciones;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
