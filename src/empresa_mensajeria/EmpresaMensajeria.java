package empresa_mensajeria;

import java.util.ArrayList;

public class EmpresaMensajeria extends Repartidor {

    String nombre;
    ArrayList<Paquete>paquetes;
    ArrayList<Repartidor>repartidores;


    public EmpresaMensajeria() {
    }

    public EmpresaMensajeria(String nombre, ArrayList<Paquete> paquetes, ArrayList<Repartidor> repartidores) {
        this.nombre = nombre;
        this.paquetes = paquetes;
        this.repartidores = repartidores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public ArrayList<Repartidor> getRepartidores() {
        return repartidores;
    }

    public void setRepartidores(ArrayList<Repartidor> repartidores) {
        this.repartidores = repartidores;
    }



    public void agregarPaquete (Paquete paquete) {
        this.paquetes.add(paquete);
    }
    public void agregarRepartidores (Repartidor repartidores) {
        this.repartidores.add(repartidores);
    }

    public String asignarPaquete (Paquete paquete) {
        String resultado=null;
        for (Repartidor repartidor:repartidores) {
            if (isDisponibilidad()==true){
                setPaquete(paquete);
                resultado="Paquete asignado";
            }else {
                resultado = "No hay repartidores disponibles";
            }
            return resultado;
        }
        return resultado;
    }
    public String entregarPaquete(String direccion) {
        String res="null";
        setDisponibilidad(false);
        if (direccion==paquete.direccionDestino) {
            paquete.entregado=true;
            setDisponibilidad(true);
            res="Paquete entregado y repartidor disponible";
        }else{
            res="No estás en la dirección correcta";
        }
        return res;
    }

    public String imprimirPaquetes() {
        String res="null";
        for (Paquete paquete : paquetes) {
            res = String.valueOf(paquete);
        }
        return res;
    }
    public String imprimirRepartidores() {
        String res = "null";
        for (Repartidor repartidor : repartidores) {
            res = String.valueOf(repartidores);
        }
        return res;
    }

}

