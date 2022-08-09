
package view;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ControlModelo;


public class Inicio extends javax.swing.JFrame {

    private long id_usuario;
    ControlModelo control;
    DefaultTableModel modelo, modClientes, modServicios, modPaquetes,modEmpleados;
    DefaultTableModel modServiKey, modClienteKey, modVentaKey,modPaqueteKey;
    

    public Inicio() {
        initComponents();
        control = new ControlModelo();
        modelo = new DefaultTableModel();
        modClientes = new DefaultTableModel();
        modServicios = new DefaultTableModel();
        modPaquetes = new DefaultTableModel();
        modEmpleados = new DefaultTableModel();
        modServiKey = new DefaultTableModel();
        modClienteKey = new DefaultTableModel();
        modVentaKey = new DefaultTableModel();
        modPaqueteKey = new DefaultTableModel();
    }

    public Inicio(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public long getId_usuario() {
        return id_usuario;
    }
    //Listar Empleados

    public void ListarEmpleados() {
        //Inicializo un vector de objetos para mostrar los atributos de cada cliente
        Object[] ob = new Object[7];
        //A la tabla modelo por default le doy el valor de la tabla cliente creada en mi intefaz
        modEmpleados = (DefaultTableModel) tablaEmpleados.getModel();
        //Mediante un for recorro el array, pasando como longitud la cantidad de clientes que tengo en mi base de datos
        try {
            for (long i = 1; i <= control.listarEmpleado().size(); i++) {
                //En cada lugar de mi array voy a ingresar el valor de los siguientes atributos del cliente
                //de mi base de datos.  
                ob[0] = control.buscarEmpleado(i).getId();
                ob[1] = control.buscarEmpleado(i).getNombre_empleado();
                ob[2] = control.buscarEmpleado(i).getApellido_empleado();
                ob[3] = control.buscarEmpleado(i).getDni();
                ob[4] = control.buscarEmpleado(i).getCargo();
                ob[5] = control.buscarEmpleado(i).getCelular_empleado();
                ob[6] = control.buscarEmpleado(i).getEmail_empleado();
                //A la tabla modelo le voy a agregar una fila por cada objeto
                modEmpleados.addRow(ob);

            }
            //Una vez finalizada la carga de mi tabla modelo, voy a setear a mi tabla de interfaz el modelo cargado con valores
            tablaEmpleados.setModel(modEmpleados);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //Metodo limpiar empleados
    public void limpiarEmpleados() {
        //Inicio un bucle for pasando como longitud el conteo de la cantidad de filas en mi tabla
        //Esta misma irá borrando de a uno los clientes
        for (int i = 0; i < tablaEmpleados.getRowCount(); i++) {
            modEmpleados.removeRow(i);
            i = i - 1;
        }
    }

    //Listar Clientes
    public void listarClietes() {
        Object[] ob = new Object[7];
        modClientes = (DefaultTableModel) tablaClientes.getModel();
        try {
            for (long i = 1; i <= control.listarCliente().size(); i++) {
                ob[0] = control.buscarCliente(i).getId();
                ob[1] = control.buscarCliente(i).getNombre_cliente();
                ob[2] = control.buscarCliente(i).getApellido_cliente();
                ob[3] = control.buscarCliente(i).getDni_cliente();
                ob[4] = control.buscarCliente(i).getNacionalidad();
                ob[5] = control.buscarCliente(i).getCelular_cliente();
                ob[6] = control.buscarCliente(i).getEmail_cliente();
                modClientes.addRow(ob);
            }
            tablaClientes.setModel(modClientes);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //Limpiar tabla cliente
    public void limpiarClientes() {
        for (int i = 0; i < tablaClientes.getRowCount(); i++) {
            modClientes.removeRow(i);
            i = i - 1;
        }
    }

    //Metodo listarVentas
    public void listarVentas() {
        Object[] ob = new Object[3];
        modelo = (DefaultTableModel) tablaVentas.getModel();
        for (long i = 1; i <= control.listarVenta().size(); i++) {
            ob[0] = control.buscarVenta(i).getId();
            ob[1] = control.buscarVenta(i).getFecha_venta();
            ob[2] = control.buscarVenta(i).getMedio_pago();
            modelo.addRow(ob);
        }
        tablaVentas.setModel(modelo);
    }

    //Metodo limpiar tabla ventas
    public void limpiarVentas() {
        for (int i = 0; i < tablaVentas.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    //Metodo listar Servicio
    public void listarServicio() {
        Object[] ob = new Object[5];
        modServicios = (DefaultTableModel) tablaServicio.getModel();
        try {
            for (long i = 1; i <= control.listarServicio().size(); i++) {
                ob[0] = control.buscarServicio(i).getId();
                ob[1] = control.buscarServicio(i).getNombre_servicio();
                ob[2] = control.buscarServicio(i).getCosto_servicio();
                ob[3] = control.buscarServicio(i).getFecha_servicio();
                ob[4] = control.buscarServicio(i).getDestino_servicio();
                modServicios.addRow(ob);
            }
            tablaServicio.setModel(modServicios);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //metodo limpiar lista de servicio
    public void limpiarServicio() {
        for (int i = 0; i < tablaServicio.getRowCount(); i++) {
            modServicios.removeRow(i);
            i = i - 1;
        }
    }

    //Listar paquetes
    public void listarPaquete() {
        Object[] ob = new Object[3];
        modPaquetes = (DefaultTableModel) tablaPaquete1.getModel();
        try {
            for (long i = 1; i <= control.listarPaquete().size(); i++) {
                ob[0] = control.buscarPaquete(i).getId();
                ob[1] = control.buscarPaquete(i).getNombre_paqute();
                ob[2] = control.buscarPaquete(i).getCosto_paquete();
                modPaquetes.addRow(ob);
            }
            tablaPaquete1.setModel(modPaquetes);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //limpiar lista de paquetes
    public void limpiarPaquete() {
        for (int i = 0; i < tablaPaquete1.getRowCount(); i++) {
            modPaquetes.removeRow(i);
            i = i - 1;
        }
    }

    //metodo para listar servicios dentro de un paquete
    public void listarServiKey() {
        long i = (long) modPaquetes.getValueAt(tablaPaquete1.getSelectedRow(), 0);
        modServiKey = (DefaultTableModel) tablaKeyServicio.getModel();
        Object[] ob = new Object[4];
        for (int j = 0; j < control.buscarPaquete(i).getServicios().size(); j++) {
            ob[0] = control.buscarPaquete(i).getServicios().get(j).getId();
            ob[1] = control.buscarPaquete(i).getServicios().get(j).getNombre_servicio();
            ob[2] = control.buscarPaquete(i).getServicios().get(j).getFecha_servicio();
            ob[3] = control.buscarPaquete(i).getServicios().get(j).getDestino_servicio();
            modServiKey.addRow(ob);
        }
        tablaKeyServicio.setModel(modServiKey);

    }

    //Metodo para limpiar la lista de servicios dentro de un paquete
    public void limpiarServiKey() {
        for (int i = 0; i < tablaKeyServicio.getRowCount(); i++) {
            modServiKey.removeRow(i);
            i = i - 1;
        }
    }

    //Metodo para listar clientes y sus ventas
    public void listarClienteKey() {
        Object[] ob = new Object[5];
        modClienteKey = (DefaultTableModel) tablaClientesKey.getModel();
        try {
            for (long i = 1; i <= control.listarCliente().size(); i++) {
                ob[0] = control.buscarCliente(i).getId();
                ob[1] = control.buscarCliente(i).getNombre_cliente();
                ob[2] = control.buscarCliente(i).getApellido_cliente();
                ob[3] = control.buscarCliente(i).getDni_cliente();
                ob[4] = control.buscarCliente(i).getCelular_cliente();
                modClienteKey.addRow(ob);

            }
            tablaClientesKey.setModel(modClienteKey);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //Metodo para limpiar tabla de clientes con ventas
    public void limpiarClienteKey() {
        for (int i = 0; i < tablaClientesKey.getRowCount(); i++) {
            modClienteKey.removeRow(i);
            i = i - 1;
        }
    }

    //Metodo para listar las ventas de los clientes
    public void listarVentasKey() {
        long i = (long) modClienteKey.getValueAt(tablaClientesKey.getSelectedRow(), 0);
        if (i > 0) {
            modVentaKey = (DefaultTableModel) tablaVentasKey1.getModel();
            Object[] ob = new Object[3];
            for (int j = 0; j < control.buscarCliente(i).getListaVenta().size(); j++) {
                ob[0] = control.buscarCliente(i).getListaVenta().get(j).getId();
                ob[1] = control.buscarCliente(i).getListaVenta().get(j).getFecha_venta();
                ob[2] = control.buscarCliente(i).getListaVenta().get(j).getMedio_pago();
                modVentaKey.addRow(ob);
            }
            tablaVentasKey1.setModel(modVentaKey);
        }
    }

    //Metodo para limpiar tabla de Ventas key
    public void limpiarVentasKey() {
        for (int i = 0; i < tablaVentasKey1.getRowCount(); i++) {
            modVentaKey.removeRow(i);
            i = i - 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panelPrincipal = new javax.swing.JPanel();
        tituloinicio = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();
        panelMenu = new javax.swing.JTabbedPane();
        ventanaPrincipal = new javax.swing.JLayeredPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaClientesKey = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaVentasKey1 = new javax.swing.JTable();
        ventanaCliente = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        btnCrearCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnBorrarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        ventanaVentas = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnCrearVenta = new javax.swing.JButton();
        btnBorrarVenta = new javax.swing.JButton();
        btnBuscarVenta = new javax.swing.JButton();
        btnUltimaVenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        ventanaServicio = new javax.swing.JLayeredPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarServi = new javax.swing.JButton();
        btnBorrarServi = new javax.swing.JButton();
        btnModificarServi = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaServicio = new javax.swing.JTable();
        ventanaPaquete = new javax.swing.JLayeredPane();
        jPanel5 = new javax.swing.JPanel();
        btnAgregarPaquete = new javax.swing.JButton();
        btnBorrarPaquete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnModificarPaquete = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaKeyServicio = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaPaquete1 = new javax.swing.JTable();
        btnActualizar = new javax.swing.JLabel();
        ventanaEmpleado = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnCrearEmpleado = new javax.swing.JButton();
        btnBorrarEmpleado = new javax.swing.JButton();
        btnModificarEmpleado = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        btnModContr = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(915, 560));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(915, 560));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(915, 560));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(915, 560));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu (2).png"))); // NOI18N
        panelPrincipal.add(tituloinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 40));

        btnCerrarSesion.setFont(new java.awt.Font("MS PGothic", 1, 10)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(153, 153, 255));
        btnCerrarSesion.setText("[CERRAR SESIÓN]");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });
        panelPrincipal.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        panelMenu.setBackground(new java.awt.Color(153, 153, 255));
        panelMenu.setForeground(new java.awt.Color(255, 255, 255));
        panelMenu.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        panelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuMouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tablaClientesKey.setBackground(new java.awt.Color(255, 255, 255));
        tablaClientesKey.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nombre", "Apellido ", "DNI", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientesKey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaClientesKey.setGridColor(new java.awt.Color(204, 204, 255));
        tablaClientesKey.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaClientesKey.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(tablaClientesKey);
        if (tablaClientesKey.getColumnModel().getColumnCount() > 0) {
            tablaClientesKey.getColumnModel().getColumn(0).setResizable(false);
            tablaClientesKey.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaClientesKey.getColumnModel().getColumn(1).setResizable(false);
            tablaClientesKey.getColumnModel().getColumn(2).setResizable(false);
            tablaClientesKey.getColumnModel().getColumn(3).setResizable(false);
            tablaClientesKey.getColumnModel().getColumn(4).setResizable(false);
        }

        btnRefresh.setText("Refrescar");
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });

        tablaVentasKey1.setBackground(new java.awt.Color(255, 255, 255));
        tablaVentasKey1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Fecha", "Medio de Pago "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentasKey1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaVentasKey1.setGridColor(new java.awt.Color(204, 204, 255));
        tablaVentasKey1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaVentasKey1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(tablaVentasKey1);
        if (tablaVentasKey1.getColumnModel().getColumnCount() > 0) {
            tablaVentasKey1.getColumnModel().getColumn(0).setResizable(false);
            tablaVentasKey1.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaVentasKey1.getColumnModel().getColumn(1).setResizable(false);
            tablaVentasKey1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(btnRefresh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(btnRefresh))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(181, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)))
        );

        ventanaPrincipal.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ventanaPrincipalLayout = new javax.swing.GroupLayout(ventanaPrincipal);
        ventanaPrincipal.setLayout(ventanaPrincipalLayout);
        ventanaPrincipalLayout.setHorizontalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaPrincipalLayout.setVerticalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu.addTab("Principal", ventanaPrincipal);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCrearCliente.setText("Crear Cliente");
        btnCrearCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearClienteMouseClicked(evt);
            }
        });
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseClicked(evt);
            }
        });

        btnModificarCliente.setText("Modificar Cliente");
        btnModificarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarClienteMouseClicked(evt);
            }
        });

        btnBorrarCliente.setText("Borrar Cliente");
        btnBorrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarClienteMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Presione el botón con la acción que desea realizar:");

        tablaClientes.setBackground(new java.awt.Color(255, 255, 255));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nombre", "Apellido ", "DNI", "Nacionalidad", "Celular", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaClientes.setGridColor(new java.awt.Color(204, 204, 255));
        tablaClientes.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaClientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setResizable(false);
            tablaClientes.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaClientes.getColumnModel().getColumn(1).setResizable(false);
            tablaClientes.getColumnModel().getColumn(2).setResizable(false);
            tablaClientes.getColumnModel().getColumn(3).setResizable(false);
            tablaClientes.getColumnModel().getColumn(4).setResizable(false);
            tablaClientes.getColumnModel().getColumn(4).setHeaderValue("Nacionalidad");
            tablaClientes.getColumnModel().getColumn(5).setResizable(false);
            tablaClientes.getColumnModel().getColumn(6).setHeaderValue("Email");
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        ventanaCliente.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ventanaClienteLayout = new javax.swing.GroupLayout(ventanaCliente);
        ventanaCliente.setLayout(ventanaClienteLayout);
        ventanaClienteLayout.setHorizontalGroup(
            ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaClienteLayout.setVerticalGroup(
            ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu.addTab("Clientes", ventanaCliente);

        ventanaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventanaVentasMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Presione el botón con la acción que desea realizar:");

        btnCrearVenta.setText("Crear Venta");
        btnCrearVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearVentaMouseClicked(evt);
            }
        });

        btnBorrarVenta.setText("Borrar Venta");
        btnBorrarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarVentaMouseClicked(evt);
            }
        });

        btnBuscarVenta.setText("Buscar Venta");
        btnBuscarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarVentaMouseClicked(evt);
            }
        });

        btnUltimaVenta.setText("Última Venta");
        btnUltimaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUltimaVentaMouseClicked(evt);
            }
        });

        tablaVentas.setBackground(new java.awt.Color(255, 255, 255));
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Fecha", "Medio de Pago "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaVentas.setGridColor(new java.awt.Color(204, 204, 255));
        tablaVentas.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaVentas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tablaVentas);
        if (tablaVentas.getColumnModel().getColumnCount() > 0) {
            tablaVentas.getColumnModel().getColumn(0).setResizable(false);
            tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaVentas.getColumnModel().getColumn(1).setResizable(false);
            tablaVentas.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnCrearVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnBorrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnUltimaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUltimaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ventanaVentas.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ventanaVentasLayout = new javax.swing.GroupLayout(ventanaVentas);
        ventanaVentas.setLayout(ventanaVentasLayout);
        ventanaVentasLayout.setHorizontalGroup(
            ventanaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaVentasLayout.setVerticalGroup(
            ventanaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu.addTab("Ventas", ventanaVentas);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Presione el botón con la acción que desea realizar:");

        btnAgregarServi.setText("Agregar Servicio");
        btnAgregarServi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarServiMouseClicked(evt);
            }
        });

        btnBorrarServi.setText("Borrar Servicio");
        btnBorrarServi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarServiMouseClicked(evt);
            }
        });

        btnModificarServi.setText("Modificar Servicio");
        btnModificarServi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarServiMouseClicked(evt);
            }
        });

        tablaServicio.setBackground(new java.awt.Color(255, 255, 255));
        tablaServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nombre", "Costo", "Fechas", "Destino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaServicio.setGridColor(new java.awt.Color(204, 204, 255));
        tablaServicio.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaServicio.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(tablaServicio);
        if (tablaServicio.getColumnModel().getColumnCount() > 0) {
            tablaServicio.getColumnModel().getColumn(0).setResizable(false);
            tablaServicio.getColumnModel().getColumn(0).setPreferredWidth(7);
            tablaServicio.getColumnModel().getColumn(1).setPreferredWidth(70);
            tablaServicio.getColumnModel().getColumn(2).setResizable(false);
            tablaServicio.getColumnModel().getColumn(2).setPreferredWidth(25);
            tablaServicio.getColumnModel().getColumn(3).setResizable(false);
            tablaServicio.getColumnModel().getColumn(4).setResizable(false);
            tablaServicio.getColumnModel().getColumn(4).setPreferredWidth(35);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnAgregarServi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnBorrarServi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnModificarServi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarServi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarServi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarServi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(108, Short.MAX_VALUE)))
        );

        ventanaServicio.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ventanaServicioLayout = new javax.swing.GroupLayout(ventanaServicio);
        ventanaServicio.setLayout(ventanaServicioLayout);
        ventanaServicioLayout.setHorizontalGroup(
            ventanaServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaServicioLayout.setVerticalGroup(
            ventanaServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu.addTab("Servicios", ventanaServicio);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarPaquete.setText("Agregar Paquete");
        btnAgregarPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPaqueteMouseClicked(evt);
            }
        });

        btnBorrarPaquete.setText("Borrar Paquete");
        btnBorrarPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarPaqueteMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Presione el botón con la acción que desea realizar:");

        btnModificarPaquete.setText("Modificar Paquete");
        btnModificarPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarPaqueteMouseClicked(evt);
            }
        });

        tablaKeyServicio.setBackground(new java.awt.Color(255, 255, 255));
        tablaKeyServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nombre", "Fecha", "Destino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaKeyServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaKeyServicio.setGridColor(new java.awt.Color(204, 204, 255));
        tablaKeyServicio.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaKeyServicio.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(tablaKeyServicio);
        if (tablaKeyServicio.getColumnModel().getColumnCount() > 0) {
            tablaKeyServicio.getColumnModel().getColumn(0).setResizable(false);
            tablaKeyServicio.getColumnModel().getColumn(0).setPreferredWidth(7);
            tablaKeyServicio.getColumnModel().getColumn(1).setResizable(false);
            tablaKeyServicio.getColumnModel().getColumn(1).setPreferredWidth(70);
            tablaKeyServicio.getColumnModel().getColumn(2).setResizable(false);
            tablaKeyServicio.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaKeyServicio.getColumnModel().getColumn(3).setResizable(false);
            tablaKeyServicio.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        tablaPaquete1.setBackground(new java.awt.Color(255, 255, 255));
        tablaPaquete1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nombre", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPaquete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaPaquete1.setGridColor(new java.awt.Color(204, 204, 255));
        tablaPaquete1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaPaquete1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setViewportView(tablaPaquete1);
        if (tablaPaquete1.getColumnModel().getColumnCount() > 0) {
            tablaPaquete1.getColumnModel().getColumn(0).setResizable(false);
            tablaPaquete1.getColumnModel().getColumn(0).setPreferredWidth(7);
            tablaPaquete1.getColumnModel().getColumn(1).setResizable(false);
            tablaPaquete1.getColumnModel().getColumn(1).setPreferredWidth(70);
            tablaPaquete1.getColumnModel().getColumn(2).setResizable(false);
            tablaPaquete1.getColumnModel().getColumn(2).setPreferredWidth(25);
        }

        btnActualizar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(153, 153, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(btnAgregarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(104, 104, 104)
                                    .addComponent(btnBorrarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnActualizar))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ventanaPaquete.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ventanaPaqueteLayout = new javax.swing.GroupLayout(ventanaPaquete);
        ventanaPaquete.setLayout(ventanaPaqueteLayout);
        ventanaPaqueteLayout.setHorizontalGroup(
            ventanaPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaPaqueteLayout.setVerticalGroup(
            ventanaPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu.addTab("Paquetes", ventanaPaquete);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Presione el botón con la acción que desea realizar:");

        btnCrearEmpleado.setText("Crear Empleado");
        btnCrearEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearEmpleadoMouseClicked(evt);
            }
        });

        btnBorrarEmpleado.setText("Borrar Empleado");
        btnBorrarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarEmpleadoMouseClicked(evt);
            }
        });

        btnModificarEmpleado.setText("Modificar Empleado");
        btnModificarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarEmpleadoMouseClicked(evt);
            }
        });

        tablaEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nombre", "Apellido ", "DNI", "Cargo", "Celular", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaEmpleados.setGridColor(new java.awt.Color(204, 204, 255));
        tablaEmpleados.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaEmpleados.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(tablaEmpleados);
        if (tablaEmpleados.getColumnModel().getColumnCount() > 0) {
            tablaEmpleados.getColumnModel().getColumn(0).setResizable(false);
            tablaEmpleados.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaEmpleados.getColumnModel().getColumn(1).setResizable(false);
            tablaEmpleados.getColumnModel().getColumn(2).setResizable(false);
            tablaEmpleados.getColumnModel().getColumn(3).setResizable(false);
            tablaEmpleados.getColumnModel().getColumn(4).setResizable(false);
            tablaEmpleados.getColumnModel().getColumn(5).setResizable(false);
        }

        btnModContr.setText("Cambiar Contraseña");
        btnModContr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModContrMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnModificarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnBorrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnModContr, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModContr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        ventanaEmpleado.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ventanaEmpleadoLayout = new javax.swing.GroupLayout(ventanaEmpleado);
        ventanaEmpleado.setLayout(ventanaEmpleadoLayout);
        ventanaEmpleadoLayout.setHorizontalGroup(
            ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaEmpleadoLayout.setVerticalGroup(
            ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu.addTab("Empleados", ventanaEmpleado);

        panelPrincipal.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 620, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AGENCIA-CUBO.png"))); // NOI18N
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Boton para entrar al panel Nuevo usuario
    private void btnCrearEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoMouseClicked
        NewUsuarioIn nuevoUsuario = new NewUsuarioIn();
        nuevoUsuario.setId_usuario(this.id_usuario);
        nuevoUsuario.setVisible(true);
        nuevoUsuario.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCrearEmpleadoMouseClicked

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setForeground(Color.blue);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setForeground(new Color(153, 153, 255));
    }//GEN-LAST:event_btnCerrarSesionMouseExited
    //Boton para cerrar sesion
    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed

    }//GEN-LAST:event_btnCrearClienteActionPerformed
    //Boton para ingresar al panel de nueva venta
    private void btnCrearVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearVentaMouseClicked

        NewVenta nuevaVenta = new NewVenta();
        nuevaVenta.setId_usuario(id_usuario);
        nuevaVenta.setVisible(true);
        nuevaVenta.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCrearVentaMouseClicked
    //--------------------------Cliente---------------------------
    //Boton para ingresar al panel para crear un nuevo cliente
    private void btnCrearClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearClienteMouseClicked
        NewCliente nuevoCliente = new NewCliente();
        nuevoCliente.setId_usuario(this.id_usuario);
        nuevoCliente.setLocationRelativeTo(null);
        nuevoCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearClienteMouseClicked
    //Boton para buscar un cliente
    private void btnBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseClicked
        String dni = JOptionPane.showInputDialog("Ingrese el DNI del Cliente");
        if (dni != null) {
            try {

                long i = 1;
                boolean clienteEcontrado = false;
                while (i <= control.recuentoCliente()) {
                    if (dni.equals(control.buscarCliente(i).getDni_cliente())) {
                        clienteEcontrado = true;
                        String nombre = control.buscarCliente(i).getNombre_cliente();
                        String apellido = control.buscarCliente(i).getApellido_cliente();
                        long id_cliente = control.buscarCliente(i).getId();
                        JOptionPane.showMessageDialog(null, "El cliente ha sido encontrado: \n ID: " + id_cliente + "\n Nombre: " + nombre + "\n Apellido: " + apellido);
                        break;
                    }
                    i++;
                }
                if (clienteEcontrado == false) {
                    JOptionPane.showMessageDialog(null, "El Cliente no existe o verifique el dni ingresado.");
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Para realizar una busqueda ingrese un numero.");
            }
        }
    }//GEN-LAST:event_btnBuscarClienteMouseClicked

    private void btnModificarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarClienteMouseClicked
        ModCliente mod = new ModCliente();
        mod.setId_usuario(this.id_usuario);
        mod.setVisible(true);
        mod.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnModificarClienteMouseClicked

    private void btnBorrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarClienteMouseClicked
        String idString = JOptionPane.showInputDialog("Ingrese el ID del cliente que desea eliminar.");

        if (idString != null) {
            long id = Long.parseLong(idString);
            try {
                control.bajaCliente(id);
                JOptionPane.showMessageDialog(null, "El cliente se ha borrado con exito");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e, "ERROR", 3);
            }
        }
    }//GEN-LAST:event_btnBorrarClienteMouseClicked
