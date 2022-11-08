package CreateDev.BackEnd.serviceinterfaces;


import java.util.List;
import java.util.Optional;

import CreateDev.BackEnd.entities.Artesano;
public interface IArtesanoService {

    public boolean insertar(Artesano artesano);
    public void eliminar(int idArtesano);
    Optional<Artesano> listarID(int idArtesano);
    List<Artesano> listar();
    List<Artesano> buscarUsuario(String nameUsuarios);
    List<Artesano> buscarArtesano(String provincia);
}
