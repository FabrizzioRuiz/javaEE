package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.datos.PersonaDao;
import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{
    
    @Inject
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findALLPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona p) {
        return personaDao.findPersonaById(p);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona p) {
        return personaDao.findPersonaByEmail(p);
    }

    @Override
    public void registrarPersona(Persona p) {
        personaDao.insertPersona(p);
    }

    @Override
    public void modificarPersona(Persona p) {
       personaDao.updatePersona(p);
    }

    @Override
    public void eliminarPersona(Persona p) {
        personaDao.deletePersona(p);
    }
    
}
