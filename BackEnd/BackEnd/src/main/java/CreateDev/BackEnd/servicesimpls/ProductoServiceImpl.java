package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.Compraa;
import CreateDev.BackEnd.entities.Producto;
import CreateDev.BackEnd.entities.SolicitudesProducto;
import CreateDev.BackEnd.repositories.IProductoRepository;
import CreateDev.BackEnd.serviceinterfaces.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Producto> listarId(int idProducto) {
        return pR.findById(idProducto);
    }

    @Override
    public List<SolicitudesProducto> buscarSolicitudesProducto(){

        List<SolicitudesProducto> lista = new ArrayList<>();
        pR.buscarSolicitudesProducto().forEach(y->{
            SolicitudesProducto n = new SolicitudesProducto();
            n.setUbicacionProducto(y[0]);
            n.setCantidad(y[1]);
            lista.add(n);
        });
        return lista;

    }
}
