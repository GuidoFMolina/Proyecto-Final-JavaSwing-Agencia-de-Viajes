package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nombre_empleado;
    private String apellido_empleado;
    private String dni;
    private String fecha_nacimiento;
    private String domicilio;
    private String nacionalidad;
    private String celular_empleado;
    private String email_empleado;
    private String cargo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EMPLEADO_Fk_USUARIO")
    private Usuario usuario;

    public Empleado() {
    }

    public Empleado(String nombre_empleado, String apellido_empleado, String dni, String fecha_nacimiento, String domicilio, String nacionalidad, String celular_empleado, String email_empleado, String cargo, Usuario usuario) {
        this.nombre_empleado = nombre_empleado;
        this.apellido_empleado = apellido_empleado;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.domicilio = domicilio;
        this.nacionalidad = nacionalidad;
        this.celular_empleado = celular_empleado;
        this.email_empleado = email_empleado;
        this.cargo = cargo;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCelular_empleado() {
        return celular_empleado;
    }

    public void setCelular_empleado(String celular_empleado) {
        this.celular_empleado = celular_empleado;
    }

    public String getEmail_empleado() {
        return email_empleado;
    }

    public void setEmail_empleado(String email_empleado) {
        this.email_empleado = email_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellido_empleado() {
        return apellido_empleado;
    }

    public void setApellido_empleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        hash = 19 * hash + Objects.hashCode(this.nombre_empleado);
        hash = 19 * hash + Objects.hashCode(this.apellido_empleado);
        hash = 19 * hash + Objects.hashCode(this.dni);
        hash = 19 * hash + Objects.hashCode(this.fecha_nacimiento);
        hash = 19 * hash + Objects.hashCode(this.domicilio);
        hash = 19 * hash + Objects.hashCode(this.nacionalidad);
        hash = 19 * hash + Objects.hashCode(this.celular_empleado);
        hash = 19 * hash + Objects.hashCode(this.email_empleado);
        hash = 19 * hash + Objects.hashCode(this.cargo);
        hash = 19 * hash + Objects.hashCode(this.usuario);
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
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.nombre_empleado, other.nombre_empleado)) {
            return false;
        }
        if (!Objects.equals(this.apellido_empleado, other.apellido_empleado)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.fecha_nacimiento, other.fecha_nacimiento)) {
            return false;
        }
        if (!Objects.equals(this.domicilio, other.domicilio)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.celular_empleado, other.celular_empleado)) {
            return false;
        }
        if (!Objects.equals(this.email_empleado, other.email_empleado)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.usuario, other.usuario);
    }

    //ToString
    @Override
    public String toString() {
        return "id: " + id + ", nombre_empleado: " + nombre_empleado + ", apellido_empleado: " + apellido_empleado + ", dni: " + dni + ", fecha_nacimiento: " + fecha_nacimiento + ", domicilio: " + domicilio + ", nacionalidad: " + nacionalidad + ", celular_empleado: " + celular_empleado + ", email_empleado: " + email_empleado + ", cargo: " + cargo + ", usuario: " + usuario;
    }

}
