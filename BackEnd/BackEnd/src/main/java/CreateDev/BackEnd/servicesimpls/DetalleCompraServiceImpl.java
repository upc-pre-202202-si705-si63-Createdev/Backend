package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.DetalleCompra;
import CreateDev.BackEnd.entities.RespuestaCompra;
import CreateDev.BackEnd.entities.RespuestaCompra2;
import CreateDev.BackEnd.repositories.IDetalleCompraRepository;
import CreateDev.BackEnd.serviceinterfaces.IDetalleCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class DetalleCompraServiceImpl implements IDetalleCompraService {

     @Autowired
     private IDetalleCompraRepository dcRepo;

    @Override
    @Transactional
    public boolean insertar(DetalleCompra detalleCompra) {
        DetalleCompra objDC = dcRepo.save(detalleCompra);

        if(objDC==null){
            return false;
        }
        else{return true;}
    }

    @Override
    @Transactional
    public void eliminar(int idDetalleCompra) {dcRepo.deleteById(idDetalleCompra);}

    @Override
    @Transactional
    public Optional<DetalleCompra> listarId(int idDetalleCompra) {
        return  dcRepo.findById(idDetalleCompra);
    }

    @Override
    @Transactional
    public List<DetalleCompra> listar() {return dcRepo.findAll();}

    @Override
    @Transactional
    public List<DetalleCompra> buscarProducto(String nameProducto) {return dcRepo.buscarNombre(nameProducto);}

    @Override
    @Transactional
    public List<DetalleCompra> buscarId(int id){return dcRepo.buscarId(id);}

    @Override
    public List<RespuestaCompra> query1() {
        List<RespuestaCompra> lista = new ArrayList<>();

        dcRepo.query1().forEach(y->{
            RespuestaCompra rc = new RespuestaCompra();
            rc.setNombreCompra(y[0]);
            rc.setCantidad(y[1]);
            rc.setPrecio_unitario(y[2]);
            rc.setTipo_producto(y[3]);

            lista.add(rc);
        });
        return  lista;
    }

    @Override
    public List<RespuestaCompra2> query2() {
        List<RespuestaCompra2> lista = new ArrayList<>();

        dcRepo.query2().forEach(y->{
            RespuestaCompra2 rc = new RespuestaCompra2();
            rc.setCliente(y[0]);
            rc.setCantidad(y[1]);
            rc.setNombreArtesano(y[2]);

            lista.add(rc);
        });
        return  lista;
    }

}
