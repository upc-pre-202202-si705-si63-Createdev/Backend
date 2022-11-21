package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.Pedido;
import CreateDev.BackEnd.serviceinterfaces.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import CreateDev.BackEnd.entities.Respuesta;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private IPedidoService pService;

    @GetMapping("/lista")
    public List<Pedido> listar() {
        return pService.list();
    }

    @PostMapping
    public void registrar(@RequestBody Pedido p) {
        pService.insert(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Pedido p) {
        pService.insert(p);
    }

    @PostMapping("/buscar")
    public List<Pedido> buscar(@RequestBody Pedido p) {
        return pService.search(p.getNombre());
    }

    @GetMapping("/{id}")
    public Optional<Pedido> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

    @GetMapping("/cantidades*cliente")
    public List<Respuesta> buscarCantidadpecli(){
        return pService.buscarCantidaddepedidosxcliente();
    }

}
