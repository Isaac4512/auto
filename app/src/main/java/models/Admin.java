package models;

public class Admin {

    private int id_usuario;
    private String usuario;
    private String clave;

    public Admin(){
        id_usuario = 1;
        usuario = "auto";
        clave = "2024";
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
