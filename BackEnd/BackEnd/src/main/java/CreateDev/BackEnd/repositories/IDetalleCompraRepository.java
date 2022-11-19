package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.Compraa;
import CreateDev.BackEnd.entities.DetalleCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDetalleCompraRepository extends JpaRepository<DetalleCompra,Integer> {
    @Query("FROM DetalleCompra c WHERE c.idProducto.nameProducto LIKE %:nameProducto%")
    List<DetalleCompra> buscarNombre(@Param("nameProducto") String nameProducto);

    @Query("from DetalleCompra dc where dc.id = :id")
    List<DetalleCompra> buscarId(@Param("id") int id);
}
