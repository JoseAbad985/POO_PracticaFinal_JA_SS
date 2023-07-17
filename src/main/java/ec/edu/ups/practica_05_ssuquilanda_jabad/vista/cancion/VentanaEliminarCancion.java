/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica_05_ssuquilanda_jabad.vista.cancion;

import ec.edu.ups.practica_05_ssuquilanda_jabad.controlador.ControladorCompositor;
import ec.edu.ups.practica_05_ssuquilanda_jabad.modelo.Cancion;
import ec.edu.ups.practica_05_ssuquilanda_jabad.modelo.Compositor;
import ec.edu.ups.practica_05_ssuquilanda_jabad.modelo.Disco;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class VentanaEliminarCancion extends javax.swing.JInternalFrame {
    private ControladorCompositor controladorCompositor;
    private ResourceBundle mensajes;
    /**
     * Creates new form VentanaEliminarCancion
     */
    public VentanaEliminarCancion(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }
    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jLabel3.setText(mensajes.getString("txtInstruccionEliminarCancion1"));
        lblNombreCrearPersona5.setText(mensajes.getString("txtCódigo"));
        lblNombreCrearPersona4.setText(mensajes.getString("txtNombre"));        
        lblFechaNacimientoCrearPersona1.setText(mensajes.getString("txtApellido"));        
        lblNombreCrearPersona6.setText(mensajes.getString("txtEdad"));        
        lblNacionalidadBuscarCantante1.setText(mensajes.getString("txtNacionalidad"));       
        lblNumGirasBuscarCantante1.setText(mensajes.getString("txtNúmeroDeComposiciónes"));        
        lblSalarioBuscarCantante1.setText(mensajes.getString("txtSalario"));
        btnBuscarCompositor.setText(mensajes.getString("txtBuscar"));
        jLabel2.setText(mensajes.getString(("txtInstruccionEliminarCancion2")));
        lblNombreCrearPersona7.setText(mensajes.getString("txtCódigo"));
        lblNombreCrearPersona9.setText(mensajes.getString("txtTítulo"));
        lblAñoDeLanzamientoIngresarDisco.setText(mensajes.getString("txtLetra"));
        lblNombreCrearPersona8.setText(mensajes.getString("txtDuraciónEnMinutos"));
        btnBuscarCancion.setText(mensajes.getString("txtEliminar"));
        btnCancelarBuscarCancion.setText(mensajes.getString("txtCancelar"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnCancelarBuscarCancion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblNombreCrearPersona7 = new javax.swing.JLabel();
        lblNombreCrearPersona8 = new javax.swing.JLabel();
        lblAñoDeLanzamientoIngresarDisco = new javax.swing.JLabel();
        txtTiempoCancion = new javax.swing.JTextField();
        txtLetraCancion = new javax.swing.JTextField();
        txtCodigoCancion = new javax.swing.JTextField();
        btnAceptarEliminarCancion = new javax.swing.JButton();
        lblicono1 = new javax.swing.JLabel();
        lblcantantaFondo1 = new javax.swing.JLabel();
        lblNombreCrearPersona9 = new javax.swing.JLabel();
        txtTituloCancion = new javax.swing.JTextField();
        btnBuscarCancion = new javax.swing.JButton();
        panelCantante1 = new javax.swing.JPanel();
        lblFechaNacimientoCrearPersona1 = new javax.swing.JLabel();
        lblNumGirasBuscarCantante1 = new javax.swing.JLabel();
        txtCodigoCompositor = new javax.swing.JTextField();
        txtNombreCompositor = new javax.swing.JTextField();
        lblCantante2 = new javax.swing.JLabel();
        lblNombreCrearPersona4 = new javax.swing.JLabel();
        lblNombreCrearPersona5 = new javax.swing.JLabel();
        lblNombreCrearPersona6 = new javax.swing.JLabel();
        lblNacionalidadBuscarCantante1 = new javax.swing.JLabel();
        txtApellidoCompositor = new javax.swing.JTextField();
        txtEdadCompositor = new javax.swing.JTextField();
        txtNacionalidadCompositor = new javax.swing.JTextField();
        txtNumComposicionesCompositor = new javax.swing.JTextField();
        lblSalarioBuscarCantante1 = new javax.swing.JLabel();
        txtSalarioCompositor = new javax.swing.JTextField();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarCompositor = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelarBuscarCancion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCancelarBuscarCancion.setText("Cancelar");
        btnCancelarBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBuscarCancionActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelarBuscarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 104, 32));

        jLabel2.setFont(new java.awt.Font("Hoefler Text", 1, 24)); // NOI18N
        jLabel2.setText("Ingresar el codigo de la cancion a eliminar :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 920, 30));

        lblNombreCrearPersona7.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNombreCrearPersona7.setText("Codigo:");
        jPanel4.add(lblNombreCrearPersona7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 30));

        lblNombreCrearPersona8.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        lblNombreCrearPersona8.setText("Tiempo en minutos:");
        jPanel4.add(lblNombreCrearPersona8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, 30));

        lblAñoDeLanzamientoIngresarDisco.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        lblAñoDeLanzamientoIngresarDisco.setText("Letra:");
        jPanel4.add(lblAñoDeLanzamientoIngresarDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 30));

        txtTiempoCancion.setToolTipText("Ingrese el tiempo en minutos de la cancion");
        txtTiempoCancion.setEnabled(false);
        txtTiempoCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoCancionActionPerformed(evt);
            }
        });
        jPanel4.add(txtTiempoCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 250, 30));

        txtLetraCancion.setToolTipText("Ingrese la letra de la cancion");
        txtLetraCancion.setEnabled(false);
        txtLetraCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLetraCancionActionPerformed(evt);
            }
        });
        jPanel4.add(txtLetraCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 250, 30));

        txtCodigoCancion.setToolTipText("Ingrese el codigo del Cancion");
        txtCodigoCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCancionActionPerformed(evt);
            }
        });
        jPanel4.add(txtCodigoCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 250, 30));

        btnAceptarEliminarCancion.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAceptarEliminarCancion.setText("Eliminar");
        btnAceptarEliminarCancion.setEnabled(false);
        btnAceptarEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEliminarCancionActionPerformed(evt);
            }
        });
        jPanel4.add(btnAceptarEliminarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 100, 30));

        lblicono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/disco.png"))); // NOI18N
        jPanel4.add(lblicono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 330, 340));

        lblcantantaFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpeg"))); // NOI18N
        jPanel4.add(lblcantantaFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 350, 340));

        lblNombreCrearPersona9.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        lblNombreCrearPersona9.setText("Titulo:");
        jPanel4.add(lblNombreCrearPersona9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 30));

        txtTituloCancion.setToolTipText("Ingrese el titulo de la cancion");
        txtTituloCancion.setEnabled(false);
        txtTituloCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloCancionActionPerformed(evt);
            }
        });
        jPanel4.add(txtTituloCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 250, 30));

        btnBuscarCancion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBuscarCancion.setText("Buscar");
        btnBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCancionActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 106, 32));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 340));

        panelCantante1.setBackground(new java.awt.Color(255, 255, 255));
        panelCantante1.setToolTipText("Crear Nueva Persona");
        panelCantante1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaNacimientoCrearPersona1.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        lblFechaNacimientoCrearPersona1.setText("Apellido:");
        panelCantante1.add(lblFechaNacimientoCrearPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 30));

        lblNumGirasBuscarCantante1.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNumGirasBuscarCantante1.setText("Num. Composiciones:");
        panelCantante1.add(lblNumGirasBuscarCantante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 220, 30));

        txtCodigoCompositor.setToolTipText("Ingrese el codigo del compositor");
        txtCodigoCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCompositorActionPerformed(evt);
            }
        });
        panelCantante1.add(txtCodigoCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 220, 30));

        txtNombreCompositor.setToolTipText("Ingrese el nombre del cantante");
        txtNombreCompositor.setEnabled(false);
        txtNombreCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCompositorActionPerformed(evt);
            }
        });
        panelCantante1.add(txtNombreCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 220, 30));

        lblCantante2.setFont(new java.awt.Font("AkayaTelivigala", 1, 36)); // NOI18N
        lblCantante2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/My project-1-3.png"))); // NOI18N
        lblCantante2.setText("UPS Musik");
        lblCantante2.setPreferredSize(new java.awt.Dimension(200, 400));
        panelCantante1.add(lblCantante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 330, 50));

        lblNombreCrearPersona4.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        lblNombreCrearPersona4.setText("Nombre:");
        panelCantante1.add(lblNombreCrearPersona4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 30));

        lblNombreCrearPersona5.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNombreCrearPersona5.setText("Codigo:");
        panelCantante1.add(lblNombreCrearPersona5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 30));

        lblNombreCrearPersona6.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNombreCrearPersona6.setText("Edad:");
        panelCantante1.add(lblNombreCrearPersona6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 78, 30));

        lblNacionalidadBuscarCantante1.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNacionalidadBuscarCantante1.setText("Nacionalidad:");
        panelCantante1.add(lblNacionalidadBuscarCantante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 30));

        txtApellidoCompositor.setToolTipText("Ingrese el apellido del cantante");
        txtApellidoCompositor.setEnabled(false);
        txtApellidoCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoCompositorActionPerformed(evt);
            }
        });
        panelCantante1.add(txtApellidoCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 220, 30));

        txtEdadCompositor.setToolTipText("Ingrese le edad del cantante");
        txtEdadCompositor.setEnabled(false);
        txtEdadCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadCompositorActionPerformed(evt);
            }
        });
        panelCantante1.add(txtEdadCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 220, 30));

        txtNacionalidadCompositor.setToolTipText("Ingrese la nacionalidad del cantante");
        txtNacionalidadCompositor.setEnabled(false);
        txtNacionalidadCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadCompositorActionPerformed(evt);
            }
        });
        panelCantante1.add(txtNacionalidadCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 220, 30));

        txtNumComposicionesCompositor.setToolTipText("Ingrese el genero musical del cantante");
        txtNumComposicionesCompositor.setEnabled(false);
        txtNumComposicionesCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumComposicionesCompositorActionPerformed(evt);
            }
        });
        panelCantante1.add(txtNumComposicionesCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 220, 30));

        lblSalarioBuscarCantante1.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblSalarioBuscarCantante1.setText("Salario:");
        panelCantante1.add(lblSalarioBuscarCantante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 120, 30));

        txtSalarioCompositor.setToolTipText("Ingrese el nombre de la nueva persona");
        txtSalarioCompositor.setEnabled(false);
        txtSalarioCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioCompositorActionPerformed(evt);
            }
        });
        panelCantante1.add(txtSalarioCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 220, 30));

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCantante1.add(jInternalFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Hoefler Text", 1, 24)); // NOI18N
        jLabel3.setText("Ingrese el codigo del compositor, del cual se va a eliminar una cancion:");
        panelCantante1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 920, 40));

        btnBuscarCompositor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBuscarCompositor.setText("Buscar");
        btnBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCompositorActionPerformed(evt);
            }
        });
        panelCantante1.add(btnBuscarCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 106, 32));

        getContentPane().add(panelCantante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 314));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        this.limpiarCamposCancion();
        this.limpiarCamposCompositor();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnCancelarBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBuscarCancionActionPerformed
        this.setVisible(false);
        this.limpiarCamposCancion();
    }//GEN-LAST:event_btnCancelarBuscarCancionActionPerformed

    private void txtTiempoCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoCancionActionPerformed

    private void txtLetraCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLetraCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLetraCancionActionPerformed

    private void txtCodigoCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCancionActionPerformed

    private void btnAceptarEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEliminarCancionActionPerformed
        String codigoCompositor = txtCodigoCompositor.getText();
        String codigoCancion = txtCodigoCancion.getText();
        int codiguito = Integer.parseInt(codigoCompositor);
        int codigoCan = Integer.parseInt(codigoCancion);
        Compositor compositorSeleccionado = controladorCompositor.buscarCompositor(codiguito);
        Cancion cancion = controladorCompositor.buscarCancion(compositorSeleccionado,codigoCan);
        
        //Confirmación de si quiere eliminar
        if (controladorCompositor.eliminarCancion(compositorSeleccionado, cancion)) {
            JOptionPane.showMessageDialog(this, "La cancion se ha sido eliminado exitosamente! :)");
            this.limpiarCamposCompositor();
            this.limpiarCamposCancion();
            this.cambiarEstadoCampos(false);
            this.txtCodigoCancion.setEnabled(true);
            this.txtCodigoCompositor.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "La cancion no ha sido eliminado! :(");
        }
    }//GEN-LAST:event_btnAceptarEliminarCancionActionPerformed

    private void txtTituloCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloCancionActionPerformed

    private void txtCodigoCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCompositorActionPerformed

    private void txtNombreCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCompositorActionPerformed

    private void btnBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCancionActionPerformed
        String codigoCancion = txtCodigoCancion.getText();
        if (codigoCancion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El codigo de la cancion a eliminar no ha sido ingresado");

        } else {
            String codigoCompositor = txtCodigoCompositor.getText();
            int codiguito = Integer.parseInt(codigoCompositor);
            int codigoCan = Integer.parseInt(codigoCancion);
            Compositor compositorSeleccionado = controladorCompositor.buscarCompositor(codiguito);
            Cancion cancion = controladorCompositor.buscarCancion(compositorSeleccionado,codigoCan);
            if (cancion != null) {
                cambiarEstadoCampos(true);
                txtCodigoCancion.setEnabled(false);
                txtTituloCancion.setText(cancion.getTitulo());
                txtLetraCancion.setText(cancion.getLetra());
                String tiempo = String.valueOf(cancion.getTiempoEnMinutos());
                txtTiempoCancion.setText(tiempo);
                JOptionPane.showMessageDialog(this, "La cancion con codigo " + codiguito + " ha sido encontrada !:(");
                btnAceptarEliminarCancion.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "La cancion con codigo " + codiguito + " no ha sido encontrada !:(");

                this.limpiarCamposCancion();
            }

        }
    }//GEN-LAST:event_btnBuscarCancionActionPerformed

    private void txtApellidoCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCompositorActionPerformed

    private void txtEdadCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadCompositorActionPerformed

    private void txtNacionalidadCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadCompositorActionPerformed

    private void txtNumComposicionesCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumComposicionesCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumComposicionesCompositorActionPerformed

    private void txtSalarioCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioCompositorActionPerformed

    private void btnBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCompositorActionPerformed
        if (!camposObligatoriosConDatos()) {
            JOptionPane.showMessageDialog(this, "El codigo del compositor a buscar no ha sido ingresado!");
        } else {
            String codigo = txtCodigoCompositor.getText();

            int codiguito = Integer.parseInt(codigo);

            Compositor compositorSeleccionado = controladorCompositor.buscarCompositor(codiguito);
            if (compositorSeleccionado != null) {
                cambiarEstadoCampos(true);
                txtCodigoCompositor.setEnabled(false);
                txtNombreCompositor.setText(compositorSeleccionado.getNombre());
                txtApellidoCompositor.setText(compositorSeleccionado.getApellido());
                String edad = String.valueOf(compositorSeleccionado.getEdad());
                txtEdadCompositor.setText(edad);
                String numComposiones = String.valueOf(compositorSeleccionado.getNumeroDeComposiciones());
                txtNumComposicionesCompositor.setText(numComposiones);
                String salarioCom = String.valueOf(compositorSeleccionado.getSalario());
                txtSalarioCompositor.setText(salarioCom);
                JOptionPane.showMessageDialog(this, "El/La compositor con codigo " + codiguito + " ha sido encontrado !:(");
                btnBuscarCancion.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "El/La compositor con codigo " + codiguito + " no ha sido encontrada !:(");

                this.limpiarCamposCompositor();
            }
        }
    }//GEN-LAST:event_btnBuscarCompositorActionPerformed
    private void limpiarCamposCompositor() {
        this.txtCodigoCompositor.setText("");
        this.txtNombreCompositor.setText("");
        this.txtApellidoCompositor.setText("");
        this.txtEdadCompositor.setText("");
        this.txtNacionalidadCompositor.setText("");
        this.txtNumComposicionesCompositor.setText("");
        this.txtSalarioCompositor.setText("");

    }
    private void limpiarCamposCancion() {
        this.txtCodigoCancion.setText("");
        this.txtTituloCancion.setText("");
        this.txtLetraCancion.setText("");
        this.txtTiempoCancion.setText("");

    }
    private boolean camposObligatoriosConDatos() {
        if (!this.txtCodigoCancion.getText().isEmpty() && this.txtCodigoCompositor.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    private void cambiarEstadoCampos(boolean estado) {
        txtCodigoCancion.setEnabled(!estado);
        txtCodigoCompositor.setEnabled(!estado);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarEliminarCancion;
    private javax.swing.JButton btnBuscarCancion;
    private javax.swing.JButton btnBuscarCompositor;
    private javax.swing.JButton btnCancelarBuscarCancion;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAñoDeLanzamientoIngresarDisco;
    private javax.swing.JLabel lblCantante2;
    private javax.swing.JLabel lblFechaNacimientoCrearPersona1;
    private javax.swing.JLabel lblNacionalidadBuscarCantante1;
    private javax.swing.JLabel lblNombreCrearPersona4;
    private javax.swing.JLabel lblNombreCrearPersona5;
    private javax.swing.JLabel lblNombreCrearPersona6;
    private javax.swing.JLabel lblNombreCrearPersona7;
    private javax.swing.JLabel lblNombreCrearPersona8;
    private javax.swing.JLabel lblNombreCrearPersona9;
    private javax.swing.JLabel lblNumGirasBuscarCantante1;
    private javax.swing.JLabel lblSalarioBuscarCantante1;
    private javax.swing.JLabel lblcantantaFondo1;
    private javax.swing.JLabel lblicono1;
    private javax.swing.JPanel panelCantante1;
    private javax.swing.JTextField txtApellidoCompositor;
    private javax.swing.JTextField txtCodigoCancion;
    private javax.swing.JTextField txtCodigoCompositor;
    private javax.swing.JTextField txtEdadCompositor;
    private javax.swing.JTextField txtLetraCancion;
    private javax.swing.JTextField txtNacionalidadCompositor;
    private javax.swing.JTextField txtNombreCompositor;
    private javax.swing.JTextField txtNumComposicionesCompositor;
    private javax.swing.JTextField txtSalarioCompositor;
    private javax.swing.JTextField txtTiempoCancion;
    private javax.swing.JTextField txtTituloCancion;
    // End of variables declaration//GEN-END:variables
}
