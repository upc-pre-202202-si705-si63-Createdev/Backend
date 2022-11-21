package CreateDev.BackEnd.entities;

public class CantidadProxSol {

    private  String provincia;
    private  String cantidadps;

    public CantidadProxSol(String provincia, String cantidadps){
        this.provincia=provincia;
        this.cantidadps=cantidadps;
    }

    public CantidadProxSol(){

    }

    public String getProvincia(){ return provincia;}
    public void setProvincia (String provincia){this.provincia=provincia;}

    public String getCantidadps() { return cantidadps;}
    public void setCantidadps(String cantidadps){this.cantidadps=cantidadps;}
}
