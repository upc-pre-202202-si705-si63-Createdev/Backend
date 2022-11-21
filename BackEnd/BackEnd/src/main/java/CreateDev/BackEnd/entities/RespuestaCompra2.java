package CreateDev.BackEnd.entities;

public class RespuestaCompra2 {

    public RespuestaCompra2(){

    }

    public RespuestaCompra2(String cliente, String cantidad, String nombreArtesano) {
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.nombreArtesano = nombreArtesano;
    }

    private String cliente;
    private String cantidad;
    private String nombreArtesano;


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreArtesano() {
        return nombreArtesano;
    }

    public void setNombreArtesano(String nombreArtesano) {
        this.nombreArtesano = nombreArtesano;
    }
}
