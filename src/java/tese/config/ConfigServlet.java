/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tese.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tese.dao.DatabaseDAO;
import tese.dao.UsuarioDAO;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "ConfigServlet", urlPatterns = {"/ConfigServlet"})
public class ConfigServlet extends HttpServlet {

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
            out.println("<title>Servlet ConfigServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Probando conexión a BD.</h1>");
            UsuarioDAO.getConeccion();
            out.println("<h1>Conectado a la base de datos.</h1>");
            
            if ( UsuarioDAO.crearTabla() ) {
                out.println("<h1> Tabla usuario creada </h1>");
            } else {
               out.println("<h1> Tabla usuario NO creada </h1>");
            }
            //---
            if ( UsuarioDAO.sqlInsert("juan","juan@gmail.com","123") > 0 ) {
                out.println("<h1> Usuario insertado</h1>");
            } else {
               out.println("<h1> Usuario NO insertado</h1>");
            }
            
            
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(ConfigServlet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("<h1> " + ex.getMessage() + "</h1>");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConfigServlet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("<h1> " + ex.getMessage() + "</h1>");
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
