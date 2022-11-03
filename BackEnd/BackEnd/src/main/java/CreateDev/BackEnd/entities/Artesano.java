package CreateDev.BackEnd.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Artesano")
public class Artesano implements Serializable {
    private static final long serialVersionUID = 1L;
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

    public Artesano (int idArtesano, String provincia, String informacion, Usuario usuarios){
        this.idArtesano=idArtesano;
        this.provincia=provincia;
        this.informacion=informacion;
        this.usuarios=usuarios;
    }
    public Artesano(){
        super();
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

