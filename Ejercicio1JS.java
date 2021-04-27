package com.mycompany.ejercicio1.tallerjsp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ejercicio1")
public class Ejercicio1JS extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException{
       PrintWriter Salida = respuesta.getWriter();
       Salida.println("<!DOCTYPE html>");
       Salida.println("<html lang=\"es\">");
       Salida.println("<head>");
       Salida.println("<title>Convertidor</title>");
       Salida.println("</head>");
       Salida.println("<body>");
       Salida.println("<h2>Resultado:</h2>");
       String numero1 = peticion.getParameter("numero1");
       if(numero1.isEmpty()){
        Salida.println("Se omitio la cantidad");
       } else{
       Salida.println("<p>El resultado es: " + Double.valueOf(peticion.getParameter("numero1")) * 0.00028  + " Dolares</p>");
       }
       Salida.println("<p><a href=\"Ejercicio1.jsp\">Clic aqui para ingresar otra cantidad</a></p>");
       Salida.println("</body>");
       Salida.println("<html>");
    }   
}
