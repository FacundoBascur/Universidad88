package vistas;

import entidades.Materia;
import javax.swing.JOptionPane;
import persistencia.MateriaData;

public class FormularioMateria extends javax.swing.JInternalFrame {

    private MateriaData materia = new MateriaData();
    private Materia mat = null;

    public FormularioMateria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTNombre = new javax.swing.JTextField();
        jTId = new javax.swing.JTextField();
        jTAnio = new javax.swing.JTextField();
        BBuscar = new java.awt.Button();
        BNuevo = new java.awt.Button();
        BGuardar = new java.awt.Button();
        BSalir = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CActivo2 = new javax.swing.JCheckBox();

        jTextField4.setText("jTextField1");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jTNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(153, 153, 153));

        jTId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTId.setForeground(new java.awt.Color(153, 153, 153));

        jTAnio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTAnio.setForeground(new java.awt.Color(153, 153, 153));

        BBuscar.setBackground(new java.awt.Color(153, 153, 153));
        BBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BBuscar.setForeground(new java.awt.Color(51, 51, 51));
        BBuscar.setLabel("Buscar");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        BNuevo.setBackground(new java.awt.Color(153, 153, 153));
        BNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BNuevo.setForeground(new java.awt.Color(51, 51, 51));
        BNuevo.setLabel("Nuevo");
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });

        BGuardar.setBackground(new java.awt.Color(153, 153, 153));
        BGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BGuardar.setForeground(new java.awt.Color(51, 51, 51));
        BGuardar.setLabel("Guardar ");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });

        BSalir.setBackground(new java.awt.Color(153, 153, 153));
        BSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BSalir.setForeground(new java.awt.Color(51, 51, 51));
        BSalir.setLabel("Salir");
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Gestión de Materias");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Estado");

        CActivo2.setText("  Activo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(CActivo2)
                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(BSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CActivo2))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        try {
            if (jTId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo Id no puede estar vacío");
            } else if (jTId.getText() == "") {
                JOptionPane.showMessageDialog(null, "El campo Id admite solo números enteros positivos");
                //VER PQ NO EJECUTA LA LINEA 218?
            } else if (Integer.parseInt(jTId.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "El Id debe ser un número positivo mayor a 0.");

            } else if (!jTNombre.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "El campo Nombre debe estar vacío.");

            } else if (!jTAnio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo Año debe estar vacío.");
            } else if (CActivo2.isSelected()) {
                JOptionPane.showMessageDialog(null, "El campo Activo no debe estar seleccionado.");
            } else {
                Integer id = Integer.parseInt(jTId.getText());
                mat = materia.buscarMateria(id);

                jTNombre.setText(mat.getNombre());
                jTAnio.setText(mat.getAnio() + "");
                CActivo2.setSelected(mat.isActivo());

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error - caracter invalido");

        }

        Materia mat = null;
    }//GEN-LAST:event_BBuscarActionPerformed

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BSalirActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        if (jTId != null && jTNombre != null && jTAnio != null && CActivo2 != null) {

            jTId.setText("");
            jTNombre.setText("");
            jTAnio.setText("");
            CActivo2.setSelected(false);
        }
    }//GEN-LAST:event_BNuevoActionPerformed


    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        try {
            if (!jTId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo Id debe estar vacío.");
    jTId.setText("");
            } else if (jTNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo Nombre no puede estar vacío.");
            } else if (jTAnio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo Año no puede estar vacío.");
            } else if (verificarAnio(jTAnio.getText()) == false) {
                JOptionPane.showMessageDialog(null, "El campo Año debe ser numérico.");
   jTAnio.setText("");
            } else if (verificarNombre(jTNombre.getText()) == true) {
                JOptionPane.showMessageDialog(null, "El campo Nombre no puede ser numérico.");
  jTNombre.setText("");
            } else if (jTAnio.getText().length() > 1) {
                JOptionPane.showMessageDialog(null, "El campo Año debe contener un dígito.");
jTAnio.setText("");
            } else {
                materia.guardarMateria(new Materia(jTNombre.getText(), Integer.parseInt(jTAnio.getText()), CActivo2.isSelected()));
            jTId.setText("");
            jTNombre.setText("");
            jTAnio.setText("");
            CActivo2.setSelected(false);
            
            }

          

        } catch (NumberFormatException | IndexOutOfBoundsException | NullPointerException p) {
            JOptionPane.showMessageDialog(null, "Error al registrar, campos en formato incorrecto.");

    }//GEN-LAST:event_BGuardarActionPerformed
       

    }

    public boolean verificarAnio(String cadena) {
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
    private java.awt.Button BBuscar;
    private java.awt.Button BGuardar;
    private java.awt.Button BNuevo;
    private java.awt.Button BSalir;
    private javax.swing.JCheckBox CActivo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTAnio;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
