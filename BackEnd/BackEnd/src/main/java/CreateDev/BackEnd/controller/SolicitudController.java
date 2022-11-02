package CreateDev.BackEnd.controller;

import CreateDev.BackEnd.entities.Solicitud;
import CreateDev.BackEnd.serviceinterfaces.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

    @Autowired
    private ISolicitudService sService;



    @GetMapping
    public List<Solicitud> listar() {
        return sService.listar();
    }
}
