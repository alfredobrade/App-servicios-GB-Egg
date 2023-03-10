package com.appservicios.appservicios.entidades;

// @author Claudia

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Servicio;  //Clave de identificación del servicio
    
    private Rubro id_Rubro; 
    private String descripcion_Servicio; //Descripción del pedido del usuario
    
    @Temporal(TemporalType.DATE)
    private Date fecha_Inicio_Servicio; //Fecha de comienzo del trabajo
    @Temporal(TemporalType.DATE)
    private Date fecha_fin_Servicio;  //Fecha de finalización del trabajo
    
    private char tipo_Servicio; //0-aceptado, 1-finalizado, 3-cancelado

    @ManyToOne
    private Cliente id_Cliente; //Muchos servicios para un usuario/cliente

    private Proveedor id_Prov;  //
    private char puntaje_calif; //cantidad de estrellas que se califica
    private String resenia_calif; //Comentario del usuario que califica
    
    
    
    
    
    
    

}
