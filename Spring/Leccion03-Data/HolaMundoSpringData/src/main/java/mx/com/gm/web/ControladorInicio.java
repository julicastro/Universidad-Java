package mx.com.gm.web;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaDao personaDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        Iterable <Persona> personas = personaDao.findAll();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}
