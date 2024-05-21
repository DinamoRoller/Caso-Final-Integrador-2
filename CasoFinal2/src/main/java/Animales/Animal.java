package Animales;

public abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;
    public double salud;
    private double cantidadAlimento;

    public Animal(String nombre, int edad, double peso, double salud) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.salud = salud;
    }

    public void actualizarCantidadAlimento(double cantidadAlimento) {
        // Implementa la lógica según sea necesario para actualizar la cantidad de alimento del animal
        // Por ejemplo, podrías simplemente asignar la nueva cantidad directamente
        this.cantidadAlimento = cantidadAlimento;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public void comer() {
        // Lógica para que el animal coma
        this.salud += 10;
    }

    public void dormir() {
        // Lógica para que el animal duerma
        this.salud += 5;
    }

    public void jugar() {
        // Lógica para que el animal juegue
        this.salud -= 5;
    }

    public abstract void emitirSonido();
    public abstract String getTipo();
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", salud=" + salud +
                ", cantidadAlimento=" + cantidadAlimento +
                '}';

    }

    public abstract String getColor();

    public abstract double getEnvergadura();

    public abstract double getLongitud();

    public abstract boolean esVenenoso();

    public abstract int getNumPatas();
}