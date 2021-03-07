package ar.edu.unlam.sga.web;

import ar.edu.unlam.sga.domain.Persona;
import ar.edu.unlam.sga.servicio.PersonaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    //LLamada al EJB Local
    @Inject
    PersonaService personaService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Accede a instancia persona
        List<Persona> personas = personaService.listarPersonas();
        System.out.println("Personas = " + personas);
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
    
    
    }       
    
    
    
    
    
}
