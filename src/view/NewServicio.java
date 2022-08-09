/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ControlModelo;
import modelo.Paquete;
import modelo.Servicio;

/**
 *
 * @author elgor
 */
public class NewServicio extends javax.swing.JFrame {

    //variable para la persistencia del id del usuario en sesion
    long id_usuario;
    //instancia de control para respetar las capas
    ControlModelo control;
    //modelo default para la tabla de clientes
    DefaultTableModel modelo;
   

    //Constructor
    public NewServicio() {
        initComponents();
        //Inicializo un nuevo modelo de control
        control = new ControlModelo();
        //inicializo una nueva tabla modelo
        modelo = new DefaultTableModel();
       
    }

    //get y sets de id usuario.
    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    //metodo listar paquetes
    public void listar() {
        //Inicializo un vector de objetos para mostrar los atributos de cada paquete
        Object[] ob = new Object[3];
        //A la tabla modelo por default le doy el valor de la tabla paquetes creada en mi intefaz
        modelo = (DefaultTableModel) tablaServicios.getModel();
        //Mediante un for recorro el array, pasando como longitud la cantidad de paquetes que tengo en mi base de datos
        for (long i = 1; i <= control.recuentoPaquete(); i++) {
            //En cada lugar de mi array voy a ingresar el valor de los siguientes atributos del paquete
            //de mi base de datos.
            ob[0] = control.buscarPaquete(i).getId();
            ob[1] = control.buscarPaquete(i).getNombre_paqute();
            ob[2] = control.buscarPaquete(i).getCosto_paquete();
            
            //A la tabla modelo le voy a agregar una fila por cada objeto
            modelo.addRow(ob);

        }
        //Una vez finalizada la carga de mi tabla modelo, voy a setear a mi tabla de interfaz el modelo cargado con valores
        tablaServicios.setModel(modelo);
    }

    //Metodo limpiar tabla
    public void limpiar() {
        //Inicio un bucle for pasando como longitud el conteo de la cantidad de filas en mi tabla
        //Esta misma irá borrando de a uno los paquetes
        for (int i = 0; i < tablaServicios.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        btnVolver = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreServicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresarPanel = new javax.swing.JPanel();
        btnIngresarServicio = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtCosto = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(820, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setName("contenedor"); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(820, 500));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AGENCIA-CUBO.png"))); // NOI18N
        logo.setName("logo"); // NOI18N

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo servicio - banner.png"))); // NOI18N
        banner.setName("banner venta"); // NOI18N

        btnVolver.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(153, 153, 255));
        btnVolver.setText("[VOLVER AL INICIO]");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Nuevo Servicio:");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Costo:");

