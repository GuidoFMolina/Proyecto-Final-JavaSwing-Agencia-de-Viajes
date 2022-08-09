/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ControlModelo;
import modelo.Paquete;
import modelo.Servicio;
import modelo.Usuario;
import modelo.Venta;

/**
 *
 * @author elgor
 */
public class NewVenta extends javax.swing.JFrame {

    //variable para la persistencia del id del usuario en sesion
    long id_usuario;
    //instancia de control para respetar las capas
    ControlModelo control;
    //modelo default para la tabla de clientes
    DefaultTableModel modelo;
    //modelo default de lista para la lista de servicios
    DefaultListModel mlista = new DefaultListModel();
    //collection donde se guardara los string para luego mostrar en la lista de servicios
    ArrayList lista = new ArrayList();

    //Constructor
    public NewVenta() {
        initComponents();
        //Inicializo un nuevo modelo de control
        control = new ControlModelo();
        //inicializo una nueva tabla modelo
        modelo = new DefaultTableModel();
        //a lista de mi interfaz le doy el modelo default 
       
    }

    //get y sets de id usuario.
    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    //metodo listar clientes
    public void listar() {
        //Inicializo un vector de objetos para mostrar los atributos de cada cliente
        Object[] ob = new Object[4];
        //A la tabla modelo por default le doy el valor de la tabla cliente creada en mi intefaz
        modelo = (DefaultTableModel) tablaCliente.getModel();
        //Mediante un for recorro el array, pasando como longitud la cantidad de clientes que tengo en mi base de datos
        for (long i = 1; i <= control.recuentoCliente(); i++) {
              //En cada lugar de mi array voy a ingresar el valor de los siguientes atributos del cliente
              //de mi base de datos.
            ob[0] = control.buscarCliente(i).getId();
            ob[1] = control.buscarCliente(i).getDni_cliente();
            ob[2] = control.buscarCliente(i).getNombre_cliente();
            ob[3] = control.buscarCliente(i).getApellido_cliente();
            //A la tabla modelo le voy a agregar una fila por cada objeto
            modelo.addRow(ob);

        }
       //Una vez finalizada la carga de mi tabla modelo, voy a setear a mi tabla de interfaz el modelo cargado con valores
        tablaCliente.setModel(modelo);
    }

