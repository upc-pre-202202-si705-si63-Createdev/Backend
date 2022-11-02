package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Producto;

import java.util.List;

public interface IProductoService {

    public void insert(Producto producto);

    List<Producto> list();

    public void delete(int id);

    List<Producto> search(String nameProducto);

}
