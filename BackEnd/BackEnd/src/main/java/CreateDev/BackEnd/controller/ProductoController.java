package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.Producto;
import CreateDev.BackEnd.entities.ProductosPorArtesano;
import CreateDev.BackEnd.entities.SolicitudesArtesano;
import CreateDev.BackEnd.entities.SolicitudesProducto;
import CreateDev.BackEnd.serviceinterfaces.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<Producto> listarId(@PathVariable("id") Integer id){return pService.listarId(id);}

    @GetMapping ("/solicitudes-productos")
    public List<SolicitudesProducto> buscarSolicitudesProducto(){
        return pService.buscarSolicitudesProducto();
    }

    @GetMapping("/productos-artesano")
    public List<ProductosPorArtesano> buscarProductosPorArtesano() {
        return pService.buscarProductosPorArtesano();
    }

}
