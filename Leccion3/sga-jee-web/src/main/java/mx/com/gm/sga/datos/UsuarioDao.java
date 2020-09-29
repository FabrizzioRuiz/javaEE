
package mx.com.gm.sga.datos;

import java.util.List;
import mx.com.gm.sga.domain.Usuario;


public interface UsuarioDao {
    
    public List<Usuario> findAllUsuarios();
    public Usuario findUsuarioById(Usuario p);
    public Usuario findUsuarioByUsername(Usuario p);
    public void insertUsuario(Usuario p);
    public void updateUsuario(Usuario p);
    public void deleteUsuario(Usuario p);
    
    
}
