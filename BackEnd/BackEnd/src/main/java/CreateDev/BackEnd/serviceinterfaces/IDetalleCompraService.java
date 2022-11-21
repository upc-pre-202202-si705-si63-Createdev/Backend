package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Compraa;
import CreateDev.BackEnd.entities.DetalleCompra;
import CreateDev.BackEnd.entities.RespuestaCompra;
import CreateDev.BackEnd.entities.RespuestaCompra2;
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

    List<RespuestaCompra> query1();

    List<RespuestaCompra2> query2();

}
