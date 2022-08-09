package modelo;

import controller.ControllerPersistence;
import java.util.List;


public class ControlModelo {

    ControllerPersistence controlPersistencia = new ControllerPersistence();

    //Alta completa
    public void altacompleta(Cliente cliente, Usuario usuario, Empleado empleado, Venta venta, Servicio servicio, Paquete paquete) {
        controlPersistencia.altaCompleta(cliente, usuario, empleado, venta, servicio, paquete);
    }

    //Alta Usuario/Empleado
    public void altaUsuario_Empleado(Usuario usuario, Empleado empleado) {
        controlPersistencia.altaUsuario_Empleado(empleado, usuario);
    }

    //Modificacion completa para crud de venta
    public void modCompleta(Usuario usuario, Cliente cliente, Venta venta, Servicio servicio1, Servicio servicio2, Paquete paquete) {
        controlPersistencia.modCompleta(usuario, cliente, venta, servicio1, servicio2, paquete);
    }
    //Modificacion de Servicio - Paquetes
    public void modServicioPaquete(Servicio servicio, Paquete paquete){
        controlPersistencia.modServicioPaquete(servicio, paquete);
    }
    //------------------------------Cliente-----------------------------------
    //Alta cliente
    public void altaCliente(Cliente cliente) {
        controlPersistencia.altaCliente(cliente);
    }

    //Baja
    public void bajaCliente(long id) {
        controlPersistencia.bajaCliente(id);
    }
    //listar cliente

    public List<Cliente> listarCliente() {
        return controlPersistencia.listarCliente();
    }
//Buscar cliente

    public Cliente buscarCliente(long id) {
        return controlPersistencia.buscarCliente(id);
    }
    //Modificar cliente

    public void modificarCliente(Cliente cliente) {
        controlPersistencia.modificarCliente(cliente);
    }
    //Recuento de clientes

    public long recuentoCliente() {
        return controlPersistencia.recuentoCliente();
    }

    //------------------------------Usuario-----------------------------------
    //Baja
    public void bajaUsuario(long id) {
        controlPersistencia.bajaUsuario(id);
    }
    //listar usuario

    public List<Usuario> listarUsuario() {
        return controlPersistencia.listarUsuario();
    }
//Buscar usuario

    public Usuario buscarUsuario(long id) {
        return controlPersistencia.buscarUsuario(id);
    }
    //Modificar usuario

    public void modificarUsuario(Usuario usuario) {
        controlPersistencia.modificarUsuario(usuario);
    }
    //recuento usuario

    public long recuentoUsuario() {
        return controlPersistencia.recuentoUsuario();
    }
    //------------------------------Empleado-----------------------------------
    //Baja

    public void bajaEmpleado(long id) {
        controlPersistencia.bajaEmpleado(id);
    }
    //listar empleado

    public List<Empleado> listarEmpleado() {
        return controlPersistencia.listarEmpleado();
    }
//Buscar empleado

    public Empleado buscarEmpleado(long id) {
        return controlPersistencia.buscarEmpleado(id);
    }
    //Modificar empleado

    public void modificarEmpleado(Empleado empleado) {
        controlPersistencia.modificarEmpleado(empleado);
    }
    //Recuento empleados
    public long recuentoEmpleados(){
        return controlPersistencia.recuentoEmpleados();
    }
    //------------------------------Venta-----------------------------------
    //Alta venta

    public void altaVenta(Venta venta) {
        controlPersistencia.altaVenta(venta);
    }

    //Baja
    public void bajaVenta(long id) {
        controlPersistencia.bajaVenta(id);
    }
    //listar venta

    public List<Venta> listarVenta() {
        return controlPersistencia.listarVenta();
    }
     //Buscar venta

    public Venta buscarVenta(long id) {
        return controlPersistencia.buscarVenta(id);
    }
    //Modificar venta

    public void modificarVenta(Venta venta) {
        controlPersistencia.modificarVenta(venta);
    }
    //Recuento ventas
    public long recuentoVentas(){
        return controlPersistencia.recuentoVentas();
    }
    //------------------------------Servicio-----------------------------------
    //Baja

    public void bajaServicio(long id) {
        controlPersistencia.bajaServicio(id);
    }
    //listar servicio

    public List<Servicio> listarServicio() {
        return controlPersistencia.listarServicio();
    }
//Buscar servicio

    public Servicio buscarServicio(long id) {
        return controlPersistencia.buscarServicio(id);
    }
    //Modificar servicio

    public void modificarServicio(Servicio servicio) {
        controlPersistencia.modificarServicio(servicio);
    }
    //Recuento servicios
    public long recuentoServicios(){
        return controlPersistencia.recuentoServicios();
    }
    //------------------------------Paquete-----------------------------------
    //Alta paquete
    public void altaPaquete(Paquete paquete){
        controlPersistencia.AltaPaquete(paquete);
    }
    //Baja

    public void bajaPaquete(long id) {
        controlPersistencia.bajaPaquete(id);
    }
    //listar paquete

    public List<Paquete> listarPaquete() {
        return controlPersistencia.listarPaquete();
    }
//Buscar paquete

    public Paquete buscarPaquete(long id) {
        return controlPersistencia.buscarPaquete(id);
    }
    //Modificar paquete

    public void modificarPaquete(Paquete paquete) {
        controlPersistencia.modificarPaquete(paquete);
    }
    //Recuento paquete

    public long recuentoPaquete() {
        return controlPersistencia.recuentoPaquete();
    }
}
