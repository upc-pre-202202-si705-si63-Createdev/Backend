package CreateDev.BackEnd.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import CreateDev.BackEnd.entities.Cliente;
@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

        @Query("FROM Cliente U WHERE U.usuario.nameUsuarios like %:nameUsuarios%")
        List<Cliente> buscarUsuario(@Param("nameUsuarios")String nameUsuarios);

        @Query("from Cliente U where U.dni like %:dni%") List<Cliente> buscarCliente(@Param("dni")String dni);




}
