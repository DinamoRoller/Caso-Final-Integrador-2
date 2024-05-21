package Interfaz.Visitantes;

public abstract class Visitante {
    private String nombre;
    private int edad;

    public Visitante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    public abstract void comprarEntrada();

    protected String getApellido() {
        return null;
    }
}