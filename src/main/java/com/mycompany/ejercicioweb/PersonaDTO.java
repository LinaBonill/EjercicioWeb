/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioweb;

/**
 *
 * @author Pc
 */
public class PersonaDTO {
    private String nombres; 
    private String telefono;
    private String correo;
    private String contraseña;

    public PersonaDTO(String nombres, String telefono, String correo, String contraseña) {
        this.nombres = nombres;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    public PersonaDTO() {
        this.nombres = "";
        this.telefono = "";
        this.correo = "";
        this.contraseña = "";
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "nombres=" + nombres + ", telefono=" + telefono + ", correo=" + correo + ", contraseña=" + contraseña;
    }
    
    
}
