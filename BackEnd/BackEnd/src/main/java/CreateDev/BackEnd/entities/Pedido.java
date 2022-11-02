package CreateDev.BackEnd.entities;

import javax.persistence.*;

@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

    @Column(name = "estado", length = 45, nullable = false)
    private String estado;

    @Column(name = "caracteristicas", length = 45, nullable = false)
    private String caracteristicas;


    public Pedido() {
    }

    public Pedido(int id, String nombre, String estado, String caracteristicas) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.caracteristicas = caracteristicas;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
