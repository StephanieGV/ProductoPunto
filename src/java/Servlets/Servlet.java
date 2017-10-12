/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "servletPP", urlPatterns = {"/servletPP"})
public class Servlet extends HttpServlet {
   

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
        int valI1 = Integer.parseInt(request.getParameter("numI1"));
        int valJ1 = Integer.parseInt(request.getParameter("numJ1"));
        int valI2 = Integer.parseInt(request.getParameter("numI2"));
        int valJ2 = Integer.parseInt(request.getParameter("numJ2"));
        
        float valorT = calcula(valI1, valJ1, valI2, valJ2);
        
        response.setContentType("text/html");
        PrintWriter out = new PrintWriter(response.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Producto Punto</title></head>");
        out.println("<body>");
        out.println("<h1><center>Resultado = "+valorT +"</center></h1>");
        //out.println("<h1><center>("+valI1+")*("+valI2+")+ ("+valJ1+")*("+valJ2+")</center></h1>");        
        out.println("</body></html>");
        out.close();
        
    }
    
    public float calcula(int uno, int tres, int dos, int cuatro){
        float resultado=0;
        
        float primero = uno * dos;
        float segundo = tres * cuatro;
        
        resultado = primero + segundo;
        
        
        return resultado;
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

