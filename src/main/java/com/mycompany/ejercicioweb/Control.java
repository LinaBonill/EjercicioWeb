/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pc
 */
public class Control extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Control</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tu solicitud a sido enviada" + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

        }

        //Hacer for para mostrar los datos
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        /*
        PersonaDTO persona=new PersonaDTO(nombres,telefono,correo,contraseña);
         */
        PersonaDTO objpersona;
        PersonaDAO dao = new PersonaDAO();
        String accion = (String) request.getParameter("accion");

        if (accion.equals("login")) {

            String usuario = request.getParameter("txt_usuario");
            String clave = request.getParameter("txt_password");

            objpersona = dao.consultar(usuario, clave);

            if (objpersona.getClave().equals(clave)) {
                request.setAttribute("usuario", request.getParameter("txt_usuario"));
                request.setAttribute("telefono", objpersona.getTelefono());
                request.setAttribute("correo", objpersona.getCorreo());
                request.setAttribute("contra", objpersona.getClave());
                request.getRequestDispatcher("principal.jsp").forward(request, response);
            }else {
                request.setAttribute("registro", "Wrong names or password");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
        if (accion.equals("registro")) {
            //Registro exitoso
            String nombres = request.getParameter("txt_nombres");
            String correo = request.getParameter("txt_email");
            String telefono = request.getParameter("txt_telefono");
            String contraseña = request.getParameter("txt_contra");
            objpersona = new PersonaDTO(nombres, telefono, correo, contraseña);
            if (dao.insertar(objpersona)) {
                request.setAttribute("exito", "Cuenta registrada con exito");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
