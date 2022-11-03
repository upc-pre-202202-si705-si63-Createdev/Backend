package CreateDev.BackEnd.servicesimpls;

import java.util.Date;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;


import CreateDev.BackEnd.entities.Artesano;
import CreateDev.BackEnd.repositories.IArtesanoRepository;
import CreateDev.BackEnd.serviceinterfaces.IArtesanoService;

@RestController
public class ArtesanoServiceImpl implements IArtesanoService{
    @Autowired
    private IArtesanoRepository dArtesano;

    @Override
    @Transactional
    public boolean insertar(Artesano artesano){
        Artesano objartesano = dArtesano.save(artesano);
        if (objartesano == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    @Transactional
    public void eliminar(int idArtesano) {

        dArtesano.deleteById(idArtesano);

    }

    @Override
    public Optional<Artesano> listarid(int idArtesano) {

        return dArtesano.findById(idArtesano);
    }

    @Override
    public List<Artesano> listar() {
        return dArtesano.findAll();
    }

    @Override
    public List<Artesano> buscarUsuario(String nameUsuarios) {
        return dArtesano.buscarUsuario(nameUsuarios);
    }

    @Override
    public List<Artesano> buscarArtesano(String provincia) {
        return dArtesano.buscarArtesano(provincia);
    }

}
