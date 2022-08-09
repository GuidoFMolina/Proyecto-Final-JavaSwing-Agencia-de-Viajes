package modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Paquete;
import modelo.Venta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-03T15:54:05", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> fecha_servicio;
    public static volatile ListAttribute<Servicio, Venta> listaVenta;
    public static volatile SingularAttribute<Servicio, String> nombre_servicio;
    public static volatile SingularAttribute<Servicio, Double> costo_servicio;
    public static volatile ListAttribute<Servicio, Paquete> paquetes;
    public static volatile SingularAttribute<Servicio, Long> id;
    public static volatile SingularAttribute<Servicio, String> destino_servicio;

}