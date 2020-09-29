package mx.com.gm.sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;

/*Esta clase debe de ser un ejb para que pueda 
inyectarse el Entity Manager de jpa*/
@Stateless
public class PersonaDaoImpl implements PersonaDao{
    
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findALLPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona p) {
        return em.find(Persona.class, p.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona p) {
        //return em.find(Persona.class, p.getEmail());
        Query query = em.createQuery("from Persona p WHERE p.email =: email");
        query.setParameter("email", p.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona p) {
        em.persist(p);
    }

    @Override
    public void updatePersona(Persona p) {
        em.merge(p);
    }

    @Override
    public void deletePersona(Persona p) {
        //primero se actualiza el objeto y luego se borra (esto para sincronizar el estado de la base de datos)
        em.remove(em.merge(p));
    }
    
    
}
