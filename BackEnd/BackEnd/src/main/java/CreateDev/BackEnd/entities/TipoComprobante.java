package CreateDev.BackEnd.entities;

import javax.persistence.*;

@Entity
@Table(name = "tipocomprobante")
public class TipoComprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "comprobante", length = 45, nullable = false)
    private String comprobante;


    public TipoComprobante() {
    }

    public TipoComprobante (int id, String comprobante) {
        this.id = id;
        this.comprobante = comprobante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcomprobante() {
        return comprobante;
    }

    public void setcomprobante(String comprobante) {
        this.comprobante = comprobante;
    }
}