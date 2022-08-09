
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.*;


@Entity
public class Usuario implements Serializable {
    //
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
 
    
    @Column
    private String nombre_usuario;
    private String contrasenia;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "USUARIO_FK_VENTA")        
    private List<Venta>listaVenta = new ArrayList<>() ;

    
    
    
    //constructor
    public Usuario() {
    }

    public Usuario( String nombre_usuario, String contrasenia, List<Venta> listaVenta) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.listaVenta = listaVenta;
    }
    
    //setget
    public List<Venta> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        this.listaVenta = listaVenta;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
   //Hash

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.nombre_usuario);
        hash = 59 * hash + Objects.hashCode(this.contrasenia);
        hash = 59 * hash + Objects.hashCode(this.listaVenta);
        return hash;
    }
    

   //Equals
    

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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre_usuario, other.nombre_usuario)) {
            return false;
        }
        if (!Objects.equals(this.contrasenia, other.contrasenia)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.listaVenta, other.listaVenta)) {
            return false;
        }
        return true;
    }

   //ToString

    @Override
    public String toString() {
        return  "id: " + id + ", nombre_usuario: " + nombre_usuario ;
    }

    
    
    
}
