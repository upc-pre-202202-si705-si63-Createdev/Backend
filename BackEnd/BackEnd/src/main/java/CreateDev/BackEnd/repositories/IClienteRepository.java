package CreateDev.BackEnd.repositories;
import java.util.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import CreateDev.BackEnd.entities.Cliente;

public interface IClienteRepository {

    @Repository
    public interface Icliente extends JpaRepository<Cliente, Integer>{
        @Query("from Cliente U where u.usuario.nameUsuarios like %:nameUsuarios%")
        List<Cliente> buscarusuario(@Param("nameUsuarios")String nameUsuarios);

        @Query("from Cliente U where u.dni like %:dni%")
        List<Cliente> buscarcliente(@Param("dni")String dni);

    }
}
