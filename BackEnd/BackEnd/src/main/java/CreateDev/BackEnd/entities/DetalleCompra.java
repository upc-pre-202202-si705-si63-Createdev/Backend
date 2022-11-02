package CreateDev.BackEnd.entities;

import javax.persistence.*;


@Entity
@Table(name = "DetalleCompra")
public class DetalleCompra {

    public DetalleCompra(int idDetalleCompra, Producto producto, float precio_unitario, int cantidad, Compra compra) {
        this.idDetalleCompra = idDetalleCompra;
        this.producto = producto;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
        this.compra = compra;
    }

    public DetalleCompra() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleCompra;

    @ManyToOne
    @JoinColumn(name = "idProducto",nullable = false)
    private Producto producto;

    @Column(name = "precio_unitario",length = 60,nullable = false)
    private float precio_unitario;

    @Column(name = "cantidad",length = 60,nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idCompra",nullable = false)
    private Compra compra;

    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
