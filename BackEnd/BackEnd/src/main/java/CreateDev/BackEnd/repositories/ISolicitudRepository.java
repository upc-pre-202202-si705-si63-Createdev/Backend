package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.Pedido;
import CreateDev.BackEnd.entities.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ISolicitudRepository extends JpaRepository<Solicitud, Integer> {

    @Query("from Solicitud s where s.pedido.nombre like %:nombre%")
    List<Solicitud> buscarPedido(@Param("nombre") String nombre);

    List<Solicitud> findByfecha(Date fecha);

    @Query(value = "SELECT r.provincia, COUNT(v.id) FROM solicitud v INNER JOIN artesano r ON v.id_artesano = r.id_artesano GROUP by r.provincia",nativeQuery = true)
    List<String[]> buscarCantidadSxP();
}
