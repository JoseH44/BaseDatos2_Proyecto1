/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop_app;
import java.security.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramon
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registro = new javax.swing.JDialog();
        jb_regresar_registro = new javax.swing.JButton();
        jb_registrar_registro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombres_registrar = new javax.swing.JTextField();
        tf_apellidos_registrar = new javax.swing.JTextField();
        tf_username_registrar = new javax.swing.JTextField();
        tf_contrasena_registrar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_Confirmar_contrasena_registrar = new javax.swing.JTextField();
        jd_admin = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_clases_admin = new javax.swing.JTable();
        jb_agregarClase_admin = new javax.swing.JButton();
        jd_alumno = new javax.swing.JDialog();
        jd_AgregarClase = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_idClase_admin = new javax.swing.JTextField();
        tf_nombreClase_admin = new javax.swing.JTextField();
        jb_ConfirmarAgregarClase_admin = new javax.swing.JButton();
        jb_regresarAadmin = new javax.swing.JButton();
        jpm_opcionesClase_admin = new javax.swing.JPopupMenu();
        jm_agregarPregunta = new javax.swing.JMenuItem();
        jm_CrearExamen = new javax.swing.JMenuItem();
        jm_mostrarExamen = new javax.swing.JMenuItem();
        jd_crearPregunta_admin = new javax.swing.JDialog();
        jb_crearPregunta = new javax.swing.JButton();
        jb_regresarAadmin_p = new javax.swing.JButton();
        jd_crearExamen_admin = new javax.swing.JDialog();
        jb_regresarAadmin_CE = new javax.swing.JButton();
        jb_crearExamen = new javax.swing.JButton();
        jd_mostrarExamen = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_login_username = new javax.swing.JTextField();
        tf_login_password = new javax.swing.JTextField();
        jb_login_iniciarS = new javax.swing.JButton();
        jb_login_registrarse = new javax.swing.JButton();

        jd_registro.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jb_regresar_registro.setText("Regresar");
        jb_regresar_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regresar_registroMouseClicked(evt);
            }
        });

        jb_registrar_registro.setText("Registrar");
        jb_registrar_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registrar_registroMouseClicked(evt);
            }
        });

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Usuario:");

        jLabel6.setText("Contraseña:");

        jLabel9.setText("Confirmar Contraseña");

        javax.swing.GroupLayout jd_registroLayout = new javax.swing.GroupLayout(jd_registro.getContentPane());
        jd_registro.getContentPane().setLayout(jd_registroLayout);
        jd_registroLayout.setHorizontalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addComponent(jb_registrar_registro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jb_regresar_registro))
                    .addComponent(tf_nombres_registrar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_apellidos_registrar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_Confirmar_contrasena_registrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(tf_contrasena_registrar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_username_registrar, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jd_registroLayout.setVerticalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombres_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_apellidos_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_username_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_contrasena_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_Confirmar_contrasena_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_registrar_registro)
                    .addComponent(jb_regresar_registro))
                .addGap(37, 37, 37))
        );

        jd_admin.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jt_clases_admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de la Clase"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_clases_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_clases_adminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_clases_admin);

        jb_agregarClase_admin.setText("Agregar una Clase");
        jb_agregarClase_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarClase_adminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_adminLayout = new javax.swing.GroupLayout(jd_admin.getContentPane());
        jd_admin.getContentPane().setLayout(jd_adminLayout);
        jd_adminLayout.setHorizontalGroup(
            jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_adminLayout.createSequentialGroup()
                .addGroup(jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_adminLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_adminLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jb_agregarClase_admin)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jd_adminLayout.setVerticalGroup(
            jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_adminLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jb_agregarClase_admin)
                .addGap(23, 23, 23))
        );

        jd_alumno.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jd_alumnoLayout = new javax.swing.GroupLayout(jd_alumno.getContentPane());
        jd_alumno.getContentPane().setLayout(jd_alumnoLayout);
        jd_alumnoLayout.setHorizontalGroup(
            jd_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        jd_alumnoLayout.setVerticalGroup(
            jd_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        jLabel7.setText("ID:");

        jLabel8.setText("Nombre de la Clase:");

        jb_ConfirmarAgregarClase_admin.setText("Agregar");

        jb_regresarAadmin.setText("Regresar");
        jb_regresarAadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regresarAadminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_AgregarClaseLayout = new javax.swing.GroupLayout(jd_AgregarClase.getContentPane());
        jd_AgregarClase.getContentPane().setLayout(jd_AgregarClaseLayout);
        jd_AgregarClaseLayout.setHorizontalGroup(
            jd_AgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarClaseLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jd_AgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jd_AgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_idClase_admin)
                    .addComponent(tf_nombreClase_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarClaseLayout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jb_ConfirmarAgregarClase_admin)
                .addGap(18, 18, 18)
                .addComponent(jb_regresarAadmin)
                .addGap(16, 16, 16))
        );
        jd_AgregarClaseLayout.setVerticalGroup(
            jd_AgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarClaseLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jd_AgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_idClase_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jd_AgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombreClase_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jd_AgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_ConfirmarAgregarClase_admin)
                    .addComponent(jb_regresarAadmin))
                .addContainerGap())
        );

        jm_agregarPregunta.setText("Crear Pregunta");
        jm_agregarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_agregarPreguntaActionPerformed(evt);
            }
        });
        jpm_opcionesClase_admin.add(jm_agregarPregunta);

        jm_CrearExamen.setText("Crear Examen");
        jm_CrearExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_CrearExamenActionPerformed(evt);
            }
        });
        jpm_opcionesClase_admin.add(jm_CrearExamen);

        jm_mostrarExamen.setText("Mostrar Examen");
        jm_mostrarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_mostrarExamenActionPerformed(evt);
            }
        });
        jpm_opcionesClase_admin.add(jm_mostrarExamen);

        jb_crearPregunta.setText("Crear");

        jb_regresarAadmin_p.setText("Regresar");
        jb_regresarAadmin_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regresarAadmin_pMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearPregunta_adminLayout = new javax.swing.GroupLayout(jd_crearPregunta_admin.getContentPane());
        jd_crearPregunta_admin.getContentPane().setLayout(jd_crearPregunta_adminLayout);
        jd_crearPregunta_adminLayout.setHorizontalGroup(
            jd_crearPregunta_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearPregunta_adminLayout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jb_crearPregunta)
                .addGap(64, 64, 64)
                .addComponent(jb_regresarAadmin_p)
                .addGap(65, 65, 65))
        );
        jd_crearPregunta_adminLayout.setVerticalGroup(
            jd_crearPregunta_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearPregunta_adminLayout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addGroup(jd_crearPregunta_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_crearPregunta)
                    .addComponent(jb_regresarAadmin_p))
                .addGap(21, 21, 21))
        );

        jb_regresarAadmin_CE.setText("Regresar");
        jb_regresarAadmin_CE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regresarAadmin_CEMouseClicked(evt);
            }
        });

        jb_crearExamen.setText("Crear Examen");

        javax.swing.GroupLayout jd_crearExamen_adminLayout = new javax.swing.GroupLayout(jd_crearExamen_admin.getContentPane());
        jd_crearExamen_admin.getContentPane().setLayout(jd_crearExamen_adminLayout);
        jd_crearExamen_adminLayout.setHorizontalGroup(
            jd_crearExamen_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearExamen_adminLayout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(jb_crearExamen)
                .addGap(33, 33, 33)
                .addComponent(jb_regresarAadmin_CE)
                .addGap(33, 33, 33))
        );
        jd_crearExamen_adminLayout.setVerticalGroup(
            jd_crearExamen_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearExamen_adminLayout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addGroup(jd_crearExamen_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_regresarAadmin_CE)
                    .addComponent(jb_crearExamen))
                .addGap(27, 27, 27))
        );

        jButton1.setText("Regresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_mostrarExamenLayout = new javax.swing.GroupLayout(jd_mostrarExamen.getContentPane());
        jd_mostrarExamen.getContentPane().setLayout(jd_mostrarExamenLayout);
        jd_mostrarExamenLayout.setHorizontalGroup(
            jd_mostrarExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_mostrarExamenLayout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );
        jd_mostrarExamenLayout.setVerticalGroup(
            jd_mostrarExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_mostrarExamenLayout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        jb_login_iniciarS.setText("Iniciar Sesión");
        jb_login_iniciarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_login_iniciarSMouseClicked(evt);
            }
        });

        jb_login_registrarse.setText("Registrarse");
        jb_login_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_login_registrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_login_username)
                            .addComponent(tf_login_password, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jb_login_iniciarS)
                        .addGap(42, 42, 42)
                        .addComponent(jb_login_registrarse)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_login_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_login_iniciarS)
                    .addComponent(jb_login_registrarse))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_login_registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_login_registrarseMouseClicked
        this.setVisible(false);
        jd_registro.pack();
        jd_registro.setModal(true);
        jd_registro.setLocationRelativeTo(this);
        jd_registro.setVisible(true);
        tf_login_username.setText("");
        tf_login_password.setText("");
        
    }//GEN-LAST:event_jb_login_registrarseMouseClicked

    private void jb_regresar_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regresar_registroMouseClicked
        tf_nombres_registrar.setText("");
        tf_apellidos_registrar.setText("");
        tf_username_registrar.setText("");
        tf_contrasena_registrar.setText("");
        tf_Confirmar_contrasena_registrar.setText("");
        this.setVisible(true);
        jd_registro.dispose();
        
    }//GEN-LAST:event_jb_regresar_registroMouseClicked

    private void jb_registrar_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registrar_registroMouseClicked
        /*
        verificación de datos
        --Lo siguiente es para la contraseña digerida
        String password = SHA(tf_login_password.getText());
        JOptionPane.showMessageDialog(this, password);
        */
        String nombreA = tf_nombres_registrar.getText() + " " + tf_apellidos_registrar.getText();
        String userA = tf_username_registrar.getText();
        try {
            String password = SHA(tf_contrasena_registrar.getText());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        tf_nombres_registrar.setText("");
        tf_apellidos_registrar.setText("");
        tf_username_registrar.setText("");
        tf_contrasena_registrar.setText("");
        this.setVisible(true);
        jd_registro.dispose();
    }//GEN-LAST:event_jb_registrar_registroMouseClicked

    private void jb_login_iniciarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_login_iniciarSMouseClicked
