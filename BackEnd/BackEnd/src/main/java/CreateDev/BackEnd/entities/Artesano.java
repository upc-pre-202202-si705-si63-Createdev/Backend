package CreateDev.BackEnd.entities;

import javax.persistence.*;

@Entity
@Table(name = "Artesano")
public class Artesano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArtesano;

    @Column(name="provincia", length = 60,nullable = false)
    private String provincia;

    @Column(name="informacion", length = 60,nullable = false)
    private String informacion;
    @ManyToOne
    @JoinColumn(name = "idUsuarios", nullable = false)
    private Usuario usuarios;
    public Artesano(){
    }
    public Artesano (int idArtesano, String provincia, String informacion, Usuario usuarios){
        this.idArtesano=idArtesano;
        this.provincia=provincia;
        this.informacion=informacion;
        this.usuarios=usuarios;
    }

    public int getIdArtesano(){
        return idArtesano;
    }
    public void setIdArtesano(int idArtesano){
        this.idArtesano=idArtesano;
    }
    public String getProvincia(){
        return provincia;
    }
    public void setProvincia(String provincia){this.provincia=provincia;}

    public String getInformacion(){return informacion;}
    public void setInformacion(String informacion){this.informacion=informacion;}

    public Usuario getUsuario() {
        return usuarios;
    }

    public void setUsuario(Usuario usuario) {
        this.usuarios = usuario;
    }
}

