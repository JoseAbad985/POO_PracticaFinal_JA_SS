package ec.edu.ups.practica_05_ssuquilanda_jabad.vista.cantante;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

import ec.edu.ups.practica_05_ssuquilanda_jabad.controlador.ControladorCantante;
import ec.edu.ups.practica_05_ssuquilanda_jabad.modelo.Cantante;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class VentanaActualizarCantante extends javax.swing.JInternalFrame {

    private ControladorCantante controladorCantante;
    private ResourceBundle mensajes;
    /**
     * Creates new form VentanaCrearPersona
     */
    public VentanaActualizarCantante(ControladorCantante controladorCantante) {

        initComponents();
        this.controladorCantante = controladorCantante;
    }
    
    
    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jLabel1.setText(mensajes.getString("txtActualizarCantante"));
        lblCodigoCantante.setText(mensajes.getString("txtCódigo"));
        lblNombreCantante.setText(mensajes.getString("txtNombre"));        
        lblApellidoCantante.setText(mensajes.getString("txtApellido"));        
        lblEdadCantante.setText(mensajes.getString("txtEdad"));        
        lblNacionalidadCantante.setText(mensajes.getString("txtNacionalidad"));   
        cbxPaisesActualizarCantante.setSelectedItem(mensajes.getString("txtSeleccionarPaís"));
        cbxGeneroMusicalCantante.setSelectedItem(mensajes.getString("txtSeleccionarGénero"));
        lblNombreArtCantante.setText(mensajes.getString("txtNombreArtístico"));        
        lblGeneroCantante.setText(mensajes.getString("txtGéneroMusical"));        
        lblNumSencillosCantante.setText(mensajes.getString("txtNúmeroDeSencillos"));        
        lblNumConciertosCantante.setText(mensajes.getString("txtNúmeroDeConciertos"));        
        lblNumGirasCantante.setText(mensajes.getString("txtNúmeroDeGiras"));        
        lblSalarioBaseCantante.setText(mensajes.getString("txtSalarioBase"));
        btnBuscarCantante.setText(mensajes.getString("txtBuscar"));
        btnCancelarCantante.setText(mensajes.getString("txtCancelar"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCantante = new javax.swing.JPanel();
        lblApellidoCantante = new javax.swing.JLabel();
        lblNumGirasCantante = new javax.swing.JLabel();
        txtCodigoCantante = new javax.swing.JTextField();
        lblcantantaFondo = new javax.swing.JLabel();
        txtNombreCantante = new javax.swing.JTextField();
        btnBuscarCantante = new javax.swing.JButton();
        btnCancelarCantante = new javax.swing.JButton();
        lblicono = new javax.swing.JLabel();
        lblCantante = new javax.swing.JLabel();
        lblNombreCantante = new javax.swing.JLabel();
        lblCodigoCantante = new javax.swing.JLabel();
        lblEdadCantante = new javax.swing.JLabel();
        lblNacionalidadCantante = new javax.swing.JLabel();
        lblNombreArtCantante = new javax.swing.JLabel();
        lblGeneroCantante = new javax.swing.JLabel();
        lblNumSencillosCantante = new javax.swing.JLabel();
        lblNumConciertosCantante = new javax.swing.JLabel();
        txtNomArtisticoCantante = new javax.swing.JTextField();
        txtApellidoCantante = new javax.swing.JTextField();
        txtEdadCantante = new javax.swing.JTextField();
        txtNumSencillosCantante = new javax.swing.JTextField();
        txtNumConciertosCantante = new javax.swing.JTextField();
        txtNumGirasCantante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblSalarioBaseCantante = new javax.swing.JLabel();
        txtSalarioCantante = new javax.swing.JTextField();
        cbxPaisesActualizarCantante = new javax.swing.JComboBox<>();
        btnActualizarCantante = new javax.swing.JButton();
        cbxGeneroMusicalCantante = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos Actualizar Cantante"));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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

        panelCantante.setBackground(new java.awt.Color(255, 255, 255));
        panelCantante.setToolTipText("");
        panelCantante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblApellidoCantante.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        lblApellidoCantante.setText("Apellido:");
        panelCantante.add(lblApellidoCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, 30));

        lblNumGirasCantante.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNumGirasCantante.setText("Num. Giras:");
        panelCantante.add(lblNumGirasCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 180, 30));

        txtCodigoCantante.setToolTipText("Ingrese el codigo del cantante");
        txtCodigoCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(txtCodigoCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 250, 30));

        lblcantantaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silue h.png"))); // NOI18N
        lblcantantaFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblcantantaFondo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelCantante.add(lblcantantaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 220, 360));

        txtNombreCantante.setToolTipText("Puede cambiar el Nombre");
        txtNombreCantante.setEnabled(false);
        txtNombreCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(txtNombreCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 250, 30));

        btnBuscarCantante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBuscarCantante.setText("Buscar");
        btnBuscarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(btnBuscarCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 106, 32));

        btnCancelarCantante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCancelarCantante.setText("Cancelar");
        btnCancelarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(btnCancelarCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 104, 32));

        lblicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpeg"))); // NOI18N
        panelCantante.add(lblicono, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 340, 670));

        lblCantante.setFont(new java.awt.Font("AkayaTelivigala", 1, 36)); // NOI18N
        lblCantante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/My project-1-3.png"))); // NOI18N
        lblCantante.setText("UPS Musik");
        lblCantante.setPreferredSize(new java.awt.Dimension(200, 400));
        panelCantante.add(lblCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 370, 50));

        lblNombreCantante.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        lblNombreCantante.setText("Nombre:");
        panelCantante.add(lblNombreCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 30));

        lblCodigoCantante.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblCodigoCantante.setText("Codigo:");
        panelCantante.add(lblCodigoCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 30));

        lblEdadCantante.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblEdadCantante.setText("Edad:");
        panelCantante.add(lblEdadCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 78, 30));

        lblNacionalidadCantante.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNacionalidadCantante.setText("Nacionalidad:");
        panelCantante.add(lblNacionalidadCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 150, 30));

        lblNombreArtCantante.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNombreArtCantante.setText("Nombre Artístico:");
        panelCantante.add(lblNombreArtCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 210, 30));

        lblGeneroCantante.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblGeneroCantante.setText("Género Musical:");
        panelCantante.add(lblGeneroCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, 30));

        lblNumSencillosCantante.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNumSencillosCantante.setText("Num. Sencillos:");
        panelCantante.add(lblNumSencillosCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 190, 30));

        lblNumConciertosCantante.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNumConciertosCantante.setText("Num. Conciertos:");
        panelCantante.add(lblNumConciertosCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 200, 30));

        txtNomArtisticoCantante.setToolTipText("Puede cambiar el nombre Artistico");
        txtNomArtisticoCantante.setEnabled(false);
        txtNomArtisticoCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomArtisticoCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(txtNomArtisticoCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 250, 30));

        txtApellidoCantante.setToolTipText("Puede cambiar el Apellido");
        txtApellidoCantante.setEnabled(false);
        txtApellidoCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(txtApellidoCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 250, 30));

        txtEdadCantante.setToolTipText("Puede cambiar la Edad");
        txtEdadCantante.setEnabled(false);
        txtEdadCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(txtEdadCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 250, 30));

        txtNumSencillosCantante.setToolTipText("Puede cambiar los sencillos");
        txtNumSencillosCantante.setEnabled(false);
        txtNumSencillosCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSencillosCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(txtNumSencillosCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 250, 30));

        txtNumConciertosCantante.setToolTipText("Puede cambiar el numero de Conciertos");
        txtNumConciertosCantante.setEnabled(false);
        txtNumConciertosCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumConciertosCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(txtNumConciertosCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 250, 30));

        txtNumGirasCantante.setToolTipText("Puede cambiar el número de giras");
        txtNumGirasCantante.setEnabled(false);
        txtNumGirasCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumGirasCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(txtNumGirasCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 250, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Actualizar Cantante:");
        panelCantante.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, 30));

        lblSalarioBaseCantante.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblSalarioBaseCantante.setText("Salario Base:");
        panelCantante.add(lblSalarioBaseCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 180, 30));

        txtSalarioCantante.setToolTipText("Puede cambiar el salario original");
        txtSalarioCantante.setEnabled(false);
        txtSalarioCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(txtSalarioCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 250, 30));

        cbxPaisesActualizarCantante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona un País--" }));
        cbxPaisesActualizarCantante.setToolTipText("Puede cambiar la nacionalidad");
        cbxPaisesActualizarCantante.setEnabled(false);
        cbxPaisesActualizarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPaisesActualizarCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(cbxPaisesActualizarCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 250, 30));

        btnActualizarCantante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnActualizarCantante.setText("Actualizar");
        btnActualizarCantante.setEnabled(false);
        btnActualizarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(btnActualizarCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 110, 32));

        cbxGeneroMusicalCantante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona un Género--" }));
        cbxGeneroMusicalCantante.setToolTipText("Puede cambiar el género musical");
        cbxGeneroMusicalCantante.setEnabled(false);
        cbxGeneroMusicalCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGeneroMusicalCantanteActionPerformed(evt);
            }
        });
        panelCantante.add(cbxGeneroMusicalCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCantante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCantante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCantanteActionPerformed
        if (!camposObligatoriosConDatos()) {
            JOptionPane.showMessageDialog(this, "El codigo de busqueda son obligatorios de llenar. ");
        } else {
            String codigo = txtCodigoCantante.getText();
            int codiguito = Integer.parseInt(codigo);
            Cantante cantante = controladorCantante.buscarCantante(codiguito);
            if(cantante != null){
            JOptionPane.showMessageDialog(this,"Se ha encontrado un cantante :D ");
            cambiarEstadoCampos(true);
            txtCodigoCantante.setEnabled(false);
            txtNombreCantante.setText(cantante.getNombre());
            txtApellidoCantante.setText(cantante.getApellido());
            txtEdadCantante.setText(String.valueOf(cantante.getEdad()));
            cbxPaisesActualizarCantante.setSelectedItem(cantante.getNacionalidad());
            txtNomArtisticoCantante.setText(cantante.getNombreArtistico());
            cbxGeneroMusicalCantante.setSelectedItem(cantante.getGeneroMusical());
            txtNumSencillosCantante.setText(String.valueOf(cantante.getNumeroDeSencillos()));
            txtNumConciertosCantante.setText(String.valueOf(cantante.getNumeroDeConciertos()));
            txtNumGirasCantante.setText(String.valueOf(cantante.getNumeroDeGiras()));
            txtSalarioCantante.setText(String.valueOf(cantante.getSalario()));
            btnActualizarCantante.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this,"No se ha encontrado el cantante :C ");
            }
        }

    }//GEN-LAST:event_btnBuscarCantanteActionPerformed
    private void limpiarCampos() {
        this.txtCodigoCantante.setText("");
        this.txtNombreCantante.setText("");
        this.txtApellidoCantante.setText("");
        this.txtEdadCantante.setText("");
        this.cbxPaisesActualizarCantante.setSelectedItem("--Selecciona un País--");
        this.cbxGeneroMusicalCantante.setSelectedItem("--Selecciona un Género--");
        this.txtNomArtisticoCantante.setText("");
        this.txtNumSencillosCantante.setText("");
        this.txtNumConciertosCantante.setText("");
        this.txtNumGirasCantante.setText("");
        this.txtSalarioCantante.setText("");

    }

    public void cambiarEstadoCampos(boolean estado) {
        txtNombreCantante.setEnabled(estado);
        txtApellidoCantante.setEnabled(estado);
        txtEdadCantante.setEnabled(estado);
        cbxPaisesActualizarCantante.setEnabled(estado);
        txtNomArtisticoCantante.setEnabled(estado);
        cbxGeneroMusicalCantante.setEnabled(estado);
        txtNumSencillosCantante.setEnabled(estado);
        txtNumConciertosCantante.setEnabled(estado);
        txtNumGirasCantante.setEnabled(estado);
        txtSalarioCantante.setEnabled(estado);

    }

    public List<String> generarPaises() {
        List<String> paises = new ArrayList<>();
        paises.add("Afganistán");
        paises.add("Alemania");
        paises.add("Arabia Saudita");
        paises.add("Argentina");
        paises.add("Australia");
        paises.add("Brasil");
        paises.add("Canadá");
        paises.add("China");
        paises.add("Colombia");
        paises.add("Corea del Sur");
        paises.add("Cuba");
        paises.add("Egipto");
        paises.add("España");
        paises.add("Estados Unidos");
        paises.add("Francia");
        paises.add("India");
        paises.add("Indonesia");
        paises.add("Italia");
        paises.add("Japón");
        paises.add("México");
        paises.add("Nigeria");
        paises.add("Pakistán");
        paises.add("Perú");
        paises.add("Reino Unido");
        paises.add("Rusia");
        paises.add("Sudáfrica");
        paises.add("Turquía");
        paises.add("Venezuela");
        return paises;
    }

    private void cargarDatosPaises() {
        DefaultComboBoxModel<String> modelo = (DefaultComboBoxModel) this.cbxPaisesActualizarCantante.getModel();
        List<String> paises = generarPaises();
        modelo.removeAllElements();
        for (String pais : paises) {
            modelo.addElement(pais);
        }
    }
    
    public List<String> generarGeneros() {
        List<String> generosMusicales = new ArrayList<>();
        generosMusicales.add("Pop");
        generosMusicales.add("Rock");
        generosMusicales.add("Hip Hop");
        generosMusicales.add("Electrónica");
        generosMusicales.add("R&B");
        generosMusicales.add("Reggae");
        generosMusicales.add("Country");
        generosMusicales.add("Jazz");
        generosMusicales.add("Clásica");
        generosMusicales.add("Metal");
        return generosMusicales;
    }
    private void cargarDatosGeneros(){
        DefaultComboBoxModel<String> modelo = (DefaultComboBoxModel) this.cbxGeneroMusicalCantante.getModel();
        List<String> generosMusicales = generarGeneros();
        modelo.removeAllElements();
        for (String genero : generosMusicales) {
            modelo.addElement(genero);
        }
    }
    private boolean camposObligatoriosConDatos() {
        if (!this.txtCodigoCantante.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    private void btnCancelarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCantanteActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarCantanteActionPerformed

    private void txtCodigoCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCantanteActionPerformed

    private void txtNombreCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCantanteActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        limpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtNomArtisticoCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomArtisticoCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomArtisticoCantanteActionPerformed

    private void txtApellidoCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCantanteActionPerformed

    private void txtEdadCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadCantanteActionPerformed

    private void txtNumSencillosCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSencillosCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumSencillosCantanteActionPerformed

    private void txtNumConciertosCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumConciertosCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumConciertosCantanteActionPerformed

    private void txtNumGirasCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumGirasCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumGirasCantanteActionPerformed

    private void txtSalarioCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioCantanteActionPerformed

    private void cbxPaisesActualizarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPaisesActualizarCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPaisesActualizarCantanteActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarDatosPaises();
        cargarDatosGeneros();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnActualizarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCantanteActionPerformed
           
        String codigo = txtCodigoCantante.getText();
        int codiguito = Integer.parseInt(codigo);
        String nombre = txtNombreCantante.getText();
        String apellido = txtApellidoCantante.getText();
        String edad = txtEdadCantante.getText();
        int edadcita = Integer.parseInt(edad);
        String nacionalidad = (String) cbxPaisesActualizarCantante.getSelectedItem();
        String nombreArtistico = txtNomArtisticoCantante.getText();
        String generoMusical = (String) cbxGeneroMusicalCantante.getSelectedItem();
        String numSencillos = txtNumSencillosCantante.getText();
        int sencillos = Integer.parseInt(numSencillos);
        String numConciertos = txtNumConciertosCantante.getText();
        int conciertos = Integer.parseInt(numConciertos);
        String numGiras = txtNumGirasCantante.getText();
        int giras = Integer.parseInt(numGiras);
        String salario = txtSalarioCantante.getText();
        double salarioCan = Double.parseDouble(salario);

        Cantante cantante = new Cantante();
        cantante.setCodigo(codiguito);
        cantante.setNombre(nombre);
        cantante.setApellido(apellido);
        cantante.setEdad(edadcita);
        cantante.setNacionalidad(nacionalidad);
        cantante.setNombreArtistico(nombreArtistico);
        cantante.setGeneroMusical(generoMusical);
        cantante.setNumeroDeSencillos(sencillos);
        cantante.setNumeroDeConciertos(conciertos);
        cantante.setNumeroDeGiras(giras);
        cantante.setSalario(salarioCan);

        if (controladorCantante.actualizarCantante(cantante)) {
            JOptionPane.showMessageDialog(this, "El cantante ha sido actualizado exitosamente! :)");
            this.limpiarCampos();
            this.cambiarEstadoCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "El cantante no ha sido actualizado! :(");
        }
    }//GEN-LAST:event_btnActualizarCantanteActionPerformed

    private void cbxGeneroMusicalCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGeneroMusicalCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxGeneroMusicalCantanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCantante;
    private javax.swing.JButton btnBuscarCantante;
    private javax.swing.JButton btnCancelarCantante;
    private javax.swing.JComboBox<String> cbxGeneroMusicalCantante;
    private javax.swing.JComboBox<String> cbxPaisesActualizarCantante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidoCantante;
    private javax.swing.JLabel lblCantante;
    private javax.swing.JLabel lblCodigoCantante;
    private javax.swing.JLabel lblEdadCantante;
    private javax.swing.JLabel lblGeneroCantante;
    private javax.swing.JLabel lblNacionalidadCantante;
    private javax.swing.JLabel lblNombreArtCantante;
    private javax.swing.JLabel lblNombreCantante;
    private javax.swing.JLabel lblNumConciertosCantante;
    private javax.swing.JLabel lblNumGirasCantante;
    private javax.swing.JLabel lblNumSencillosCantante;
    private javax.swing.JLabel lblSalarioBaseCantante;
    private javax.swing.JLabel lblcantantaFondo;
    private javax.swing.JLabel lblicono;
    private javax.swing.JPanel panelCantante;
    private javax.swing.JTextField txtApellidoCantante;
    private javax.swing.JTextField txtCodigoCantante;
    private javax.swing.JTextField txtEdadCantante;
    private javax.swing.JTextField txtNomArtisticoCantante;
    private javax.swing.JTextField txtNombreCantante;
    private javax.swing.JTextField txtNumConciertosCantante;
    private javax.swing.JTextField txtNumGirasCantante;
    private javax.swing.JTextField txtNumSencillosCantante;
    private javax.swing.JTextField txtSalarioCantante;
    // End of variables declaration//GEN-END:variables
}
