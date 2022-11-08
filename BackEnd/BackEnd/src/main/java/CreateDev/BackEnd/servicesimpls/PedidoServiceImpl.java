package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.Pedido;
import CreateDev.BackEnd.repositories.IPedidoRepository;
import CreateDev.BackEnd.serviceinterfaces.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements IPedidoService {

    @Autowired
    private IPedidoRepository pR;

    @Override
    public void insert(Pedido pedido) {
        pR.save(pedido);
    }

    @Override
    public List<Pedido> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public List<Pedido> search(String nombre) {
        return pR.buscarNombre(nombre);
    }

    @Override
    public Optional<Pedido> listarId(int id) {
        return pR.findById(id);
    }
}
