package Interfaz.Visitantes;

public class Comprador extends Visitante {

    public Comprador(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void comprarEntrada() {
        System.out.println("El visitante " + this.getNombre() + " " + this.getApellido() + " está comprando una entrada.");
        // Implementación del método para comprar la entrada
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Edad: " + this.getEdad());
    }
}