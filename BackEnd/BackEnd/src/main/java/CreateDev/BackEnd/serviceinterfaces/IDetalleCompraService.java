package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Compraa;
import CreateDev.BackEnd.entities.DetalleCompra;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface IDetalleCompraService {

    public boolean insertar(DetalleCompra detalleCompra);

    public void eliminar(int idDetalleCompra);

    Optional<DetalleCompra> listarId(int idDetalleCompra);

    List<DetalleCompra> listar();

    List<DetalleCompra> buscarProducto(String nameProducto);

    @Transactional
    List<DetalleCompra> buscarId(int id);
}
