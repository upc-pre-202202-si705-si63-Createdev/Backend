package CreateDev.BackEnd.servicesimpls;



import CreateDev.BackEnd.entities.Usuario;
import CreateDev.BackEnd.repositories.IUsuarioRepository;
import CreateDev.BackEnd.serviceinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
    private IUsuarioRepository pR;
	
	 @Override
	    public void insertar(Usuario usuario) {
	        pR.save(usuario);
	    }
	 
	 @Override
	    public List<Usuario> listar() {
	        return pR.findAll();
	

}
	 @Override
	    public void eliminar(int idUsuarios) {
	        pR.deleteById(idUsuarios);
	    }
	 @Override
	    public List<Usuario> search(String nameUsuarios) {
	        return pR.buscarNombre(nameUsuarios);
	    }

}

