package Interfaz;

public class Mantenimiento extends Trabajador {
    private String nombre;
    private String apellido;
    private String especialidad;

    public Mantenimiento(String nombre, String apellido, String especialidad) {
        super(nombre, apellido, "Mantenimiento", 0.0);
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }

    @Override
    public void trabajar() {
        System.out.println(this.nombre + " " + this.apellido + " está realizando mantenimiento en los hábitats.");
        // Implementar lógica para realizar mantenimiento en los hábitats
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
}