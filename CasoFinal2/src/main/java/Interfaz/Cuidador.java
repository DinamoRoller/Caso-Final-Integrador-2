package Interfaz;

import Animales.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cuidador extends Trabajador {
    private String nombre;
    private String apellido;
    private String especialidad;
    private List<Animal> animalesACargo;

    public Cuidador(String nombre, String apellido, String especialidad) {
        super(nombre, apellido, "Cuidador", 0.0);
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.animalesACargo = new ArrayList<>();
    }

    public void agregarAnimalACargo(Animal animal) {
        this.animalesACargo.add(animal);
    }

    public void quitarAnimalDeCargo(Animal animal) {
        this.animalesACargo.remove(animal);
    }

    @Override
    public void trabajar() {
        System.out.println(this.nombre + " " + this.apellido + " está registrando la alimentación de los animales a su cargo.");
        for (Animal animal : this.animalesACargo) {
            animal.comer();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Animal> getAnimalesACargo() {
        return animalesACargo;
    }

    public void setAnimalesACargo(List<Animal> animalesACargo) {
        this.animalesACargo = animalesACargo;
    }
}