package CreateDev.BackEnd.entities;

public class ProductosPorArtesano {

    private String idArtesano;
    private String nombreUsuario;
    private String cantidadProductos;

    public ProductosPorArtesano() {
    }

    public ProductosPorArtesano(String idArtesano, String nombreUsuario, String cantidadProductos) {
        this.idArtesano = idArtesano;
        this.nombreUsuario = nombreUsuario;
        this.cantidadProductos = cantidadProductos;
    }

    public String getIdArtesano() {
        return idArtesano;
    }

    public void setIdArtesano(String idArtesano) {
        this.idArtesano = idArtesano;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(String cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
}
