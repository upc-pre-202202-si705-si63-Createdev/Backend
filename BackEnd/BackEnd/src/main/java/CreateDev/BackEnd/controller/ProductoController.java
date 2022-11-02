package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.Producto;
import CreateDev.BackEnd.serviceinterfaces.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private IProductoService pService;

    @GetMapping("/lista")
    public List<Producto> listar() {
        return pService.list();
    }

    @PostMapping
    public void registrar(@RequestBody Producto p) {
        pService.insert(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Producto p) {
        pService.insert(p);
    }

    @PostMapping("/buscar")
    public List<Producto> buscar(@RequestBody Producto p) {
        return pService.search(p.getNameProducto());
    }

}
