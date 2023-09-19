package vistas;

import entidades.Alumno;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import persistencia.AlumnoData;


public class ManipNotas extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    public ManipNotas() {
        
        initComponents();
        String[] titulos = new String[]{"ID","Nombre","Nota"};
        tabla.setColumnIdentifiers(titulos);
        tablaNotas.setModel(tabla);
        
        AlumnoData alum = new AlumnoData(); 
        List<Alumno> list = alum.listarAlumnos();
        
        list.forEach((alumno) -> {
            listaAlumnos.addItem(alumno.toString());
        });
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardarNota = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        listaAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setMaximizable(true);

        guardarNota.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        guardarNota.setForeground(new java.awt.Color(0, 0, 0));
        guardarNota.setText("Guardar ");
        guardarNota.setBorder(null);
        guardarNota.setBorderPainted(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione un Alumno");

        listaAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        listaAlumnos.setForeground(new java.awt.Color(0, 0, 0));
        listaAlumnos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAlumnosActionPerformed(evt);
            }
        });

        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaNotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(listaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAlumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardarNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listaAlumnos;
    private javax.swing.JTable tablaNotas;
    // End of variables declaration//GEN-END:variables
}
