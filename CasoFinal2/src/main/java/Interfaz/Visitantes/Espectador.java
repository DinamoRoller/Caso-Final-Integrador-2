package Interfaz.Visitantes;
public class Espectador extends Visitante {

    private String[] animalesPreferidos;

    public Espectador(String nombre, String apellido, int edad, String[] animalesPreferidos) {
        super(nombre, apellido, edad);
        this.animalesPreferidos = animalesPreferidos;
    }

    @Override
    public void comprarEntrada() {
        System.out.println("El visitante " + this.getNombre() + " " + this.getApellido() + " está comprando una entrada.");
        // Implementación del método para comprar la entrada
    }

    public void mostrarAnimalesPreferidos() {
        System.out.println("Animales preferidos del visitante " + this.getNombre() + ":");
        for (String animal : this.animalesPreferidos) {
            System.out.println("- " + animal);
        }
    }
}