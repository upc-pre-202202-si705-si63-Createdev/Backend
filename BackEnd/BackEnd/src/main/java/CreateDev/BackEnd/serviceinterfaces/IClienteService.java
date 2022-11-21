package CreateDev.BackEnd.serviceinterfaces;


import java.util.List;
import java.util.Optional;

import CreateDev.BackEnd.entities.Cliente;


public interface IClienteService {
    public boolean insertar(Cliente cliente);
    public void eliminar(int idCliente);
    Optional<Cliente> listarid(int idCliente);
    List<Cliente> listar();
    List<Cliente> buscarUsuario(String nameUsuarios);
    List<Cliente> buscarCliente(String dni);


}
