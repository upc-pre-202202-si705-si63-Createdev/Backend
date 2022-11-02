package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.Pedido;
import CreateDev.BackEnd.entities.Solicitud;
import CreateDev.BackEnd.repositories.ISolicitudRepository;
import CreateDev.BackEnd.serviceinterfaces.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SolicitudServiceImpl implements ISolicitudService {

    @Autowired
    private ISolicitudRepository dSolicitud;

    @Override
    public List<Solicitud> listar() {
        return dSolicitud.findAll();
    }

    @Override
    @Transactional
    public boolean insertar(Solicitud solicitud) {
        Solicitud objSolicitud = dSolicitud.save(solicitud);
        if (objSolicitud == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int id) {

        dSolicitud.deleteById(id);

    }
}