    //Metodo limpiar tabla
    public void limpiar() {
        //Inicio un bucle for pasando como longitud el conteo de la cantidad de filas en mi tabla
        //Esta misma irá borrando de a uno los clientes
        for (int i = 0; i < tablaCliente.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupMedioPago = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        btnVolver = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnVisa = new javax.swing.JRadioButton();
        btnMaster = new javax.swing.JRadioButton();
        btnEfectivo = new javax.swing.JRadioButton();
        btnAmerican = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        btnIngresarPanel = new javax.swing.JPanel();
        btnIngresarVenta = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        cmbPaquete = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setName("contenedor"); // NOI18N

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AGENCIA-CUBO.png"))); // NOI18N
        logo.setName("logo"); // NOI18N

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nueva venta  - banner.png"))); // NOI18N
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
        jLabel4.setText("Nueva Venta:");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Medio de pago:");

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("dd/mm/aaaa");
        txtFecha.setBorder(null);
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Fecha de compra:");

        btnVisa.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupMedioPago.add(btnVisa);
        btnVisa.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnVisa.setForeground(new java.awt.Color(153, 153, 255));
        btnVisa.setSelected(true);
        btnVisa.setText("VISA");
        btnVisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnVisaItemStateChanged(evt);
            }
        });

        btnMaster.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupMedioPago.add(btnMaster);
        btnMaster.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnMaster.setForeground(new java.awt.Color(153, 153, 255));
        btnMaster.setText("MASTERCARD");
        btnMaster.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterActionPerformed(evt);
            }
        });

        btnEfectivo.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupMedioPago.add(btnEfectivo);
        btnEfectivo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEfectivo.setForeground(new java.awt.Color(153, 153, 255));
        btnEfectivo.setText("EFECTIVO");
        btnEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAmerican.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupMedioPago.add(btnAmerican);
        btnAmerican.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAmerican.setForeground(new java.awt.Color(153, 153, 255));
        btnAmerican.setText("AMERICAN EXPRESS");
        btnAmerican.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Seleccionar Cliente:");

        tablaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "DNI", "Nombre ", "Apellido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaCliente.setGridColor(new java.awt.Color(204, 204, 255));
        tablaCliente.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaCliente.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tablaCliente);
        if (tablaCliente.getColumnModel().getColumnCount() > 0) {
            tablaCliente.getColumnModel().getColumn(0).setResizable(false);
            tablaCliente.getColumnModel().getColumn(1).setResizable(false);
            tablaCliente.getColumnModel().getColumn(2).setResizable(false);
            tablaCliente.getColumnModel().getColumn(3).setResizable(false);
        }

        jSeparator2.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 255));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setText("Seleccione el paquete:");

        btnIngresarPanel.setBackground(new java.awt.Color(153, 153, 255));

        btnIngresarVenta.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnIngresarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIngresarVenta.setText("INGRESAR");
        btnIngresarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarVentaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnIngresarPanelLayout = new javax.swing.GroupLayout(btnIngresarPanel);
        btnIngresarPanel.setLayout(btnIngresarPanelLayout);
        btnIngresarPanelLayout.setHorizontalGroup(
            btnIngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIngresarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        btnIngresarPanelLayout.setVerticalGroup(
            btnIngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIngresarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        cmbPaquete.setBackground(new java.awt.Color(255, 255, 255));
        cmbPaquete.setForeground(new java.awt.Color(153, 153, 255));
        cmbPaquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbPaquete.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                cmbPaqueteComponentAdded(evt);
            }
        });
        cmbPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbPaqueteMouseClicked(evt);
            }
        });
        cmbPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaqueteActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visa.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/american.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/master.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cash_icon_147027.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(btnActualizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cmbPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(218, 218, 218)
                        .addComponent(btnIngresarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(logo)
                                .addGap(35, 35, 35)
                                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel7))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btnMaster))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btnVisa))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btnAmerican))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnVolver)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(10, 10, 10)
                                                .addComponent(btnEfectivo)))))))))
                .addGap(20, 20, 20))
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
                    .addComponent(btnVolver))
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVisa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEfectivo))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAmerican))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaster)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))))
                .addGap(10, 10, 10)
                .addComponent(btnActualizar)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cmbPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnIngresarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnVisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnVisaItemStateChanged

    }//GEN-LAST:event_btnVisaItemStateChanged
   //Boton para actualizar la lista de clientes
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

    private void btnIngresarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarVentaMouseEntered
        btnIngresarVenta.setForeground(Color.black);
    }//GEN-LAST:event_btnIngresarVentaMouseEntered

    private void btnIngresarVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarVentaMouseExited
        btnIngresarVenta.setForeground(Color.white);
    }//GEN-LAST:event_btnIngresarVentaMouseExited

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        txtFecha.setText("");
        txtFecha.setForeground(Color.black);
    }//GEN-LAST:event_txtFechaMouseClicked
    //Listar en el combobox los paquetes
    private void cmbPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPaqueteMouseClicked
       //Aplico el borrado de todos los items asi no se repiten
        cmbPaquete.removeAllItems();
        
        long i = 1;
        //Mediante un bucle while añado a los items los nombres de los paquetes.
        //Como condicion le doy la cantidad de paquetes que hay en la base de datos
        while (i <= control.recuentoPaquete()) {
            cmbPaquete.addItem(control.buscarPaquete(i).getNombre_paqute());
            i++;
        }

    }//GEN-LAST:event_cmbPaqueteMouseClicked
