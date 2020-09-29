
package mx.com.gm.sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mx.com.gm.sga.domain.Usuario;

@Stateless
public class UsuarioDaoImpl implements UsuarioDao{

    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;
    
    @Override
    public List<Usuario> findAllUsuarios() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioById(Usuario p) {
        return em.find(Usuario.class, p.getIdUsuario());
    }

    @Override
    public Usuario findUsuarioByUsername(Usuario p) {
        return em.find(Usuario.class, p.getUsername());
    }

    @Override
    public void insertUsuario(Usuario p) {
        em.persist(p);
    }

    @Override
    public void updateUsuario(Usuario p) {
        em.merge(p);
    }

    @Override
    public void deleteUsuario(Usuario p) {
        em.remove(em.merge(p));
    }
    
}
