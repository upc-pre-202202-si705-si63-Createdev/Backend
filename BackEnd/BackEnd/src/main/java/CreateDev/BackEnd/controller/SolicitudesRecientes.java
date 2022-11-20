package CreateDev.BackEnd.controller;

public class SolicitudesRecientes {

    private String nombre_pedido;
    private String caracteristicas;
    private String estado;
    private String fecha;

    public SolicitudesRecientes() {
    }

    public SolicitudesRecientes(String nombre_pedido, String caracteristicas, String estado, String fecha) {
        this.nombre_pedido = nombre_pedido;
        this.caracteristicas = caracteristicas;
        this.estado = estado;
        this.fecha = fecha;
    }

    public String getNombre_pedido() {
        return nombre_pedido;
    }

    public void setNombre_pedido(String nombre_pedido) {
        this.nombre_pedido = nombre_pedido;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
