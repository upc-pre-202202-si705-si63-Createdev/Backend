package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Compra;
import CreateDev.BackEnd.entities.DetalleCompra;

import java.util.List;

public interface IDetalleCompraService {

    List<DetalleCompra> list();

    public boolean insertar(DetalleCompra detalleCompra);

    public void eliminar (int idDetalleCompra);

    List<DetalleCompra> buscarDetalleCompra(int idCompra);


}
