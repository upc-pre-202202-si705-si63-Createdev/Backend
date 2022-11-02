package CreateDev.BackEnd.entities;
import java.io.Serializable;


import javax.persistence.*;


@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column(name="dni", length = 60,nullable = false)
    private String dni;

    @ManyToOne
    @JoinColumn(name = "idUsuarios", nullable = false)
    private Usuario usuarios;

    public Cliente(int idCliente, String dni, Usuario usuarios){
        this.idCliente=idCliente;
        this.dni=dni;
        this.usuarios=usuarios;
    }
    public Cliente(){
        super();
    }
    public int getIdCliente(){
        return idCliente;
    }
    public void setIdCliente(int idCliente){
        this.idCliente=idCliente;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni=dni;
    }

    public Usuario getUsuario() {
        return usuarios;
    }

    public void setUsuario(Usuario usuario) {
        this.usuarios = usuario;
    }
}
