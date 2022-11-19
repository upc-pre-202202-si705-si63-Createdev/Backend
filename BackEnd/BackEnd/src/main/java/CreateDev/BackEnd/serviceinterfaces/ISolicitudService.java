package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Pedido;
import CreateDev.BackEnd.entities.Solicitud;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ISolicitudService {

    List<Solicitud> listar();

    public boolean insertar(Solicitud solicitud);

    public void eliminar(int id);

    List<Solicitud> buscarPedido(String nombrePedido);

    public Optional<Solicitud> listarId(int id);
}
