package CreateDev.BackEnd.controller;


import CreateDev.BackEnd.entities.DetalleCompra;
import CreateDev.BackEnd.serviceinterfaces.IDetalleCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallecompra")
public class DetalleCompraController {
    @Autowired
    private IDetalleCompraService dcS;

    @GetMapping
    public List<DetalleCompra> listar(){return dcS.list();}

    @PostMapping
    public void registrar(@RequestBody DetalleCompra dc){dcS.insertar(dc);}

    @PutMapping
    public void modificar(@RequestBody DetalleCompra dc){dcS.insertar(dc);}



}
