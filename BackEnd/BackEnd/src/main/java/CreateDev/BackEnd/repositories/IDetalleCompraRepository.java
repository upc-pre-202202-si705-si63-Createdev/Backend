package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.Compra;
import CreateDev.BackEnd.entities.DetalleCompra;
import CreateDev.BackEnd.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDetalleCompraRepository extends JpaRepository<DetalleCompra,Integer> {
    @Query("FROM DetalleCompra d WHERE d.idDetalleCompra = :idDetalleCompra")
    List<DetalleCompra> buscarNombre(@Param("idDetalleCompra") int idDetalleCompra);
}
