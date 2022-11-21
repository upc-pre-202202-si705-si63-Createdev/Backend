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

    @Query(value = "select c.nombre_usuario, dc.cantidad,dc.precio_unitario ,tp.tipo_tipo_producto from detalle_compra as dc inner join compraa as c ON c.id = dc.id_compra inner join producto as p on dc.id_producto = p.id_producto inner join tipo_producto as tp on tp.id_tipo_producto = p.tipoproducto_producto",nativeQuery = true)
    List<String[]> query1();
}
