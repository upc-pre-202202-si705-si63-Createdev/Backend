package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITipoProductoRepository extends JpaRepository<TipoProducto,Integer>{

    @Query("FROM TipoProducto t WHERE t.tipoTipoProducto LIKE %:tipoTipoProducto%")
    List<TipoProducto> buscartipoproducto(@Param("tipoTipoProducto") String tipoproducto);
}