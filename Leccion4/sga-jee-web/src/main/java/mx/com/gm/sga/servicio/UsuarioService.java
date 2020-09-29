package mx.com.gm.sga.servicio;

import java.util.List;
import mx.com.gm.sga.domain.Usuario;

public interface UsuarioService {
     public List<Usuario> listarUsuarios();
    
    public Usuario encontrarUsuarioPorId(Usuario p);
    
    public Usuario encontrarUsuarioPorUsername(Usuario p);
    
    public void registrarUsuario(Usuario p);
    
    public void modificarUsuario(Usuario p);
    
    public void eliminarUsuario(Usuario p);
}
