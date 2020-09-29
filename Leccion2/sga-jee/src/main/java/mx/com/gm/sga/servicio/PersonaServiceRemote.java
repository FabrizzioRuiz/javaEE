package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Persona;

@Remote
public interface PersonaServiceRemote {
    
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona p);
    
    public Persona encontrarPersonaPorEmail(Persona p);
    
    public void registrarPersona(Persona p);
    
    public void modificarPersona(Persona p);
    
    public void eliminarPersona(Persona p);
   
}


