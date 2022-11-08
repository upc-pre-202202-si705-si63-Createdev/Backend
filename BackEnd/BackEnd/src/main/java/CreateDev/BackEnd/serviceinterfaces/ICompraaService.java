package CreateDev.BackEnd.serviceinterfaces;

import CreateDev.BackEnd.entities.Compraa;


import java.util.List;

public interface ICompraaService {

    public void insert(Compraa compraa);

    List<Compraa> list();

    public void delete(int id);

    List<Compraa> search(String nombre_usuario);

}
