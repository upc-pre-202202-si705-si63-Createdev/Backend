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

import  CreateDev.BackEnd.entities.Usuario;
import CreateDev.BackEnd.serviceinterfaces.IUsuarioService;

@RestController
@RequestMapping("/usuarios")
public class ClientesController {
    @Autowired
    private  IUsuarioService uService;

    @PostMapping
    public void registrar(@RequestBody Usuario U){
        uService.insertar(U);
    }

    @PutMapping
    public void modificar(@RequestBody Usuario U){
        uService.insertar(U);
    }


}
