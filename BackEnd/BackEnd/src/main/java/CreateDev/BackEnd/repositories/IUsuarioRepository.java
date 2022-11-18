package CreateDev.BackEnd.repositories;


import CreateDev.BackEnd.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
	
	@Query("FROM Usuario p WHERE p.nameUsuarios LIKE %:nameUsuarios%")
	 List<Usuario> buscarNombre(@Param("nameUsuarios") String nameUsuarios);

	@Query(value = "select * from usuario r where r.email_usuarios like '%@gmail.com'",nativeQuery = true)
	List<Usuario> buscarcorreo();


}
