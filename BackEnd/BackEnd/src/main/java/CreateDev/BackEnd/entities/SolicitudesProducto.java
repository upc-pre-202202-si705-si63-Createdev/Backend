package CreateDev.BackEnd.entities;

public class SolicitudesProducto {

    private String ubicacionProducto;
    private String cantidad;

    public SolicitudesProducto() {
    }

    public SolicitudesProducto(String ubicacionProducto, String cantidad) {
        this.ubicacionProducto = ubicacionProducto;
        this.cantidad = cantidad;
    }

    public String getUbicacionProducto() {
        return ubicacionProducto;
    }

    public void setUbicacionProducto(String ubicacionProducto) {
        this.ubicacionProducto = ubicacionProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}


