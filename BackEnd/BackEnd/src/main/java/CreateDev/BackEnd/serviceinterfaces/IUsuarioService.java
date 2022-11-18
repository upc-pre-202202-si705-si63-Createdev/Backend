package CreateDev.BackEnd.serviceinterfaces;


import CreateDev.BackEnd.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
	
	public void insertar(Usuario usuario);

    List<Usuario> listar();
    Optional<Usuario> listarId(int idUsuario);

    public void eliminar(int id);/* SE PUEDE CAMBIAR A IDUSUARIO ----  PROBAR */

    List<Usuario> search(String nameUsuarios);

    List<Usuario> buscarcorreo();//buscargmail query
}
