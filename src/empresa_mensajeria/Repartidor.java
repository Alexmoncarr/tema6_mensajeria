package empresa_mensajeria;

public class Repartidor {

    String nombre;
    int id;
    enum Vehiculo {bicicleta, motocicleta, camión}
    Vehiculo vehiculo;
    boolean disponibilidad = true;
    Paquete paquete=null;

    public Repartidor() {
    }

    public Repartidor(String nombre, int id,String vehiculo, boolean disponibilidad) {
        this.nombre = nombre;
        this.id = id;
        this.vehiculo = Vehiculo.valueOf(vehiculo);
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
