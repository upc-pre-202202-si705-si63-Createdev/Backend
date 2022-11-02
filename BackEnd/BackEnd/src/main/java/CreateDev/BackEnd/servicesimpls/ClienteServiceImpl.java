package CreateDev.BackEnd.servicesimpls;

import java.util.Date;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;


import CreateDev.BackEnd.entities.Cliente;
import CreateDev.BackEnd.repositories.IClienteRepository;
import CreateDev.BackEnd.serviceinterfaces.IClienteService;

@RestController
public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private IClienteRepository dCliente;

    @Override
    @Transactional
    public boolean insertar(Cliente cliente){
        Cliente objcliente = dCliente.save(cliente);
        if (objcliente == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    @Transactional
    public void eliminar(int idCliente) {

        dCliente.deleteById(idCliente);

    }

    @Override
    public Optional<Cliente> listarid(int idCliente) {

        return dCliente.findById(idCliente);
    }

    @Override
    public List<Cliente> listar() {
        return dCliente.findAll();
    }

    @Override
    public List<Cliente> buscarUsuario(String nameUsuarios) {
        return dCliente.buscarPropietario(nameUsuarios);
    }

    @Override
    public List<Cliente> buscarCliente(String dni) {
        return dCliente.buscarVehiculo(dni);
    }


}
