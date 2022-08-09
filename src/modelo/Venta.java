package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    
      @Column
    private String fecha_venta;
    private String medio_pago;
    
   

    
    //constru

    public Venta() {
    }

    public Venta(String fecha_venta, String medio_pago) {
        this.fecha_venta = fecha_venta;
        this.medio_pago = medio_pago;
    }

  
    
   //GetSet
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }

   

    //Hash

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.fecha_venta);
        hash = 83 * hash + Objects.hashCode(this.medio_pago);
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
        final Venta other = (Venta) obj;
        if (!Objects.equals(this.fecha_venta, other.fecha_venta)) {
            return false;
        }
        if (!Objects.equals(this.medio_pago, other.medio_pago)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        
        return true;
    }

   //ToS

    @Override
    public String toString() {
        return  "id: " + id + ", fecha de venta: " + fecha_venta + ", medio de pago: " + medio_pago ;
    }

   
    
}