        txtNombreServicio.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreServicio.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreServicio.setText("Ej: Pasaje Ida - Vuelta");
        txtNombreServicio.setBorder(null);
        txtNombreServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreServicioMouseClicked(evt);
            }
        });
        txtNombreServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreServicioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Nombre del Servicio:");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Seleccionar Paquete:");

        tablaServicios.setBackground(new java.awt.Color(255, 255, 255));
        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Paquete", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaServicios.setGridColor(new java.awt.Color(204, 204, 255));
        tablaServicios.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaServicios.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tablaServicios);
        if (tablaServicios.getColumnModel().getColumnCount() > 0) {
            tablaServicios.getColumnModel().getColumn(0).setResizable(false);
            tablaServicios.getColumnModel().getColumn(1).setResizable(false);
            tablaServicios.getColumnModel().getColumn(2).setResizable(false);
        }

        jSeparator2.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 255));

        btnIngresarPanel.setBackground(new java.awt.Color(153, 153, 255));

        btnIngresarServicio.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnIngresarServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIngresarServicio.setText("INGRESAR");
        btnIngresarServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarServicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarServicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarServicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnIngresarPanelLayout = new javax.swing.GroupLayout(btnIngresarPanel);
        btnIngresarPanel.setLayout(btnIngresarPanelLayout);
        btnIngresarPanelLayout.setHorizontalGroup(
            btnIngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIngresarServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        btnIngresarPanelLayout.setVerticalGroup(
            btnIngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIngresarServicio, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        txtCosto.setBackground(new java.awt.Color(255, 255, 255));
        txtCosto.setText("Ej: 100000");
        txtCosto.setBorder(null);
        txtCosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCostoMouseClicked(evt);
            }
        });
        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });

        txtDestino.setBackground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("Ej: España");
        txtDestino.setBorder(null);
        txtDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDestinoMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 255));
        jLabel9.setText("Destino:");

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 255));
        jLabel10.setText("Fecha:");

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("dd/mm/aaaa");
        txtFecha.setBorder(null);
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 255));

        jSeparator4.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator4.setForeground(new java.awt.Color(153, 153, 255));

        jSeparator5.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator5.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logo)
                        .addGap(35, 35, 35)
                        .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273)
                        .addComponent(btnVolver))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addGap(405, 405, 405)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(btnIngresarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnActualizar)
                .addGap(308, 308, 308))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(logo))
                    .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnVolver)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(btnIngresarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(btnActualizar))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //Boton para actualizar la lista de paquetes
    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        //Metodo para limpiar la lista asi no se repiten los valores
        limpiar();
        //Metodo listar
        listar();
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setForeground(Color.blue);
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setForeground(new Color(153, 153, 255));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnIngresarServicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarServicioMouseEntered
        btnIngresarServicio.setForeground(Color.black);
    }//GEN-LAST:event_btnIngresarServicioMouseEntered

    private void btnIngresarServicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarServicioMouseExited
        btnIngresarServicio.setForeground(Color.white);
    }//GEN-LAST:event_btnIngresarServicioMouseExited

    private void txtNombreServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreServicioMouseClicked
        txtNombreServicio.setText("");
        txtNombreServicio.setForeground(Color.black);
    }//GEN-LAST:event_txtNombreServicioMouseClicked

    //Volver al inicio
    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        //inicializo la interfaz inicio dandole como valor al id de usuario el mismo que se encuentra en sesion
        Inicio inicio = new Inicio();
        inicio.setId_usuario(this.id_usuario);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnIngresarServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarServicioMouseClicked
    Servicio servicio = new Servicio();
    Paquete paquete = control.buscarPaquete((long) modelo.getValueAt(tablaServicios.getSelectedRow(), 0));
    servicio.setId((long)control.listarServicio().size()+1);
    servicio.setNombre_servicio(txtNombreServicio.getText());
    servicio.setCosto_servicio(Double.parseDouble(txtCosto.getText()));
    servicio.setDestino_servicio(txtDestino.getText());
    servicio.setFecha_servicio(txtFecha.getText());
    servicio.getPaquetes().add(paquete);
    paquete.addServicios(servicio);
    
    try{
    control.modServicioPaquete(servicio, paquete);
    JOptionPane.showMessageDialog(null, "El servicio ha sido de alta correctamente.");
    }catch(HeadlessException e){
        JOptionPane.showMessageDialog(null, "Ocurrio un error."+ e);
    }
    }//GEN-LAST:event_btnIngresarServicioMouseClicked

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void txtNombreServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreServicioActionPerformed

    private void txtCostoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCostoMouseClicked
        txtCosto.setText("");
        txtCosto.setForeground(Color.black);
    }//GEN-LAST:event_txtCostoMouseClicked

    private void txtDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDestinoMouseClicked
        txtDestino.setText("");
        txtDestino.setForeground(Color.black);
    }//GEN-LAST:event_txtDestinoMouseClicked

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        txtFecha.setText("");
        txtFecha.setForeground(Color.black);
    }//GEN-LAST:event_txtFechaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JPanel btnIngresarPanel;
    private javax.swing.JLabel btnIngresarServicio;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logo;
    public javax.swing.JTable tablaServicios;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombreServicio;
    // End of variables declaration//GEN-END:variables
}
