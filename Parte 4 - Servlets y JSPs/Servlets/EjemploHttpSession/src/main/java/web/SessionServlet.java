
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
       // Regresa sesion actual, y si no tiene, crea nuevo objeto
       HttpSession sesion = request.getSession();
       String titulo = null;
       
       //pedir el atributo contadorVisitas a la sesion
       Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
       //si es nulo es la primera vez q accedemos a la aplicacion
       if(contadorVisitas==null){
           contadorVisitas = 1;
           titulo = "Bienvenido por PRIMERA VEZ";
       }else{
           contadorVisitas++;
           titulo = "Bienvenido NUEVAMENTE";
       }
       
       //agregamos nuevo valor a la sesion
       sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //mandamos respouesta al cliente
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("<br>");
        out.print("Numeros de accesos al recurso: " + contadorVisitas);
        out.print("<br>");
        out.print("ID de la sesion: " + sesion.getId());
        out.close();
       
    }//Fin metodo doGet
    
}
