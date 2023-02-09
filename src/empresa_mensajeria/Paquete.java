package empresa_mensajeria;

public class Paquete {

    String direccionOrigen;
    String direccionDestino;
    double peso;
    double costo;
    boolean entregado;
    int id;

    public Paquete() {
    }

    public Paquete(String direccionOrigen, String direccionDestino, double peso, double costo, boolean entregado, int id) {
        this.direccionOrigen = direccionOrigen;
        this.direccionDestino = direccionDestino;
        this.peso = peso;
        this.costo = costo;
        this.entregado = entregado;
        this.id = id;
    }

    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
