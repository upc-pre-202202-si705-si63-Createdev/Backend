package CreateDev.BackEnd.entities;

import javax.persistence.*;

@Table
@Entity(name="Compraa")
public class Compraa {

    public Compraa(){}

    public Compraa(int id, String nombre_usuario, int cantidad_total, float peso_total, float precio_total, int tipo_comprobante, String fecha_cancelacion) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.cantidad_total = cantidad_total;
        this.peso_total = peso_total;
        this.precio_total = precio_total;
        this.tipo_comprobante = tipo_comprobante;
        this.fecha_cancelacion = fecha_cancelacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre_usuario",length = 45,nullable = false)
    private String nombre_usuario;

    @Column(name = "cantidad_total",length = 45,nullable = false)
    private int cantidad_total;

    @Column(name = "peso_total",length = 45,nullable = false)
    private float peso_total;

    @Column(name = "precio_total",length = 45,nullable = false)
    private float precio_total;

    @Column(name = "tipo_comprobante",length = 45,nullable = false)
    private int tipo_comprobante;

    @Column(name = "fecha_cancelacion",length = 45,nullable = false)
    private String fecha_cancelacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(int cantidad_total) {
        this.cantidad_total = cantidad_total;
    }

    public float getPeso_total() {
        return peso_total;
    }

    public void setPeso_total(float peso_total) {
        this.peso_total = peso_total;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
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