//    llenado de tabla para el admin sin la base de datos
    DefaultTableModel modelC1 = (DefaultTableModel)jt_clases_admin.getModel();
    Object[] newRow = {1,"Español"};
    modelC1.addRow(newRow);
    jt_clases_admin.setModel(modelC1);
    this.setVisible(false);
    jd_admin.pack();
    jd_admin.setModal(true);
    jd_admin.setLocationRelativeTo(this);
    jd_admin.setVisible(true);
    
           
        
        
    }//GEN-LAST:event_jb_login_iniciarSMouseClicked

    private void jb_regresarAadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regresarAadminMouseClicked
        tf_idClase_admin.setText("");
        tf_nombreClase_admin.setText("");
        jd_AgregarClase.dispose();
        jd_admin.setVisible(true);
        
    }//GEN-LAST:event_jb_regresarAadminMouseClicked

    private void jb_agregarClase_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarClase_adminMouseClicked
        jd_admin.setVisible(false);
        jd_AgregarClase.pack();
        jd_AgregarClase.setModal(true);
        jd_AgregarClase.setLocationRelativeTo(jd_admin);
        jd_AgregarClase.setVisible(true);
    }//GEN-LAST:event_jb_agregarClase_adminMouseClicked

    private void jt_clases_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_clases_adminMouseClicked
        if (evt.isMetaDown()) {
            if (jt_clases_admin.getSelectedRow()>=0) {
                jpm_opcionesClase_admin.show(evt.getComponent(), evt.getX(), evt.getY());
            } 
        }
    }//GEN-LAST:event_jt_clases_adminMouseClicked

    private void jm_agregarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_agregarPreguntaActionPerformed
        //abrir ventana para agregarle una pregunta a la clase
        jd_admin.setVisible(false);
        jd_crearPregunta_admin.pack();
        jd_crearPregunta_admin.setModal(true);
        jd_crearPregunta_admin.setLocationRelativeTo(jd_admin);
        jd_crearPregunta_admin.setVisible(true);
    }//GEN-LAST:event_jm_agregarPreguntaActionPerformed

    private void jm_CrearExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_CrearExamenActionPerformed
        /*abrir ventana con las preguntas del examen en un jlist,
        nombre de la clase, un jspinner o jtext mostrando cuantas lleva y cuál es el límite
        */
        jd_admin.setVisible(false);
        jd_crearExamen_admin.pack();
        jd_crearExamen_admin.setModal(true);
        jd_crearExamen_admin.setLocationRelativeTo(jd_admin);
        jd_crearExamen_admin.setVisible(true);
    }//GEN-LAST:event_jm_CrearExamenActionPerformed

    private void jm_mostrarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_mostrarExamenActionPerformed
        //abrir ventana con un jlist enseñando las preguntas del exmamen.
        jd_admin.setVisible(false);
        jd_mostrarExamen.pack();
        jd_mostrarExamen.setModal(true);
        jd_mostrarExamen.setLocationRelativeTo(jd_admin);
        jd_mostrarExamen.setVisible(true);
    }//GEN-LAST:event_jm_mostrarExamenActionPerformed

    private void jb_regresarAadmin_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regresarAadmin_pMouseClicked
        jd_crearPregunta_admin.dispose();
        jd_admin.setVisible(true);
    }//GEN-LAST:event_jb_regresarAadmin_pMouseClicked

    private void jb_regresarAadmin_CEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regresarAadmin_CEMouseClicked
        jd_crearExamen_admin.dispose();
        jd_admin.setVisible(true);
    }//GEN-LAST:event_jb_regresarAadmin_CEMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jd_mostrarExamen.dispose();
        jd_admin.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    
    public String SHA(String password) throws NoSuchAlgorithmException{
        //cadena introducida por el usuario
        byte[] input = password.getBytes();
        //objeto de mensage digerido usando SHA1
        MessageDigest SHA1 = MessageDigest.getInstance("SHA");
        SHA1.update(input);
        byte[] digest = SHA1.digest();
        //conversion a formato hex
        StringBuffer hexaDigest = new StringBuffer();
        for (int i = 0; i < digest.length; i++) {
            hexaDigest.append(Integer.toString((digest[i]&0xff)+0x100,16).substring(1));
        }
        
        String pass = hexaDigest.toString();
        return pass;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_ConfirmarAgregarClase_admin;
    private javax.swing.JButton jb_agregarClase_admin;
    private javax.swing.JButton jb_crearExamen;
    private javax.swing.JButton jb_crearPregunta;
    private javax.swing.JButton jb_login_iniciarS;
    private javax.swing.JButton jb_login_registrarse;
    private javax.swing.JButton jb_registrar_registro;
    private javax.swing.JButton jb_regresarAadmin;
    private javax.swing.JButton jb_regresarAadmin_CE;
    private javax.swing.JButton jb_regresarAadmin_p;
    private javax.swing.JButton jb_regresar_registro;
    private javax.swing.JDialog jd_AgregarClase;
    private javax.swing.JDialog jd_admin;
    private javax.swing.JDialog jd_alumno;
    private javax.swing.JDialog jd_crearExamen_admin;
    private javax.swing.JDialog jd_crearPregunta_admin;
    private javax.swing.JDialog jd_mostrarExamen;
    private javax.swing.JDialog jd_registro;
    private javax.swing.JMenuItem jm_CrearExamen;
    private javax.swing.JMenuItem jm_agregarPregunta;
    private javax.swing.JMenuItem jm_mostrarExamen;
    private javax.swing.JPopupMenu jpm_opcionesClase_admin;
    private javax.swing.JTable jt_clases_admin;
    private javax.swing.JTextField tf_Confirmar_contrasena_registrar;
    private javax.swing.JTextField tf_apellidos_registrar;
    private javax.swing.JTextField tf_contrasena_registrar;
    private javax.swing.JTextField tf_idClase_admin;
    private javax.swing.JTextField tf_login_password;
    private javax.swing.JTextField tf_login_username;
    private javax.swing.JTextField tf_nombreClase_admin;
    private javax.swing.JTextField tf_nombres_registrar;
    private javax.swing.JTextField tf_username_registrar;
    // End of variables declaration//GEN-END:variables
}
