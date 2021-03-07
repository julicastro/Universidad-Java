package mx.com.gm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.saludo}") //app.prop
    private String saludo;
    
    @GetMapping("/") // hace q se ejecute este metodo
    public String inicio(Model model){
        String mensaje = "Hola Mundo con Thymeleaf"; 
        Persona persona = new Persona();
        
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("1154878766");
        
        Persona persona2 = new Persona();
        persona2.setNombre("Carla");
        persona2.setApellido("Gomez");
        persona2.setEmail("cgomez@mail.com");
        persona2.setTelefono("1176965598");
        
        //List<Persona> personas = new ArrayList();
        //personas.add(persona);
        //personas.add(persona2);
        
        List personas = Arrays.asList(persona,persona2); 
        //List personas = new ArrayList();
        
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
