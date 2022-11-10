package CreateDev.BackEnd.servicesimpls;

import CreateDev.BackEnd.entities.Compraa;
import CreateDev.BackEnd.repositories.ICompraaRepository;
import CreateDev.BackEnd.serviceinterfaces.ICompraaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraaServiceImpl implements ICompraaService {

    @Autowired
    private ICompraaRepository cR;

    @Override
    public void insert(Compraa compraa){cR.save(compraa); }

    @Override
    public List<Compraa> list() {return cR.findAll();}

    @Override
    public void delete(int id) {cR.deleteById(id);}

    @Override
    public List<Compraa> search(String nombre_usuario) {return cR.buscarNombre(nombre_usuario);}

    @Override
    public Optional<Compraa> listarId(int idCompraa) {
        return cR.findById(idCompraa);
    }
}
