package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.Compraa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ICompraaRepository extends JpaRepository<Compraa,Integer> {
    @Query("FROM Compraa c WHERE c.nombre_usuario LIKE %:nombre_usuario%")
    List<Compraa> buscarNombre(@Param("nombre_usuario") String nombre_usuario);
}
