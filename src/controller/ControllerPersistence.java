package controller;

import controller.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

public class ControllerPersistence {
 
    
    JpaController jpa = new JpaController();
    
   

   //Alta completa
    public void altaCompleta(Cliente cliente, Usuario usuario, Empleado empleado, Venta venta, Servicio servicio, Paquete paquete) {
        jpa.altaCompleta(usuario, cliente, empleado, venta, servicio, paquete);
    }
    //Alta de Usuario/Empleado
    public void altaUsuario_Empleado(Empleado empleado, Usuario usuario){
        jpa.altaUsuario_Empleado(usuario, empleado);
    }
    //Modificacion completa para crud de alta de venta
    public void modCompleta(Usuario usuario, Cliente cliente, Venta venta, Servicio servicio1, Servicio servicio2, Paquete paquete){
        try {
            jpa.editarCompleto(usuario, cliente, venta, servicio1, servicio2, paquete);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Modificacion de servicio y paquete
    public void modServicioPaquete(Servicio servicio, Paquete paquete){
        try {
            jpa.editarServicioPaquete(servicio, paquete);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   //------------------------------------------Cliente-------------------------
     //alta cliente
    public void altaCliente(Cliente cliente){
        jpa.altaCliente(cliente);
    }
    
    //Baja cliente
    public void bajaCliente(long id){
        try {
            jpa.eliminarCliente(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //listar cliente
    public List<Cliente> listarCliente(){
        return jpa.listarCliente();
    }
    //buscar cliente
    public Cliente buscarCliente(long id){
        return jpa.buscarCliente(id);
    }
    //modificar cliente
    public void modificarCliente(Cliente cliente){
        try {
            jpa.editarCliente(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Recuento Cliente
    public long recuentoCliente(){
        return jpa.recuentoCliente();
    }
    
    //------------------------------------------Usuario-------------------------
   //Baja usuario
    public void bajaUsuario(long id){
        try {
            jpa.eliminarUsuario(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //listar usuario
    public List<Usuario> listarUsuario(){
        return jpa.listarUsuario();
    }
    //buscar usuario
    public Usuario buscarUsuario(long id){
        return jpa.buscarUsuario(id);
    }
    //modificar usuario
    public void modificarUsuario(Usuario usuario){
        try {
            jpa.editarUsuario(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //recuento usuario
    public long recuentoUsuario(){
        return jpa.recuentoUsuario();
    }
    //------------------------------------------Empleado-------------------------
   //Baja empleado
    public void bajaEmpleado(long id){
        try {
            jpa.eliminarEmpleado(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //listar empleado
    public List<Empleado> listarEmpleado(){
        return jpa.listarEmpleado();
    }
    //buscar empleado
    public Empleado buscarEmpleado(long id){
        return jpa.buscarEmpleado(id);
    }
    //modificar empleado
    public void modificarEmpleado(Empleado empleado){
        try {
            jpa.editarEmpleado(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Recuento empleados
    public long recuentoEmpleados(){
        return jpa.recuentoEmpleados();
    }
    //------------------------------------------Venta-------------------------
    //Alta venta
    public void altaVenta(Venta venta){
        jpa.altaVenta(venta);
    }
   //Baja Venta
    public void bajaVenta(long id){
        try {
            jpa.eliminarVenta(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //listar venta
    public List<Venta> listarVenta(){
        return jpa.listarVenta();
    }
    //buscar venta
    public Venta buscarVenta(long id){
        return jpa.buscarVenta(id);
    }
    //modificar venta
    public void modificarVenta(Venta venta){
        try {
            jpa.editarVenta(venta);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public long recuentoVentas(){
        return jpa.recuentoVentas();
    }
    //------------------------------------------Servicio-------------------------
   //Baja Servicio
    public void bajaServicio(long id){
        try {
            jpa.eliminarServicio(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //listar servicio
    public List<Servicio> listarServicio(){
        return jpa.listarServicio();
    }
    //buscar servicio
    public Servicio buscarServicio(long id){
        return jpa.buscarServicio(id);
    }
    //modificar servicio
    public void modificarServicio(Servicio servicio){
        try {
            jpa.editarServicio(servicio);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Recuento servicios
    public long recuentoServicios(){
        return jpa.recuentoServicios();
    }
    
    //------------------------------------------Paquete-------------------------
    //Alta paquete
    public void AltaPaquete(Paquete paquete){
        jpa.altaPaquete(paquete);
    }
   //Baja Paquete
    public void bajaPaquete(long id){
        try {
            jpa.eliminarPaquete(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //listar Paquete
    public List<Paquete> listarPaquete(){
        return jpa.listarPaquete();
    }
    //buscar paquete
    public Paquete buscarPaquete(long id){
        return jpa.buscarPaquete(id);
    }
    //modificar paquete
    public void modificarPaquete(Paquete paquete){
        try {
            jpa.editarPaquete(paquete);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Conteo paquete
    public long recuentoPaquete(){
       return jpa.recuentoPaquete();
    }
    
}
