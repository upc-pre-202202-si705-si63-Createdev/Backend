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

    @Query(value = "SELECT name_usuarios, email_usuarios, artesano.provincia, count(solicitud.id_artesano) FROM usuario INNER JOIN artesano ON artesano.id_usuarios = usuario.id_usuarios INNER JOIN solicitud ON solicitud.id_artesano = artesano.id_artesano GROUP BY name_usuarios, email_usuarios, artesano.provincia", nativeQuery = true)
    List<String[]> buscarSolicitudesArtesanos();

    @Query(value = "SELECT nombre, caracteristicas, estado, solicitud.fecha FROM pedido JOIN solicitud ON solicitud.id_pedido = pedido.id ORDER BY solicitud.fecha DESC", nativeQuery = true)
    List<String[]> buscarSolicitudesRecientes();
}
