package CreateDev.BackEnd.entities;

public class SolicitudesArtesano {

    private String nombreUsuario;
    private String emailUsuario;
    private String provincia;
    private String cantidad;

    public SolicitudesArtesano() {
    }

    public SolicitudesArtesano(String nombreUsuario, String emailUsuario, String provincia, String cantidad) {
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.provincia = provincia;
        this.cantidad = cantidad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
