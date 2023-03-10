package com.appservicios.appservicios.entidades;

// @author Claudia

import com.appservicios.appservicios.enums.Rol;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Usuario ;
    private String nombre_Usuario;
    private String barrio;
    private String domicilio;
    private String telefono;
    private String email;
    private String password;
    
    @Enumerated(EnumType.STRING)
    private Rol rol;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_alta;
    @Temporal(TemporalType.DATE)
    private Date fecha_baja;
    
    private Boolean baja;

    public Usuario() {
    }

    public Usuario(int id_Usuario, String nombre_Usuario, String barrio, String domicilio, String telefono, String email, String password, Rol rol, Date fecha_alta, Date fecha_baja, Boolean baja) {
        this.id_Usuario = id_Usuario;
        this.nombre_Usuario = nombre_Usuario;
        this.barrio = barrio;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.fecha_alta = fecha_alta;
        this.fecha_baja = fecha_baja;
        this.baja = baja;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public Boolean getBaja() {
        return baja;
    }

    public void setBaja(Boolean baja) {
        this.baja = baja;
    }
    
    
}
