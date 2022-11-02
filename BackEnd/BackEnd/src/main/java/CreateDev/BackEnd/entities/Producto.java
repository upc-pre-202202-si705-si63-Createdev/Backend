package CreateDev.BackEnd.entities;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(name = "nameProducto",length = 45,nullable = false)
    private String nameProducto;

    @Column(name = "descripcionProducto",length = 45,nullable = false)
    private String descripcionProducto;

    @Column(name = "stockProducto",length = 45,nullable = false)
    private String stockProducto;

    @Column(name = "pesoProducto",length = 45,nullable = false)
    private String pesoProducto;

    @Column(name = "precioProducto",length = 45,nullable = false)
    private String precioProducto;

    @Column(name = "materialProducto",length = 45,nullable = false)
    private String materialProducto;

    @Column(name = "fechaProducto",length = 45,nullable = false)
    private String fechaProducto;

    public Producto() {
    }

    public Producto(int idProducto, String nameProducto, String descripcionProducto, String stockProducto, String pesoProducto, String precioProducto, String materialProducto, String fechaProducto) {
        this.idProducto = idProducto;
        this.nameProducto = nameProducto;
        this.descripcionProducto = descripcionProducto;
        this.stockProducto = stockProducto;
        this.pesoProducto = pesoProducto;
        this.precioProducto = precioProducto;
        this.materialProducto = materialProducto;
        this.fechaProducto = fechaProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNameProducto() {
        return nameProducto;
    }

    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(String stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getPesoProducto() {
        return pesoProducto;
    }

    public void setPesoProducto(String pesoProducto) {
        this.pesoProducto = pesoProducto;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getMaterialProducto() {
        return materialProducto;
    }

    public void setMaterialProducto(String materialProducto) {
        this.materialProducto = materialProducto;
    }

    public String getFechaProducto() {
        return fechaProducto;
    }

    public void setFechaProducto(String fechaProducto) {
        this.fechaProducto = fechaProducto;
    }
}
