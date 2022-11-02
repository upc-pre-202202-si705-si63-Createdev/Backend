package CreateDev.BackEnd.servicesimpls;


import CreateDev.BackEnd.entities.TipoComprobante;
import CreateDev.BackEnd.repositories.ITipoComprobanteRepository;
import CreateDev.BackEnd.serviceinterfaces.ITipoComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoComprobanteServiceImpl implements ITipoComprobanteService {
    @Autowired
    private ITipoComprobanteRepository tR;

    @Override
    public void insert(TipoComprobante tipocomprobante) {
        tR.save(tipocomprobante);
    }

    @Override
    public List<TipoComprobante> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    @Override
    public List<TipoComprobante> search(String comprobante) {
        return tR.buscarcomprobante(comprobante);
    }
}
