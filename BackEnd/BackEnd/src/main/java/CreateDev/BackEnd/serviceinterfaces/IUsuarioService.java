package CreateDev.BackEnd.serviceinterfaces;


import CreateDev.BackEnd.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
	
	public void insertar(Usuario usuario);

    List<Usuario> listar();

    public void eliminar(int id);

    List<Usuario> search(String nameUsuarios);
}
