package vistas;

import javax.swing.JFrame;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        registroAlumnos = new javax.swing.JMenuItem();
        busquedaModificiacion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMFormularioMateria = new javax.swing.JMenuItem();
        jMListarMaterias = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        maniNotas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        alumXmateria = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(102, 102, 255));
        escritorio.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        escritorio.setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        jMenuBar2.setBackground(new java.awt.Color(204, 204, 204));

        jMenu3.setText("Alumno");

        registroAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionar.png"))); // NOI18N
        registroAlumnos.setText("Registrar Alumnos");
        registroAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroAlumnosActionPerformed(evt);
            }
        });
        jMenu3.add(registroAlumnos);

        busquedaModificiacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionar.png"))); // NOI18N
        busquedaModificiacion.setText("Búsqueda y modificación de Alumnos");
        busquedaModificiacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaModificiacionActionPerformed(evt);
            }
        });
        jMenu3.add(busquedaModificiacion);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Materia");

        jMFormularioMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionar.png"))); // NOI18N
        jMFormularioMateria.setText("Formulario de materia");
        jMFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMFormularioMateria);

        jMListarMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionar.png"))); // NOI18N
        jMListarMaterias.setText("Listar Materias");
        jMListarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListarMateriasActionPerformed(evt);
            }
        });
        jMenu4.add(jMListarMaterias);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Administración");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionar.png"))); // NOI18N
        jMenuItem3.setText("Manejo de inscripciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        maniNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionar.png"))); // NOI18N
        maniNotas.setText("Manipulación de notas");
        maniNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maniNotasActionPerformed(evt);
            }
        });
        jMenu5.add(maniNotas);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Consultas");

        alumXmateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionar.png"))); // NOI18N
        alumXmateria.setText("Alumnos por materia");
        alumXmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumXmateriaActionPerformed(evt);
            }
        });
        jMenu6.add(alumXmateria);

        jMenuBar2.add(jMenu6);

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMSalir);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void busquedaModificiacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaModificiacionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ListarAlumnos listar = new ListarAlumnos();
        listar.setVisible(true);
        escritorio.add(listar);
        escritorio.moveToFront(listar);
        listar.setLocation(228, 125);
    }//GEN-LAST:event_busquedaModificiacionActionPerformed

    private void registroAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroAlumnosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AgregarAlumnos agre = new AgregarAlumnos();
        agre.setVisible(true);
        escritorio.add(agre);
        escritorio.moveToFront(agre);
        agre.setLocation(250, 208);
    }//GEN-LAST:event_registroAlumnosActionPerformed

    private void jMFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioMateriaActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
      FormularioMateria form=new FormularioMateria();
        form.setVisible(true);
        escritorio.add(form);
        escritorio.moveToFront(form);
        form.setLocation(250, 208);
    }//GEN-LAST:event_jMFormularioMateriaActionPerformed

    private void jMListarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListarMateriasActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
     ListarMaterias listar=new ListarMaterias();
        listar.setVisible(true);
        escritorio.add(listar);
        escritorio.moveToFront(listar);
        listar.setLocation(250, 208);
    }//GEN-LAST:event_jMListarMateriasActionPerformed

    private void maniNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maniNotasActionPerformed
    escritorio.removeAll();
    escritorio.repaint();
    ManipNotas notas = new ManipNotas(); 
    notas.setVisible(true);
    escritorio.add(notas);
    escritorio.moveToFront(notas);
    notas.setLocation(250, 208);
    }//GEN-LAST:event_maniNotasActionPerformed

    private void alumXmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumXmateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AlumnosXmateria alumxM = new AlumnosXmateria();
        alumxM.setVisible(true);
        escritorio.add(alumxM);
        escritorio.moveToFront(alumxM);
        alumxM.setLocation(250, 208);
    }//GEN-LAST:event_alumXmateriaActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
 
    }//GEN-LAST:event_jMSalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main frame = new Main();
                frame.setLocationRelativeTo(null); //Para que se ejecute en el centro de la pantalla
                frame.setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alumXmateria;
    private javax.swing.JMenuItem busquedaModificiacion;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMFormularioMateria;
    private javax.swing.JMenuItem jMListarMaterias;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem maniNotas;
    private javax.swing.JMenuItem registroAlumnos;
    // End of variables declaration//GEN-END:variables
}
