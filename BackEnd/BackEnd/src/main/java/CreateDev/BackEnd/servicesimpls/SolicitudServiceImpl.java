package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.CantidadProxSol;
import CreateDev.BackEnd.entities.Solicitud;
import CreateDev.BackEnd.repositories.ISolicitudRepository;
import CreateDev.BackEnd.serviceinterfaces.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @Override
    public Optional<Solicitud> listarId(int id) {
        return dSolicitud.findById(id);
    }

    @Override
    public List<Solicitud> buscarPedido(String nombrePedido) {
        return dSolicitud.buscarPedido(nombrePedido);
    }

    @Override
    public List<CantidadProxSol> buscarCantidadSxP(){
        List<CantidadProxSol> lista = new ArrayList<>();
        dSolicitud.buscarCantidadSxP().forEach(y->{
            CantidadProxSol r =new CantidadProxSol();
            r.setProvincia(y[0]);
            r.setCantidadps(y[1]);
            lista.add(r);

        });
      return lista;
    }
}
