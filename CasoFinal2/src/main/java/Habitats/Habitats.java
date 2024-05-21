package Habitats;

import Animales.Animal;
import java.util.List;

public abstract class Habitats {
    private String identificador;
    private double temperatura;
    private double humedad;
    private double limpieza;
    private List<Animal> listaAnimales;

    public Habitats(String identificador, double temperatura, double humedad, double limpieza, List<Animal> listaAnimales) {
        this.identificador = identificador;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        this.listaAnimales = listaAnimales;
    }

    public Habitats(String identificador, double temperatura, double humedad) {
    }

    protected Habitats() {
    }

    public void realizarLimpieza() {
        // Implementación predeterminada del método de limpieza
        System.out.println("Realizando limpieza en el hábitat...");
    }

    public void realizarReparaciones() {

        System.out.println("Realizando reparaciones en el hábitat...");
    }

    public void realizarRenovaciones() {

        System.out.println("Realizando renovaciones en el hábitat...");
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getTemperatura() {
        return (int) temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public double getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(double limpieza) {
        this.limpieza = limpieza;
    }

    public abstract void analizarCondiciones();

    public String getNombre() {
        return String.valueOf(0);
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    // Método para verificar si el hábitat contiene el animal con el nombre dado
    public boolean contieneAnimal(String nombreAnimal) {
        if (this.listaAnimales != null) {
            for (Animal animal : this.listaAnimales) {
                if (animal.getNombre().equalsIgnoreCase(nombreAnimal)) {
                    return true;
                }
            }
        }
        return false;
    }
}