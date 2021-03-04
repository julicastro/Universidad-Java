
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. Procesamos parametros
       
        //2. Crear JavaBeans a usar
        Rectangulo rec = new Rectangulo(3,6);
       
        //3. Agregamos el javabean a algun alcance
        request.setAttribute("mensaje", "Saludos desde el servlet");
        // la variable mensaje la vamos a buscar desde el jsp para mostrar al cliente
       
        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo",rec);
       
        //4. Redireccionar a la vista seleccionada (JSP)
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(request, response);
    }
    
    
    
    
    
}
