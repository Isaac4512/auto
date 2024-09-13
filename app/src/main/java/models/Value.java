package models;


public class Value {
    private String nombre;
    private String estado;
    private int año;
    private int precio;
    private String delivery;
    private int recargo;

    public Value(){
        nombre = "Hyundai Elentra";
        estado = "Nuevo";
        año = 2022 ;
        precio = 12000000;
        delivery = "Envio a Domicilio";
        recargo = 2250;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public int getRecargo() {
        return recargo;
    }

    public void setRecargo(int recargo) {
        this.recargo = recargo;
    }

    public int SUMS(int pr, int re){
        int v = pr + re;
        return v;
    }
}