//-----------------------------Venta-------------------------------------------
    private void btnBorrarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarVentaMouseClicked
        String idString = JOptionPane.showInputDialog("Ingrese ID de venta.");
        if (idString != null) {
            try {
                long id = Long.parseLong(idString);
                control.bajaVenta(id);
                JOptionPane.showMessageDialog(null, "La venta se ha borrado con exito");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e, "ERROR", 3);
            }
        }
    }//GEN-LAST:event_btnBorrarVentaMouseClicked

    private void btnBuscarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarVentaMouseClicked
        String idString = JOptionPane.showInputDialog("Ingrese el ID de la venta");
        if (idString != null) {
            long id = Long.parseLong(idString);

            long i = 1;
            boolean ventaEcontrada = false;
            while (i <= control.recuentoVentas()) {
                if (id == control.buscarVenta(i).getId()) {
                    ventaEcontrada = true;
                    String fecha = control.buscarVenta(i).getFecha_venta();
                    String mediopago = control.buscarVenta(i).getMedio_pago();
                    long idVenta = control.buscarVenta(i).getId();

                    JOptionPane.showMessageDialog(null, "La venta ha sido encontrada: \n ID: " + idVenta + "\n Fecha: " + fecha + "\n Medio de pago: " + mediopago);
                    break;
                }
                i++;
            }
            if (ventaEcontrada == false) {
                JOptionPane.showMessageDialog(null, "La venta no existe o verifique el dni ingresado.");
            }
        }
    }//GEN-LAST:event_btnBuscarVentaMouseClicked

    private void btnUltimaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUltimaVentaMouseClicked
        long id = control.buscarVenta(control.recuentoVentas()).getId();
        String fecha = control.buscarVenta(id).getFecha_venta();
        String medioPago = control.buscarVenta(id).getMedio_pago();
        JOptionPane.showMessageDialog(null, "\nID: " + id + "\nFecha: " + fecha + "\nMedio de pago: " + medioPago);
    }//GEN-LAST:event_btnUltimaVentaMouseClicked
