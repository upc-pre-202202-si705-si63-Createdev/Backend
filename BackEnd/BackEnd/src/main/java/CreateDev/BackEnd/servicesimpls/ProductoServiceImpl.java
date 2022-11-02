package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.Producto;
import CreateDev.BackEnd.repositories.IProductoRepository;
import CreateDev.BackEnd.serviceinterfaces.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository pR;

    @Override
    public void insert(Producto producto) {
        pR.save(producto);
    }

    @Override
    public List<Producto> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }
    @Override
    public List<Producto> search(String nameProducto) {
        return pR.buscarNombre(nameProducto);
    }

}
