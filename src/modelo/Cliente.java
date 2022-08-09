
package modelo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nombre_cliente;
    private String apellido_cliente;
    private String dni_cliente;
    private String celular_cliente;
    private String email_cliente;
    private String fecha_nac;
    private String nacionalidad;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "CLIENTE_FK_VENTA")
    private List<Venta> listaVenta = new ArrayList<>() ;

    //constru

    public Cliente() {
    }

    public Cliente(String nombre_cliente, String apellido_cliente, String dni_cliente, String celular_cliente, String email_cliente, String fecha_nac, String nacionalidad) {
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.dni_cliente = dni_cliente;
        this.celular_cliente = celular_cliente;
        this.email_cliente = email_cliente;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
    }

    

  
    
    //getset
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public List<Venta> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        this.listaVenta = listaVenta;
    }

    public String getCelular_cliente() {
        return celular_cliente;
    }

    public void setCelular_cliente(String celular_cliente) {
        this.celular_cliente = celular_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    //Hash

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.dni_cliente);

        return hash;
    }
    
    
// equals
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombre_cliente, other.nombre_cliente)) {
            return false;
        }
        if (!Objects.equals(this.apellido_cliente, other.apellido_cliente)) {
            return false;
        }
        if (!Objects.equals(this.dni_cliente, other.dni_cliente)) {
            return false;
        }
        if (!Objects.equals(this.celular_cliente, other.celular_cliente)) {
            return false;
        }
        if (!Objects.equals(this.email_cliente, other.email_cliente)) {
            return false;
        }
        if (!Objects.equals(this.fecha_nac, other.fecha_nac)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.listaVenta, other.listaVenta);
    }
    //ToS

    @Override
    public String toString() {
        return  "id: " + id + ", Nombre cliente" + nombre_cliente + ", apellido: " + apellido_cliente + ", dni: " + dni_cliente + ", celular: " + celular_cliente + ", email: " + email_cliente + ", nacimiento: " + fecha_nac + ", nacionalidad: " + nacionalidad ;
    }

    void setId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setId(List<Cliente> listarCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}