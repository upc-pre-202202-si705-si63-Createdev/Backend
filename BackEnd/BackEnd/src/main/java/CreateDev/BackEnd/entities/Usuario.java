package CreateDev.BackEnd.entities;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarios ;

    @Column(name = "nameUsuarios",length = 45,nullable = false)
    private String nameUsuarios;

    @Column(name = "emailUsuarios",length = 45,nullable = false)
    private String emailUsuarios;

    @Column(name = "lastnameUsuarios",length = 45,nullable = false)
    private String lastnameUsuarios;

    @Column(name = "contrasenaUsuarios",length = 45,nullable = false)
    private String contrasenaUsuarios;

    @Column(name = "direccionUsuarios",length = 45,nullable = false)
    private String direccionUsuarios;

    @Column(name = "telefonoUsuarios",length = 45,nullable = false)
    private String telefonoUsuarios;

    public Usuario() {
    }

    public Usuario(int idUsuarios, String nameUsuarios, String emailUsuarios,String lastnameUsuarios,String contrasenaUsuarios,String direccionUsuarios,String telefonoUsuarios) {

        this.idUsuarios = idUsuarios;
        this.nameUsuarios = nameUsuarios;
        this.emailUsuarios = emailUsuarios;
        this.lastnameUsuarios = lastnameUsuarios;
        this.contrasenaUsuarios = contrasenaUsuarios;
        this.direccionUsuarios = direccionUsuarios;
        this.telefonoUsuarios = telefonoUsuarios;

    }
    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNameUsuarios() {
        return nameUsuarios;
    }

    public void setNameUsuarios(String nameUsuarios) {
        this.nameUsuarios = nameUsuarios;
    }

    public String getEmailUsuarios() {
        return emailUsuarios;
    }

    public void setEmailUsuarios(String emailUsuarios) {
        this.emailUsuarios = emailUsuarios;
    }

    public String getLastnameUsuarios() {
        return lastnameUsuarios;
    }

    public void setLastnameUsuarios(String lastnameUsuarios) {
        this.lastnameUsuarios = lastnameUsuarios;
    }

    public String getContrasenaUsuarios() {
        return contrasenaUsuarios;
    }

    public void setContrasenaUsuarios(String contrasenaUsuarios) {
        this.contrasenaUsuarios = contrasenaUsuarios;
    }

    public String getDireccionUsuarios() {
        return direccionUsuarios;
    }

    public void setDireccionUsuarios(String direccionUsuarios) {
        this.direccionUsuarios = direccionUsuarios;
    }
    public String getTelefonoUsuarios() {
        return telefonoUsuarios;
    }

    public void setTelefonoUsuarios(String telefonoUsuarios) {
        this.telefonoUsuarios = telefonoUsuarios;
    }

}