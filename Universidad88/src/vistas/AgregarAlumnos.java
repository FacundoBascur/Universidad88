package vistas;

import entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import persistencia.AlumnoData;

public class AgregarAlumnos extends javax.swing.JInternalFrame {

    AlumnoData alumno = new AlumnoData();

    public AgregarAlumnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        activo = new javax.swing.JCheckBox();
        salir = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        setForeground(new java.awt.Color(0, 0, 0));
        setTitle("                                                          Registro de Alumnos");
        setVisible(true);

        jtApellido.setBackground(new java.awt.Color(0, 102, 102));
        jtApellido.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jtApellido.setForeground(new java.awt.Color(204, 204, 204));
        jtApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jtNombre.setBackground(new java.awt.Color(0, 102, 102));
        jtNombre.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(204, 204, 204));
        jtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jtDni.setBackground(new java.awt.Color(0, 102, 102));
        jtDni.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jtDni.setForeground(new java.awt.Color(204, 204, 204));
        jtDni.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fecha de Nacimiento");

        jcFechaNacimiento.setBackground(new java.awt.Color(0, 102, 102));
        jcFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jcFechaNacimiento.setForeground(new java.awt.Color(0, 102, 102));
        jcFechaNacimiento.setDateFormatString("yyyy/MM/dd");
        jcFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("D.N.I");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre");

        jbGuardar.setBackground(new java.awt.Color(0, 102, 102));
        jbGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(204, 204, 204));
        jbGuardar.setText("Guardar");
        jbGuardar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        activo.setBackground(new java.awt.Color(0, 102, 102));
        activo.setForeground(new java.awt.Color(204, 204, 204));
        activo.setText("Activo");
        activo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        activo.setBorderPainted(true);
        activo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        salir.setBackground(new java.awt.Color(0, 102, 102));
        salir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtApellido)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtNombre)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(activo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activo))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        int cont = 0;
        int dniDu = 0;

        try {

            if (jtApellido.getText().isEmpty() || jtNombre.getText().isEmpty() || jtDni.getText().isEmpty()) { // verifica si los jtextfield estan vacios
                JOptionPane.showMessageDialog(null, "No se admiten campos vacios");
            } else if (Integer.parseInt(jtDni.getText()) <= 0 || jtDni.getText().length() <= 6) { //verifica si los numeros son negativos o muy extensos
                JOptionPane.showMessageDialog(null, "Formato de DNI incorrecto");
            } else {

                LocalDate fecha = jcFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                //en este for recorro toda la lista de alumnos registrados y voy comporando los dni con el que se coloco en el jtextfield, si este ya se encuentra - cont pasara a valer 1 
                for (Alumno alum : alumno.listarAlumnos()) {

                    if (alum.getDni() == Integer.parseInt(jtDni.getText())) {
                        cont++;
                        dniDu = Integer.parseInt(jtDni.getText());
                        break;
                    }
                }

                if (cont == 0) {
                    alumno.guardarAlumnos(new Alumno(Integer.parseInt(jtDni.getText()), jtApellido.getText(), jtNombre.getText(), fecha, activo.isSelected())); // crea el alumno, llama al metodo y lo setea en la base de datos
                } else {
                    JOptionPane.showMessageDialog(null, "El DNI " + dniDu + "\nYa se encuentra registrado en la base de datos \nIntenetelo nuevamente");
                }

                jtApellido.setText("");
                jtDni.setText("");
                jtNombre.setText("");
                jcFechaNacimiento.setDate(null);
                activo.setSelected(false);

            }

        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar, campos en formato incorrecto.");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbGuardar;
    private com.toedter.calendar.JDateChooser jcFechaNacimiento;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

}
