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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        porId = new javax.swing.JButton();
        jtId = new javax.swing.JTextField();
        porDni = new javax.swing.JButton();
        jtDni = new javax.swing.JTextField();
        listarTodos = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(510, 450));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busqueda de Alumnos ");

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

        porId.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        porId.setForeground(new java.awt.Color(0, 0, 0));
        porId.setText("Por ID");
        porId.setBorder(null);
        porId.setBorderPainted(false);
        porId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porIdActionPerformed(evt);
            }
        });

        porDni.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        porDni.setForeground(new java.awt.Color(0, 0, 0));
        porDni.setText("Por DNI");
        porDni.setBorder(null);
        porDni.setBorderPainted(false);
        porDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porDniActionPerformed(evt);
            }
        });

        listarTodos.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        listarTodos.setForeground(new java.awt.Color(0, 0, 0));
        listarTodos.setText("Listar todos");
        listarTodos.setBorder(null);
        listarTodos.setBorderPainted(false);
        listarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarTodosActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 133, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(porDni, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(porId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(listarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(porId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(porDni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(listarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarTodosActionPerformed

        try {
            tabla.setRowCount(0);
            List<Alumno> lista = alumno.listarAlumnos();

            lista.forEach((alum) -> {
                tabla.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre(), alum.getFechaNac(), alum.isActivo()});
            });

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_listarTodosActionPerformed

    private void porDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porDniActionPerformed

        try {
            if (jtDni.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo 'Por Dni' vacio");
            } else if (Integer.parseInt(jtDni.getText()) <= 0 || jtDni.getText().length() <= 5) {
                JOptionPane.showMessageDialog(null, "Formato de DNI incorrecto");

            } else {
                tabla.setRowCount(0);

                Alumno alum = alumno.buscarPorDni(Integer.parseInt(jtDni.getText()));

                tabla.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre(), alum.getFechaNac(), alum.isActivo()});
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error - caracter invalido");

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El alumno solicitado no se encuentra en la base de datos");
        }

    }//GEN-LAST:event_porDniActionPerformed

    private void porIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porIdActionPerformed
        try {
            if (jtId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo 'Por ID' vacio");
            } else if (Integer.parseInt(jtId.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Formato de ID incorrecto");

            } else {
                tabla.setRowCount(0);

                Alumno alum = alumno.buscarPorId(Integer.parseInt(jtId.getText()));

                tabla.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre(), alum.getFechaNac(), alum.isActivo()});
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error - caracter invalido");

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El alumno solicitado no se encuentra en la base de datos");
        }
    }//GEN-LAST:event_porIdActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

        AlumnoData alumno = new AlumnoData();
        //En estos variables se guardan los datos obtenidos de la tabla seleccionada. "tabla.getValueAt(tablaAlumnos.getSelectedRow()"
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
    }//GEN-LAST:event_ModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtId;
    private javax.swing.JButton listarTodos;
    private javax.swing.JButton porDni;
    private javax.swing.JButton porId;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
