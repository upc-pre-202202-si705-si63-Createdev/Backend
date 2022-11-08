package CreateDev.BackEnd.controller;


import CreateDev.BackEnd.entities.Compraa;
import CreateDev.BackEnd.serviceinterfaces.ICompraaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compras")
public class CompraaController {
    @Autowired
    private ICompraaService cS;

    @GetMapping("/lista")
    public List<Compraa> listar(){return cS.list();}

    @PostMapping
    public void registrar(@RequestBody Compraa c){cS.insert(c);}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){cS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody Compraa c){cS.insert(c);}

    @PostMapping("/buscar")
    public List<Compraa> buscar(@RequestBody Compraa c){return cS.search(c.getNombre_usuario());}


    @GetMapping("/{id}")
    public Optional<Compraa> listarId(@PathVariable("id") Integer id){return cS.listarId(id);}

}