//Volver al inicio
    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        //inicializo la interfaz inicio dandole como valor al id de usuario el mismo que se encuentra en sesion
        Inicio inicio = new Inicio();
        inicio.setId_usuario(this.id_usuario);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void cmbPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaqueteActionPerformed

    }//GEN-LAST:event_cmbPaqueteActionPerformed

    private void cmbPaqueteComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cmbPaqueteComponentAdded

    }//GEN-LAST:event_cmbPaqueteComponentAdded

    private void btnIngresarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarVentaMouseClicked
        //Inicializo un objeto cliente con los datos del cliente seleccionado por el usuario.
                          //llamo a la controladora y paso el valor desde la tabla al modelo de tabla        
        Cliente cliente = control.buscarCliente((long) modelo.getValueAt(tablaCliente.getSelectedRow(), 0));
        
        //Inicializo un ojeto usuario pasando como indice el id del usuario que esta en sesión
        Usuario usuario = control.buscarUsuario(this.id_usuario);
        //Inicializo un objeto paquete pasandole el indice seleccionado +1(porque es un vector iniciado en 0)
        Paquete paquete = control.buscarPaquete(cmbPaquete.getSelectedIndex()+1);
        //Inicializo dos servicios que son los que tiene cada paquete, dependiendo del indice selecionado
        //en Paquete estos cambiaran con sus respectivos datos.
        Servicio servicio1 = null;
        Servicio servicio2 = null;
        if (cmbPaquete.getSelectedItem().equals(control.buscarPaquete(1).getNombre_paqute())) {
             //Guardo en una variable de tipo String el los nombres de los servicios traidos de la base de datos 
            servicio1 = control.buscarServicio(1);
            servicio2 = control.buscarServicio(2);
            
        }
        //paquete 2
            //Comparo el item seleccionado con el nombre del paquete 2
        if (cmbPaquete.getSelectedItem().equals(control.buscarPaquete(2).getNombre_paqute())) {
             //Guardo en una variable de tipo String el los nombres de los servicios traidos de la base de datos 
            servicio1 = control.buscarServicio(3);
            servicio2 = control.buscarServicio(4);
            
            }
        //Inicializo un objeto venta
        Venta venta = new Venta();
        venta.setId((long)control.listarVenta().size()+1);
        //Mediante un set le doy valores a sus atributos
        venta.setFecha_venta(txtFecha.getText());
       //Segun las opciones del medio de pago se da el valor al string de forma de pago
        if(btnVisa.isSelected()){
            venta.setMedio_pago(btnVisa.getText());
        }
         if(btnEfectivo.isSelected()){
            venta.setMedio_pago(btnEfectivo.getText());
        }
          if(btnAmerican.isSelected()){
            venta.setMedio_pago(btnAmerican.getText());
        }
           if(btnMaster.isSelected()){
            venta.setMedio_pago(btnMaster.getText());
        }
        
        //Al cliente, usuario, paquetes y servicios adhiero una nueva venta.
        cliente.getListaVenta().add(venta);
        usuario.getListaVenta().add(venta);
        paquete.getListaVenta().add(venta);
        servicio1.getListaVenta().add(venta);
        servicio2.getListaVenta().add(venta);
       try{
           //Mediante una modificacion doy el alta a la venta.
       control.modCompleta(usuario, cliente, venta, servicio1, servicio2, paquete);
       JOptionPane.showMessageDialog(null, "¡La venta fue concretada con exito!");
       
       }catch(HeadlessException e){
               JOptionPane.showMessageDialog(null, e);
               }
    }//GEN-LAST:event_btnIngresarVentaMouseClicked

    private void btnMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JRadioButton btnAmerican;
    private javax.swing.JRadioButton btnEfectivo;
    private javax.swing.ButtonGroup btnGroupMedioPago;
    private javax.swing.JPanel btnIngresarPanel;
    private javax.swing.JLabel btnIngresarVenta;
    private javax.swing.JRadioButton btnMaster;
    private javax.swing.JRadioButton btnVisa;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JComboBox<String> cmbPaquete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    public javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
