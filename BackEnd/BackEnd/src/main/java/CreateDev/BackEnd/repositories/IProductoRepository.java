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
}
