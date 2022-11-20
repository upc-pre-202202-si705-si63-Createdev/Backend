package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Solicitud;
import CreateDev.BackEnd.entities.SolicitudesArtesano;
import CreateDev.BackEnd.entities.SolicitudesRecientes;

import java.util.List;
import java.util.Optional;

public interface ISolicitudService {

    List<Solicitud> listar();

    public boolean insertar(Solicitud solicitud);

    public void eliminar(int id);

    List<Solicitud> buscarPedido(String nombrePedido);

    public Optional<Solicitud> listarId(int id);

    List<SolicitudesArtesano> buscarSolicitudesArtesanos();

    List<SolicitudesRecientes> buscarSolicitudesRecientes();
}
