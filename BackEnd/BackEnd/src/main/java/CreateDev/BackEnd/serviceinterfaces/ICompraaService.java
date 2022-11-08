package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Compraa;


import java.util.List;
import java.util.Optional;

public interface ICompraaService {

    public void insert(Compraa compraa);

    List<Compraa> list();

    public void delete(int id);

    List<Compraa> search(String nombre_usuario);

    public Optional<Compraa> listarId(int idCompraa);

}
