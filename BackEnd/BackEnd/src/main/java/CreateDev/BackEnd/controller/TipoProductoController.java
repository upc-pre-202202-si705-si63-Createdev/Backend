package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.TipoProducto;
import CreateDev.BackEnd.serviceinterfaces.ITipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoproducto")
public class TipoProductoController {

    @Autowired
    private ITipoProductoService tService;

    @GetMapping("/lista")
    public List<TipoProducto> listar() {
        return tService.list();
    }

    @PostMapping
    public void registrar(@RequestBody TipoProducto t) {
        tService.insert(t);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody TipoProducto t) {
        tService.insert(t);
    }

    @PostMapping("/buscar")
    public List<TipoProducto> buscar(@RequestBody TipoProducto t) { return tService.search(t.getTipoTipoProducto());
    }
}