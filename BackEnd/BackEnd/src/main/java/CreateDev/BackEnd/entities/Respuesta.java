package CreateDev.BackEnd.entities;

public class Respuesta {

    private String clientes;
    private String cantidadpe;


    public Respuesta(String clientes, String cantidadpe) {
        this.clientes = clientes;
        this.cantidadpe = cantidadpe;
    }

    public Respuesta(){

    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    public String getCantidadpe() {
        return cantidadpe;
    }

    public void setCantidadpe(String cantidadpe) {
        this.cantidadpe = cantidadpe;
    }
}
