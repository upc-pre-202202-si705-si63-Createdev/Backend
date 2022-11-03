package CreateDev.BackEnd.controller;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import  CreateDev.BackEnd.entities.Artesano;
import CreateDev.BackEnd.serviceinterfaces.IArtesanoService;

@RestController
@RequestMapping("/artesanos")
public class ArtesanoController {
    @Autowired
    private  IArtesanoService aService;

    @PostMapping
    public void registrar(@RequestBody Artesano a){
        aService.insertar(a);
    }

    @PutMapping
    public void modificar(@RequestBody Artesano a){
        aService.insertar(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        aService.eliminar(id);
    }
    @GetMapping
    public List<Artesano> listar(){
        return aService.listar();
    }

    @PostMapping("/buscar")
    public List<Artesano> buscar(@RequestBody Artesano a) throws ParseException{
        List<Artesano> listaartesanos;
        listaartesanos=aService.buscarArtesano(a.getProvincia());
        if(listaartesanos.isEmpty()){
            listaartesanos=aService.buscarUsuario(a.getUsuario().getNameUsuarios());
        }
        return listaartesanos;
    }
    @GetMapping("/{id}")
    public Optional<Artesano> listarID(@PathVariable("id") Integer id){
        return aService.listarid(id);
    }

}
