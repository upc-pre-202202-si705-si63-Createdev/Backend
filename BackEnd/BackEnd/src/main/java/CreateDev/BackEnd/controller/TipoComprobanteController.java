package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.TipoComprobante;
import CreateDev.BackEnd.serviceinterfaces.ITipoComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipocomprobantes")
public class TipoComprobanteController {
    @Autowired
    private ITipoComprobanteService tService;

    @GetMapping("/lista")
    public List<TipoComprobante> listar() {
        return tService.list();
    }

    @PostMapping
    public void registrar(@RequestBody TipoComprobante t) {
        tService.insert(t);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody TipoComprobante t) {
        tService.insert(t);
    }

    @PostMapping("/buscar")
    public List<TipoComprobante> buscar(@RequestBody TipoComprobante t) { return tService.search(t.getcomprobante());
    }
}