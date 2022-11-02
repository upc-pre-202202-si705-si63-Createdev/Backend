package CreateDev.BackEnd.entities;

import javax.persistence.*;

@Entity
@Table(name = "Compra")
public class Compra {

    public Compra(){

    }

    public Compra(int id, String nombre_usuario, int cantidad, float precio_total, float peso_total, int tipo_comprobante, String fecha_cancelacion) {
        this.idCompra = id;
        this.nombre_usuario = nombre_usuario;
        this.cantidad = cantidad;
        this.precio_total = precio_total;
        this.peso_total = peso_total;
        this.tipo_comprobante = tipo_comprobante;
        this.fecha_cancelacion = fecha_cancelacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompra;

    @Column(name = "nombre_usuario",length = 55,nullable = false)
    private String nombre_usuario;

    @Column(name = "cantidad",length = 55,nullable = false)
    private int cantidad;

    @Column(name = "precio_total",length = 55,nullable = false)
    private float precio_total;

    @Column(name = "peso_total",length = 55,nullable = false)
    private float peso_total;

    @Column(name = "tipo_comprobante",length = 55,nullable = false)
    private int tipo_comprobante;

    @Column(name = "fecha_cancelacion",length = 55,nullable = false)
    private String fecha_cancelacion;

    public int getId() {
        return idCompra;
    }

    public void setId(int id) {
        this.idCompra = id;
    }

    public String getNombre() {
        return nombre_usuario;
    }

    public void setNombre(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }

    public float getPeso_total() {
        return peso_total;
    }

    public void setPeso_total(float peso_total) {
        this.peso_total = peso_total;
    }

    public int getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(int tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getFecha_cancelacion() {
        return fecha_cancelacion;
    }

    public void setFecha_cancelacion(String fecha_cancelacion) {
        this.fecha_cancelacion = fecha_cancelacion;
    }


}
