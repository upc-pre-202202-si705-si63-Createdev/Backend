package CreateDev.BackEnd.repositories;

import CreateDev.BackEnd.entities.Compra;
import CreateDev.BackEnd.entities.DetalleCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleCompraRepository extends JpaRepository<DetalleCompra,Integer> {

}
