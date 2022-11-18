package CreateDev.BackEnd.controller;


import CreateDev.BackEnd.entities.Usuario;

import CreateDev.BackEnd.serviceinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService pService;

    @GetMapping("/lista")
    public List<Usuario> listar() {
        return pService.listar();
    }

    @PostMapping
    public void registrar(@RequestBody Usuario p) {
        pService.insertar(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PutMapping
    public void modificar(@RequestBody Usuario p) {
        pService.insertar(p);
    }

    @PostMapping("/buscar")
    public List<Usuario> buscar(@RequestBody Usuario p) {
        return pService.search(p.getNameUsuarios());
    }

    @GetMapping("/{id}")
    public Optional<Usuario> listarId(@PathVariable("id") Integer id) {return pService.listarId(id);}

    @GetMapping("/buscarcorreo")//Buscargmailquery
    public List<Usuario> buscarcorreo(){
        return pService.buscarcorreo();
    }
}

