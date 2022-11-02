package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Solicitud;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ISolicitudService {

    List<Solicitud> listar();
}
