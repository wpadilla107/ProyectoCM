/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Persona;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Wdavid
 */
public class Agenda extends javax.swing.JDialog {

    /**
     * Creates new form Agenda
     */
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Persona> personas;
    int aux = 0;

    public Agenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/Personas.txt";
        try {
            personas = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Helper.volcado(salida, personas);
        Helper.llenarTabla(tblTabla1, ruta);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(153, 255, 255));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, -1));

        txtDireccion.setBackground(new java.awt.Color(153, 255, 255));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, -1));

        txtCelular.setBackground(new java.awt.Color(153, 255, 255));
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        jPanel2.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 130, -1));

        txtTelefono.setBackground(new java.awt.Color(153, 255, 255));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, -1));

        jLabel1.setText("Telefono");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Direccion");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setText("Celular");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtApellido.setBackground(new java.awt.Color(153, 255, 255));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, -1));

        jLabel5.setText("Apellido");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel6.setText("Sexo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        rbMasculino.setBackground(new java.awt.Color(204, 255, 255));
        bgSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");
        jPanel2.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        rbFemenino.setBackground(new java.awt.Color(204, 255, 255));
        bgSexo.add(rbFemenino);
        rbFemenino.setText("Femenino");
        jPanel2.add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 230));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 51, 51)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setBackground(new java.awt.Color(102, 255, 255));
        cmdGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add-user-symbol.png"))); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 40));

        cmdEliminar.setBackground(new java.awt.Color(102, 255, 255));
        cmdEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recycle-bin.png"))); // NOI18N
        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 40));

        cmdCancelar.setBackground(new java.awt.Color(102, 255, 255));
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 110, 40));

        cmdBuscar.setBackground(new java.awt.Color(102, 255, 255));
        cmdBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/magnifier.png"))); // NOI18N
        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 280, 160));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agenda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, null, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTabla1.setBackground(new java.awt.Color(204, 255, 255));
        tblTabla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        tblTabla1.setForeground(new java.awt.Color(0, 102, 102));
        tblTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nombre", "Apellido", "Direccion", "Celular", "Telefono", "Sexo"
            }
        ));
        tblTabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 650, 270));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 670, 300));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2324.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(716, 625));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String nom, ape, direcc, cel, tel, sexo = "";

        nom = txtNombre.getText();
        ape = txtApellido.getText();
        direcc = txtDireccion.getText();
        cel = txtCelular.getText();
        tel = txtTelefono.getText();
        if (rbFemenino.isSelected()) {
            sexo = sexo + "Femenino";
        } else if (rbMasculino.isSelected()) {
            sexo = sexo + "Masculino";
        }
        if (txtCelular.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Increse porfavor el numero de celular del cliente", 1);
            txtCelular.requestFocusInWindow();
        } else if (txtNombre.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Increse porfavor el nombre del cliente", 1);
            txtNombre.requestFocusInWindow();
        } else if (txtDireccion.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Increse porfavor la direccion del cliente", 1);
            txtDireccion.requestFocusInWindow();
        } else if (txtTelefono.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Increse porfavor el telefono del cliente", 1);
            txtTelefono.requestFocusInWindow();
        } else {

            ArrayList<Persona> personasModificado;
            try {
                if (aux == 0) {
                    Persona p = new Persona(nom, ape, direcc, cel, tel, sexo);
                    p.guardar(salida);
                } else {
                    personasModificado = Helper.modificarPersona(ruta, nom, ape, direcc, sexo, cel, tel);
                    salida = new ObjectOutputStream(new FileOutputStream(ruta));
                    Helper.volcado(salida, personasModificado);
                    aux = 0;
                    Helper.mensaje(this, "Persona Actualizada Correctamente!", 1);
                }

            } catch (IOException ex) {
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            }

            Helper.llenarTabla(tblTabla1, ruta);
            txtNombre.setText("");
            txtApellido.setText("");
            txtDireccion.setText("");
            txtCelular.setText("");
            txtTelefono.setText("");
            txtNombre.requestFocusInWindow();
            bgSexo.clearSelection();
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void tblTabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTabla1MouseClicked
        int i;
        Persona p;
        ArrayList<Persona> personas = Helper.traerDatos(ruta);
        i = tblTabla1.getSelectedRow();
        p = personas.get(i);

        txtApellido.setText(p.getApellidos());
        txtNombre.setText(p.getNombre());
        txtDireccion.setText(p.getDireccion());
        txtCelular.setText(p.getCelular());
        txtTelefono.setText(p.getTelefono());
        //Probando
        bgSexo.setSelected(null, true);
        aux = 1;

    }//GEN-LAST:event_tblTabla1MouseClicked

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;

        op = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar a esta persona?", "Eliminar", JOptionPane.YES_NO_OPTION);
        ArrayList<Persona> personas = Helper.traerDatos(ruta);
        if (op == JOptionPane.YES_OPTION) {

            i = tblTabla1.getSelectedRow();
            personas.remove(i);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.volcado(salida, personas);
            Helper.llenarTabla(tblTabla1, ruta);

            txtNombre.setText("");
            txtApellido.setText("");
            txtDireccion.setText("");
            txtCelular.setText("");
            txtTelefono.setText("");
            txtNombre.requestFocusInWindow();
        }

    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtCelular.setText("");
        txtTelefono.setText("");
        txtNombre.requestFocusInWindow();
        bgSexo.clearSelection();
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String celular;
        celular = txtCelular.getText();
        Persona p;
        if (Helper.buscarPersonaCelular(celular, ruta)) {
            p = Helper.traerPersonaCelular(celular, ruta);
            txtNombre.setText(p.getNombre());
            txtApellido.setText(p.getApellidos());
            txtDireccion.setText(p.getDireccion());
            txtTelefono.setText(p.getTelefono());
            bgSexo.getSelection();
            aux = 1;
        } else {
            txtNombre.requestFocusInWindow();
            aux = 0;
        }
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        //Solo numero
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
       
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
      //solo texto
        char c = evt.getKeyChar();

        if (Character.isDigit(c) ) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
      char c = evt.getKeyChar();

        if (Character.isDigit(c) ) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
       
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        
    }//GEN-LAST:event_txtDireccionKeyTyped

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agenda dialog = new Agenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tblTabla1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
