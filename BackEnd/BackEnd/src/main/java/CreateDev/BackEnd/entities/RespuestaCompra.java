package CreateDev.BackEnd.entities;

public class RespuestaCompra {


   public  RespuestaCompra(){}

    public RespuestaCompra(String nombreCompra, String cantidad, String precio_unitario, String tipo_producto) {
        this.nombreCompra = nombreCompra;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.tipo_producto = tipo_producto;
    }

    private String nombreCompra;
    private String cantidad;
    private String precio_unitario;
    private String tipo_producto;

    public String getNombreCompra() {
        return nombreCompra;
    }

    public void setNombreCompra(String nombreCompra) {
        this.nombreCompra = nombreCompra;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(String precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }
}
