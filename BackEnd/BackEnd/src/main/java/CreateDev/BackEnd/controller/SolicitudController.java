package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.CantidadProxSol;
import CreateDev.BackEnd.entities.Solicitud;
import CreateDev.BackEnd.entities.SolicitudesArtesano;
import CreateDev.BackEnd.entities.SolicitudesRecientes;
import CreateDev.BackEnd.serviceinterfaces.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

    @Autowired
    private ISolicitudService sService;

    @PostMapping
    public void registrar(@RequestBody Solicitud s) {
        sService.insertar(s);
    }

    @PutMapping
    public void modificar(@RequestBody Solicitud s) {
        sService.insertar(s);
    }

    @GetMapping("/lista")
    public List<Solicitud> listar() {
        return sService.listar();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        sService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Solicitud> buscar(@RequestBody Solicitud s) throws ParseException {

        List<Solicitud> listaSolicitudes;
        listaSolicitudes = sService.buscarPedido(s.getPedido().getNombre());
        return listaSolicitudes;

    }

    @GetMapping("/{id}")
    public Optional<Solicitud> listarId(@PathVariable("id") Integer id) {
        return sService.listarId(id);
    }

    @GetMapping("/cantidadproxsol")
    public List<CantidadProxSol> buscarPxS(){return sService.buscarCantidadSxP();}

    @GetMapping("/solicitudes-artesanos")
    public List<SolicitudesArtesano> buscarSolicitudesArtesanos(){
        return sService.buscarSolicitudesArtesanos();
    }

    @GetMapping("/solicitudes-mas-recientes")
    public List<SolicitudesRecientes> buscarSolicitudesRecientes(){
        return sService.buscarSolicitudesRecientes();
    }

}
