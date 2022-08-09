package modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Servicio;
import modelo.Venta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-03T15:54:05", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Paquete.class)
public class Paquete_ { 

    public static volatile ListAttribute<Paquete, Servicio> servicios;
    public static volatile ListAttribute<Paquete, Venta> listaVenta;
    public static volatile SingularAttribute<Paquete, Double> costo_paquete;
    public static volatile SingularAttribute<Paquete, String> nombre_paqute;
    public static volatile SingularAttribute<Paquete, Long> id;

}