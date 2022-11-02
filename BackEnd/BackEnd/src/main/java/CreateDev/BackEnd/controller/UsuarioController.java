package CreateDev.BackEnd.controller;


import CreateDev.BackEnd.entities.Usuario;

import CreateDev.BackEnd.serviceinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	 @Autowired
	    private IUsuarioService pService;

	    @GetMapping("/lista")
	    public List<Usuario> listar() {
	        return pService.list();
	    }
	    
	    @PostMapping
	    public void registrar(@RequestBody Usuario p) {
	        pService.insert(p);
	    }

	    @DeleteMapping("/{id}")
	    public void eliminar(@PathVariable("id") Integer id) {
	        pService.delete(id);
	    }
	    @PutMapping
	    public void modificar(@RequestBody Usuario p) {
	        pService.insert(p);
	    }

	    @PostMapping("/buscar")
	    public List<Usuario> buscar(@RequestBody Usuario p) {
	        return pService.search(p.getNameUsuarios());
	    }

}
