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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Paquete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private double costo_paquete;
    private String nombre_paqute;

    //Relacion venta
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "PAQUETE_FK_VENTA")
    private List<Venta> listaVenta = new ArrayList<>();
    //Relacion con servicios
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "PAQUETES_FK_SERVICIOS", joinColumns = @JoinColumn(name = "paquete_id"),
            inverseJoinColumns = @JoinColumn(name = "servicio_id"))
    private List<Servicio> servicios = new ArrayList<>();

    //Constructor
    public Paquete() {
    }

    public Paquete(double costo_paquete, String nombre_paqute) {
        this.costo_paquete = costo_paquete;
        this.nombre_paqute = nombre_paqute;
    }

    

    //Metodo adherir servicios a paquete
    public void addServicios(Servicio servicio) {
        servicios.add(servicio);
        servicio.getPaquetes().add(this);
    }

    //SETGET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCosto_paquete() {
        return costo_paquete;
    }

    public void setCosto_paquete(double costo_paquete) {
        this.costo_paquete = costo_paquete;
    }

    public String getNombre_paqute() {
        return nombre_paqute;
    }

    public void setNombre_paqute(String nombre_paqute) {
        this.nombre_paqute = nombre_paqute;
    }
    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<Venta> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        this.listaVenta = listaVenta;
    }

    //Hash

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.costo_paquete) ^ (Double.doubleToLongBits(this.costo_paquete) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.nombre_paqute);
        hash = 17 * hash + Objects.hashCode(this.listaVenta);
        hash = 17 * hash + Objects.hashCode(this.servicios);
        return hash;
    }
   

    //equals
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
        final Paquete other = (Paquete) obj;
        if (Double.doubleToLongBits(this.costo_paquete) != Double.doubleToLongBits(other.costo_paquete)) {
            return false;
        }
        if (!Objects.equals(this.nombre_paqute, other.nombre_paqute)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    //ToS
    @Override
    public String toString() {
        return "id: " + id + ", costo del paquete: " + costo_paquete + ", nombre del paqute: " + nombre_paqute;
    }

}
