package mx.com.gm.sga.datos;

import java.util.List;
import mx.com.gm.sga.domain.Persona;

public interface PersonaDao {
    public List<Persona> findALLPersonas();
    public Persona findPersonaById(Persona p);
    public Persona findPersonaByEmail(Persona p);
    public void insertPersona(Persona p);
    public void updatePersona(Persona p);
    public void deletePersona(Persona p);
}
