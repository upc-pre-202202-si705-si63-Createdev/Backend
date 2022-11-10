package CreateDev.BackEnd.entities;


import javax.persistence.*;

@Table
@Entity(name = "DetalleCompra")
public class DetalleCompra {

    public DetalleCompra(){}

    public DetalleCompra(int id, Compraa idCompra, int cantidad, Producto idProducto, float precio_unitario) {
        this.id = id;
        this.idCompra = idCompra;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        this.precio_unitario = precio_unitario;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idCompra", nullable = false)
    private Compraa idCompra;

    @Column(name = "cantidad", length = 60, nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto idProducto;

    @Column(name = "precio_unitario", length = 60, nullable = false)
    private float precio_unitario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Compraa getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compraa idCompra) {
        this.idCompra = idCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

}
