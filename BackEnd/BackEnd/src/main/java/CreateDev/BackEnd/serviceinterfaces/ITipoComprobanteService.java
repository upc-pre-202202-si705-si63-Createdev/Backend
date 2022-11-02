package CreateDev.BackEnd.serviceinterfaces;
import CreateDev.BackEnd.entities.Pedido;
import CreateDev.BackEnd.entities.TipoComprobante;

import java.util.List;
public interface ITipoComprobanteService {
    public void insert(TipoComprobante tipocomprobante);

    List<TipoComprobante> list();

    public void delete(int id);

    List<TipoComprobante> search(String comprobante);
}
