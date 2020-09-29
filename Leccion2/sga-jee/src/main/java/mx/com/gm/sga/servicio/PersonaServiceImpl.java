package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Juan","Perez","jperez@gmail.com","123456"));
        personas.add(new Persona(2,"Marta","Suarez","msuarez@gmail.com","123456"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona p) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona p) {
        return null;
    }

    @Override
    public void registrarPersona(Persona p) {
    }

    @Override
    public void modificarPersona(Persona p) {
    }

    @Override
    public void eliminarPersona(Persona p) {
    }
    
}
