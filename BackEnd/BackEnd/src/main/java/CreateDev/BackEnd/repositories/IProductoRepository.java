package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductoRepository extends JpaRepository<Producto,Integer> {

        @Query("FROM Producto p WHERE p.nameProducto LIKE %:nameProducto%")
        List<Producto> buscarNombre(@Param("nameProducto") String nameProducto);

        @Query(value = "select lugarfabricacion_producto Ubicacion, count(producto.id_producto) from producto group by lugarfabricacion_producto", nativeQuery = true)
        List<String[]> buscarSolicitudesProducto();

        @Query(value = "select producto.artesano_producto idArtesano, usuario.name_usuarios Nombre, count(producto.id_producto) CantidadProductos from producto join artesano on producto.artesano_producto=artesano.id_artesano join usuario on artesano.id_artesano=usuario.id_usuarios where producto.fecha_producto BETWEEN '2022-01-01T00:00:00' and '2022-12-31T00:00:00' group by lugarfabricacion_producto, producto.artesano_producto, artesano.informacion, usuario.name_usuarios\n", nativeQuery = true)
        List<String[]> buscarProductosPorArtesano();

}
