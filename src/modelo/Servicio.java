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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private double costo_servicio;
    private String nombre_servicio;
    private String destino_servicio;
    private String fecha_servicio;
     //Relacion con venta
     @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "SERVICIO_FK_VENTA")
    private List<Venta> listaVenta = new ArrayList<>() ;
     //Relacion con paquete
    @ManyToMany(mappedBy = "servicios")
    private List<Paquete> paquetes = new ArrayList<>();
    
    
    //Constructor

    public Servicio() {
    }

    public Servicio(double costo_servicio, String nombre_servicio, String destino_servicio, String fecha_servicio) {
        this.costo_servicio = costo_servicio;
        this.nombre_servicio = nombre_servicio;
        this.destino_servicio = destino_servicio;
        this.fecha_servicio = fecha_servicio;
    }

    

    
    
    
    //Metodo adherir paquete
    public void addPaquetes(Paquete paquete){
        paquetes.add(paquete);
        paquete.getServicios().add(this);
        
    }
    //SetGet
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getDestino_servicio() {
        return destino_servicio;
    }

    public void setDestino_servicio(String destino_servicio) {
        this.destino_servicio = destino_servicio;
    }

    public String getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(String fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {    
        this.paquetes = paquetes;
    }

    public List<Venta> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        this.listaVenta = listaVenta;
    }
    

    //HashCode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.costo_servicio) ^ (Double.doubleToLongBits(this.costo_servicio) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.nombre_servicio);
        hash = 83 * hash + Objects.hashCode(this.destino_servicio);
        hash = 83 * hash + Objects.hashCode(this.fecha_servicio);
        hash = 83 * hash + Objects.hashCode(this.listaVenta);
        hash = 83 * hash + Objects.hashCode(this.paquetes);
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
        final Servicio other = (Servicio) obj;
        if (Double.doubleToLongBits(this.costo_servicio) != Double.doubleToLongBits(other.costo_servicio)) {
            return false;
        }
        if (!Objects.equals(this.nombre_servicio, other.nombre_servicio)) {
            return false;
        }
        if (!Objects.equals(this.destino_servicio, other.destino_servicio)) {
            return false;
        }
        if (!Objects.equals(this.fecha_servicio, other.fecha_servicio)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    

    //ToS

    @Override
    public String toString() {
        return "id: " + id + ", costo del servicio: " + costo_servicio + ", nombre del servicio: " + nombre_servicio + ", destino del servicio: " + destino_servicio + ", fecha del servicio: " + fecha_servicio +  ", paquetes: " + paquetes ;
    }
   
    
}
