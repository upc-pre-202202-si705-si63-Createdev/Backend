package CreateDev.BackEnd.controller;


import CreateDev.BackEnd.entities.DetalleCompra;
import CreateDev.BackEnd.entities.Producto;
import CreateDev.BackEnd.entities.RespuestaCompra;
import CreateDev.BackEnd.serviceinterfaces.IDetalleCompraService;
import CreateDev.BackEnd.servicesimpls.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detallecompras")
public class DetalleCompraController {
    @Autowired
    private IDetalleCompraService dcService;


    @PostMapping
    public void registrar(@RequestBody DetalleCompra dc) {
        dcService.insertar(dc);
    }

    @PutMapping
    public void modificar(@RequestBody DetalleCompra dc) {
        dcService.insertar(dc);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        dcService.eliminar(id);
    }

    @GetMapping
    public List<DetalleCompra> listar(){return dcService.listar();}

    @PostMapping("/buscar")
    public List<DetalleCompra> buscar(@RequestBody DetalleCompra dc)throws ParseException {
        List<DetalleCompra> listaDCompras;

        listaDCompras = dcService.buscarId(dc.getId());

        if(listaDCompras.isEmpty()){
            listaDCompras = dcService.buscarProducto(dc.getIdProducto().getNameProducto());
        }
        return listaDCompras;
    }

    @GetMapping("/{id}")
    public Optional<DetalleCompra> listarId(@PathVariable("id")Integer id){return dcService.listarId(id);}


    @GetMapping("/query1")
    public List<RespuestaCompra> query1(){return dcService.query1();}

}
