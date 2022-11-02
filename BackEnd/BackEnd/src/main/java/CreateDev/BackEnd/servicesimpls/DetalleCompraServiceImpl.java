package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.DetalleCompra;
import CreateDev.BackEnd.repositories.IDetalleCompraRepository;
import CreateDev.BackEnd.serviceinterfaces.IDetalleCompraService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DetalleCompraServiceImpl implements IDetalleCompraService {
    @Autowired
    private IDetalleCompraRepository dtR;


    @Override
    public List<DetalleCompra> list() {
        return dtR.findAll();
    }

    @Override
    @Transactional
    public boolean insertar(DetalleCompra detalleCompra) {
        DetalleCompra objDetalleCompra = dtR.save(detalleCompra);
        if(objDetalleCompra == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public void eliminar(int idDetalleCompra) {
        dtR.deleteById(idDetalleCompra);
    }
}
