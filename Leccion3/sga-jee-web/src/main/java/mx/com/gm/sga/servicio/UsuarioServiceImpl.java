package mx.com.gm.sga.servicio;

import java.util.List;
import javax.inject.Inject;
import mx.com.gm.sga.datos.UsuarioDao;
import mx.com.gm.sga.domain.Usuario;

public class UsuarioServiceImpl implements UsuarioService{
    
    @Inject
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAllUsuarios();
    }

    @Override
    public Usuario encontrarUsuarioPorId(Usuario p) {
        return usuarioDao.findUsuarioById(p);
    }

    @Override
    public Usuario encontrarUsuarioPorUsername(Usuario p) {
        return usuarioDao.findUsuarioByUsername(p);
    }

    @Override
    public void registrarUsuario(Usuario p) {
         usuarioDao.insertUsuario(p);
    }

    @Override
    public void modificarUsuario(Usuario p) {
        usuarioDao.updateUsuario(p);
    }

    @Override
    public void eliminarUsuario(Usuario p) {
        usuarioDao.deleteUsuario(p);
    }
    
}
