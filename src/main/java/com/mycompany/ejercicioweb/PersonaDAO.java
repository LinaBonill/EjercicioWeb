/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioweb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class PersonaDAO {

    private static final String SQL_READALL = "SELECT * FROM tb_persona ";
    private static final Conexion con = Conexion.getIntance();

    public PersonaDAO() {
        con.conectar();
    }

    public List<PersonaDTO> readAll() {

        List<PersonaDTO> lista = null;
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                PersonaDTO obj = new PersonaDTO(rs.getString("nombres"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getString("clave"));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            System.out.println("Error al conectar: " + ex);
        }
        return lista;
    }

    public boolean insertar(PersonaDTO objetp) {
        boolean verificar=false;
        String sql = "INSERT INTO tb_persona (nombres, telefono, correo, clave) VALUES('" + objetp.getNombres()
                + "','" + objetp.getTelefono() + "','" + objetp.getCorreo() + "','" + objetp.getClave() + "')";
       
        try {
            Statement ps;
            ps = con.getConexion().createStatement();
            ps.executeUpdate(sql);
            
            verificar=true;
           
        } catch (SQLException ex) {
            System.out.println("Error al conectar: " + ex);
           verificar=false;
        }
       return verificar;
    }

    public PersonaDTO consultar(String nombre, String contraseña) {
        PersonaDTO objpersona = new PersonaDTO();
        String sql = "SELECT * FROM tb_persona WHERE nombres='" + nombre + "' AND clave='" + contraseña + "'";
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("nombres").equals(nombre) && rs.getString("clave").equals(contraseña)) {
                    objpersona.setNombres(rs.getString("nombres"));
                    objpersona.setTelefono(rs.getString("telefono"));
                    objpersona.setCorreo(rs.getString("correo"));
                    objpersona.setClave(rs.getString("clave"));
                }

            }

        } catch (SQLException ex) {
            System.out.println("Error al conectar: " + ex);
        }
        return objpersona;
    }
}
