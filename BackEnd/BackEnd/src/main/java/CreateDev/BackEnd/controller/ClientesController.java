package CreateDev.BackEnd.controller;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import  CreateDev.BackEnd.entities.Cliente;
import CreateDev.BackEnd.serviceinterfaces.IClienteService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private  IClienteService uService;

    @PostMapping
    public void registrar(@RequestBody Cliente U){
        uService.insertar(U);
    }

    @PutMapping
    public void modificar(@RequestBody Cliente U){
        uService.insertar(U);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        uService.eliminar(id);
    }
    @GetMapping("/lista")
    public List<Cliente> listar(){
        return uService.listar();
    }

    @PostMapping("/buscar")
    public List<Cliente> buscar(@RequestBody Cliente U){
        return uService.buscarCliente(U.getDni());
    }
    @GetMapping("/{id}")
    public Optional<Cliente> listarID(@PathVariable("id") Integer id){
        return uService.listarid(id);
    }



}
