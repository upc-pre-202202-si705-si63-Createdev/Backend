package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    public void insert(Producto producto);

    List<Producto> list();

    public void delete(int id);

    List<Producto> search(String nameProducto);

    public Optional<Producto> listarId (int idProducto);
}