//-----------------------------Servicio-----------------------------------------
    private void btnAgregarServiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarServiMouseClicked
        NewServicio servicio = new NewServicio();
        servicio.setId_usuario(this.id_usuario);
        servicio.setLocationRelativeTo(null);
        servicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarServiMouseClicked

    private void btnBorrarServiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarServiMouseClicked
        String idString = JOptionPane.showInputDialog("Ingrese un numero ID para eliminar un servicio.");
        if (idString != null) {
            try {
                long id = Long.parseLong(idString);
                control.bajaServicio(id);
                JOptionPane.showMessageDialog(null, "¡El servicio fue dado de baja con éxito!");
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnBorrarServiMouseClicked

    private void btnModificarServiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarServiMouseClicked
        modServicio mod = new modServicio();
        mod.setId_usuario(this.id_usuario);
        mod.setVisible(true);
        mod.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnModificarServiMouseClicked

    private void panelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuMouseClicked
        //Limpiar tabla cliente
        limpiarClientes();
        //Listar clientes
        listarClietes();
        //limpiar tabla
        limpiarVentas();
        //Listar ventas
        listarVentas();
        //Limpiar servicio
        limpiarServicio();
        //Metodo listar
        listarServicio();
        //limpiar paquete
        limpiarPaquete();
        //Listar Paquetes
        listarPaquete();
        //Limpiar tabla de clientes y sus ventas
        limpiarClienteKey();
        //Listar tabla de clientes y sus ventas
        listarClienteKey();
        //limpiarEmpleados
        limpiarEmpleados();
        //Listar Empleados
        ListarEmpleados();
    }//GEN-LAST:event_panelMenuMouseClicked

    private void ventanaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventanaVentasMouseClicked

    }//GEN-LAST:event_ventanaVentasMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        try {
            limpiarServiKey();
            listarServiKey();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe selecionar un paquete de la tabla para mostrar sus servicios.");
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        btnActualizar.setForeground(Color.blue);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        btnActualizar.setForeground(new Color(153, 153, 255));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        try {
            limpiarVentasKey();
            listarVentasKey();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente para ver las ventas en la que participo.");
        }

    }//GEN-LAST:event_btnRefreshMouseClicked

    private void btnBorrarPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarPaqueteMouseClicked
        String idString = JOptionPane.showInputDialog("Ingrese el ID del paquete que desea eliminar.");
        if (idString != null) {
            try {
                long id = Long.parseLong(idString);
                control.bajaPaquete(id);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero que corresponda a un paquete existente.");
            }
        }
    }//GEN-LAST:event_btnBorrarPaqueteMouseClicked

    private void btnAgregarPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPaqueteMouseClicked
        NewPaquete np = new NewPaquete();
        np.setId_usuario(this.id_usuario);
        np.setLocationRelativeTo(null);
        np.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarPaqueteMouseClicked

    private void btnModificarPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarPaqueteMouseClicked
        ModPaquete mp = new ModPaquete();
        mp.setId_usuario(this.id_usuario);
        mp.setLocationRelativeTo(null);
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModificarPaqueteMouseClicked

    private void btnBorrarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarEmpleadoMouseClicked
        String idString = JOptionPane.showInputDialog("Ingrese el ID del empleado que desea borrar.");
        if(idString != null){
            try{
                long id = Long.parseLong(idString);
                if(id != this.id_usuario){
                    control.bajaEmpleado(id);
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Por favor asegurese de que el ID ingresado exista.");
            }
        }
    }//GEN-LAST:event_btnBorrarEmpleadoMouseClicked

    private void btnModificarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoMouseClicked
        ModEmpleado me = new ModEmpleado();
        me.setId_usuario(this.id_usuario);
        me.setLocationRelativeTo(null);
        me.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModificarEmpleadoMouseClicked

    private void btnModContrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModContrMouseClicked
        ModContraseña mc = new ModContraseña();
        mc.setId_usuario(this.id_usuario);
        mc.setLocationRelativeTo(null);
        mc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModContrMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JButton btnAgregarPaquete;
    private javax.swing.JButton btnAgregarServi;
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnBorrarEmpleado;
    private javax.swing.JButton btnBorrarPaquete;
    private javax.swing.JButton btnBorrarServi;
    private javax.swing.JButton btnBorrarVenta;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarVenta;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearEmpleado;
    private javax.swing.JButton btnCrearVenta;
    private javax.swing.JButton btnModContr;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnModificarEmpleado;
    private javax.swing.JButton btnModificarPaquete;
    private javax.swing.JButton btnModificarServi;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUltimaVenta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane panelMenu;
    private javax.swing.JPanel panelPrincipal;
    public javax.swing.JTable tablaClientes;
    public javax.swing.JTable tablaClientesKey;
    public javax.swing.JTable tablaEmpleados;
    public javax.swing.JTable tablaKeyServicio;
    public javax.swing.JTable tablaPaquete1;
    public javax.swing.JTable tablaServicio;
    public javax.swing.JTable tablaVentas;
    public javax.swing.JTable tablaVentasKey1;
    private javax.swing.JLabel tituloinicio;
    private javax.swing.JLayeredPane ventanaCliente;
    private javax.swing.JLayeredPane ventanaEmpleado;
    private javax.swing.JLayeredPane ventanaPaquete;
    private javax.swing.JLayeredPane ventanaPrincipal;
    private javax.swing.JLayeredPane ventanaServicio;
    private javax.swing.JLayeredPane ventanaVentas;
    // End of variables declaration//GEN-END:variables
}
