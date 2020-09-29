package mx.com.gm.sga.web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaService;

/*Este Servlet es para que podamos acceder desde este servlet hacia el ejb, 
y posteriormente se crea un jsp para acceder a nuestro servlet desde el ejb*/
@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    /*@inject es Para evitar llamadas remotas inecesarias
    Siempre y cuando el ejb se encuentre dentro proyecto*/
    
    /*Se ha aplicado el contexto de cdi para inyectar la dependencia al ejb*/
    @Inject
    PersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Persona> personas = personaService.listarPersonas();
        System.out.println("personas: " +personas);
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
    }
}
