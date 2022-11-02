package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.TipoComprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ITipoComprobanteRepository extends JpaRepository<TipoComprobante,Integer>{

    @Query("FROM TipoComprobante t WHERE t.comprobante LIKE %:comprobante%")
    List<TipoComprobante> buscarcomprobante(@Param("comprobante") String comprobante);
}