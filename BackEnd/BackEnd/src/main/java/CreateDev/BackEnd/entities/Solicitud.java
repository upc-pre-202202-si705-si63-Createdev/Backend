package CreateDev.BackEnd.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Solicitud-diseño")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /*@OneToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "idArtesano", nullable = false)
    private Artesano artesano;*/

    @OneToOne
    private Pedido pedido;

    @Column(name = "fecha")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fecha;

    public Solicitud(){
    }

    public Solicitud(int id, LocalDate fecha) {
        this.id = id;
        //this.cliente = cliente;
        //this.artesano = artesano;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Artesano getArtesano() {
        return artesano;
    }

    public void setArtesano(Artesano artesano) {
        this.artesano = artesano;
    }*/

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido idpedido) {
        this.pedido = idpedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
