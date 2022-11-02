package CreateDev.BackEnd.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoProducto")
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoProducto;

    @Column(name = "tipoTipoProducto",length = 45,nullable = false)
    private String tipoTipoProducto;

    public TipoProducto() {
    }

    public TipoProducto(int idTipoProducto, String tipoTipoProducto) {
        this.idTipoProducto = idTipoProducto;
        this.tipoTipoProducto = tipoTipoProducto;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getTipoTipoProducto() {
        return tipoTipoProducto;
    }

    public void setTipoTipoProducto(String tipoTipoProducto) {
        this.tipoTipoProducto = tipoTipoProducto;
    }
}
