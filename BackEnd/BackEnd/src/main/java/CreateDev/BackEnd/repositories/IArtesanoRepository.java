package CreateDev.BackEnd.repositories;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import CreateDev.BackEnd.entities.Artesano;
@Repository
public interface IArtesanoRepository extends JpaRepository<Artesano, Integer>{
    @Query("FROM Artesano a WHERE a.usuarios.nameUsuarios like %:nameUsuarios%")
    List<Artesano> buscarUsuario(@Param("nameUsuarios")String nameUsuarios);

    @Query("from Artesano a where a.provincia like %:provincia%")
    List<Artesano> buscarArtesano (@Param("provincia")String provincia);

    @Query(value = "select * from artesano r where r.provincia like '%Lima'",nativeQuery = true)
    List<Artesano>buscarNprovincia();
}
