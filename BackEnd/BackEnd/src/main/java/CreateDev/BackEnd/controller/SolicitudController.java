package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.Solicitud;
import CreateDev.BackEnd.serviceinterfaces.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

    @Autowired
    private ISolicitudService sService;

    @PostMapping
    public void registrar(@RequestBody Solicitud s) {
        sService.insertar(s);
    }



    @GetMapping
    public List<Solicitud> listar() {
        return sService.listar();
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        sService.eliminar(id);
    }
}
