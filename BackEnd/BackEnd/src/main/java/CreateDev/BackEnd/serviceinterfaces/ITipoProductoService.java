package CreateDev.BackEnd.serviceinterfaces;
import CreateDev.BackEnd.entities.TipoProducto;

import java.util.List;

public interface ITipoProductoService {

    public void insert(TipoProducto tipoproducto);

    List<TipoProducto> list();

    public void delete(int id);

    List<TipoProducto> search(String tipoproducto);
}