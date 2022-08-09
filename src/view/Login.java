
package view;

import java.awt.Color;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import modelo.ControlModelo;


public class Login extends javax.swing.JFrame {
    
    ControlModelo control = new ControlModelo();

    public Login() {
        initComponents();
    }

     
    public void enterInicio(){
        //Inicialializar las variables, con los textos ingresados en el Login
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        //inicializo el id 
        long id_usuario=0;
        //Inizializo un iterador que servira de indice para realizar la busqueda
        long iterator=1;
        //inicializo una variable de tipo boolean para determinar si el usuario fue encontrado
        boolean usuarioEncontrado = false;
        //realizo un bucle de tipo while utilizando como condicion que mi "Iterator" sea menor o igual que el metodo de conteo de usuario
     while (iterator<=control.recuentoUsuario()){
         //En el if pongo como condicion que usuario y contraseña sean igual que los respectivos atributos de mi base de datos
        if(usuario.equals(control.buscarUsuario(iterator).getNombre_usuario())
                &&(contrasenia.equals(control.buscarUsuario(iterator).getContrasenia()))){
            //Si los atributos son iguales, usuarioEncontrado pasa a ser true.
           usuarioEncontrado = true;
          id_usuario = control.buscarUsuario(iterator).getId();
          String nombre = control.buscarEmpleado(iterator).getNombre_empleado();
           JOptionPane.showMessageDialog(null, "Bienvenido " + nombre, "¡BIENVENIDO!", 1) ;
            break;
        }
        //iterator en caso de no encontrarse los atributos, se sumará en el indice
        iterator++;
     }
     //Si no se encuentra el usuario y su contraseña
     if(usuarioEncontrado==false){
            JOptionPane.showMessageDialog(null, "El usuario o contraseña es incorrecto, intetente de nuevo o haga click en [CREAR UN NUEVO USUARIO]", "EL USUARIO ES INCORRECTO O NO EXISTE", WARNING_MESSAGE);
            
        }
     //en caso de enncontrarse el usuario, se dara acceso al inicio, se dará el id de usuario en sesión
     if(usuarioEncontrado == true){
         Inicio inicio = new Inicio();
         inicio.setId_usuario(id_usuario);
         inicio.setVisible(true);
         inicio.setLocationRelativeTo(null);
         dispose();
         
       
     }
     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn1 = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        txtIngresar = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnEnter = new javax.swing.JPanel();
        txtEnter = new javax.swing.JLabel();
        separadorUsuario = new javax.swing.JSeparator();
        separadorContraseña = new javax.swing.JSeparator();
        btnCrearUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pn1.setBackground(new java.awt.Color(255, 255, 255));
        pn1.setForeground(new java.awt.Color(255, 255, 255));
        pn1.setPreferredSize(new java.awt.Dimension(500, 500));

        labelUsuario.setBackground(new java.awt.Color(153, 153, 255));
        labelUsuario.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(153, 153, 255));

        labelContraseña.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(153, 153, 255));
        labelContraseña.setText("USUARIO");

        txtIngresar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtIngresar.setForeground(new java.awt.Color(153, 153, 255));
        txtIngresar.setText("CONTRASEÑA");

        txtContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setForeground(new java.awt.Color(204, 204, 204));
        txtContrasenia.setText("jPasswordField1");
        txtContrasenia.setBorder(null);
        txtContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseniaMouseClicked(evt);
            }
        });
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        txtContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyPressed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese un usuario...");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(153, 153, 255));
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnterMouseClicked(evt);
            }
        });

        txtEnter.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtEnter.setForeground(new java.awt.Color(255, 255, 255));
        txtEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEnter.setText("INGRESAR");
        txtEnter.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEnterMouseExited(evt);
            }
        });
        txtEnter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEnterKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnterKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout btnEnterLayout = new javax.swing.GroupLayout(btnEnter);
        btnEnter.setLayout(btnEnterLayout);
        btnEnterLayout.setHorizontalGroup(
            btnEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnEnterLayout.setVerticalGroup(
            btnEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        separadorUsuario.setForeground(new java.awt.Color(153, 153, 255));

        separadorContraseña.setForeground(new java.awt.Color(153, 153, 255));

        btnCrearUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        btnCrearUsuario.setForeground(new java.awt.Color(153, 153, 255));
        btnCrearUsuario.setText("[CREAR UN NUEVO USUARIO]");
        btnCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOLOGIN.png"))); // NOI18N

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addGap(0, 208, Short.MAX_VALUE)
                .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(pn1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(labelUsuario)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn1Layout.createSequentialGroup()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelContraseña)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtIngresar)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(separadorUsuario)
                            .addComponent(separadorContraseña)))
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnCrearUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(69, 69, 69)
                .addComponent(labelContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnCrearUsuario)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
       
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseClicked
       
    }//GEN-LAST:event_btnEnterMouseClicked

    private void btnCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseEntered
        btnCrearUsuario.setForeground(Color.blue);
       
    }//GEN-LAST:event_btnCrearUsuarioMouseEntered
       //accion crear un nuevo usuario
    private void btnCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseClicked
        //En caso de solicitar Crear un nuevo usuario, se dara acceso al siguiente panel
        NewUsuario altaUsuario = new NewUsuario();
        altaUsuario.setVisible(true);
        altaUsuario.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCrearUsuarioMouseClicked

    private void btnCrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseExited
        btnCrearUsuario.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_btnCrearUsuarioMouseExited

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
       txtUsuario.setText("");
       txtUsuario.setForeground(Color.black);
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtContraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseniaMouseClicked
        txtContrasenia.setText("");
        txtContrasenia.setForeground(Color.black);
    }//GEN-LAST:event_txtContraseniaMouseClicked

    private void txtEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnterMouseEntered
      txtEnter.setForeground(Color.black);
    }//GEN-LAST:event_txtEnterMouseEntered

    private void txtEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnterMouseExited
        txtEnter.setForeground(Color.white);
    }//GEN-LAST:event_txtEnterMouseExited
    //Accion ingreso al software
    private void txtEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnterMouseClicked
         enterInicio();
    }//GEN-LAST:event_txtEnterMouseClicked

    private void txtEnterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnterKeyPressed
     
        
    }//GEN-LAST:event_txtEnterKeyPressed

    private void txtEnterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnterKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterKeyTyped

    private void txtContraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseniaKeyPressed
         
    }//GEN-LAST:event_txtContraseniaKeyPressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCrearUsuario;
    private javax.swing.JPanel btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel pn1;
    private javax.swing.JSeparator separadorContraseña;
    private javax.swing.JSeparator separadorUsuario;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JLabel txtEnter;
    private javax.swing.JLabel txtIngresar;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
