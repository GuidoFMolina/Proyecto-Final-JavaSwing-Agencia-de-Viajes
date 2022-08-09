package modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Venta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-03T15:54:05", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> email_cliente;
    public static volatile SingularAttribute<Cliente, String> fecha_nac;
    public static volatile ListAttribute<Cliente, Venta> listaVenta;
    public static volatile SingularAttribute<Cliente, String> apellido_cliente;
    public static volatile SingularAttribute<Cliente, String> celular_cliente;
    public static volatile SingularAttribute<Cliente, Long> id;
    public static volatile SingularAttribute<Cliente, String> dni_cliente;
    public static volatile SingularAttribute<Cliente, String> nombre_cliente;
    public static volatile SingularAttribute<Cliente, String> nacionalidad;

}