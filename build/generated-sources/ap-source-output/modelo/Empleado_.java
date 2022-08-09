package modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-03T15:54:05", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> nombre_empleado;
    public static volatile SingularAttribute<Empleado, String> domicilio;
    public static volatile SingularAttribute<Empleado, String> celular_empleado;
    public static volatile SingularAttribute<Empleado, String> apellido_empleado;
    public static volatile SingularAttribute<Empleado, String> fecha_nacimiento;
    public static volatile SingularAttribute<Empleado, String> email_empleado;
    public static volatile SingularAttribute<Empleado, Usuario> usuario;
    public static volatile SingularAttribute<Empleado, Long> id;
    public static volatile SingularAttribute<Empleado, String> cargo;
    public static volatile SingularAttribute<Empleado, String> dni;
    public static volatile SingularAttribute<Empleado, String> nacionalidad;

}