package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.TipoProducto;
import CreateDev.BackEnd.repositories.ITipoProductoRepository;
import CreateDev.BackEnd.serviceinterfaces.ITipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoProductoServiceImpl implements ITipoProductoService {
    @Autowired
    private ITipoProductoRepository tR;

    @Override
    public void insert(TipoProducto tipoproducto) {
        tR.save(tipoproducto);
    }

    @Override
    public List<TipoProducto> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    @Override
    public List<TipoProducto> search(String tipoproducto) {
        return tR.buscartipoproducto(tipoproducto);
    }
}
