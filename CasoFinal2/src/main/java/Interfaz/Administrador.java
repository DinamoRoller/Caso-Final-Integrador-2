package Interfaz;

public class Administrador extends Trabajador {
    private String nombre;
    private String apellido;
    private String area;

    public Administrador(String nombre, String apellido, String area) {
        super(nombre, apellido, "Administrador", 0.0);
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
    }

    @Override
    public void trabajar() {
        System.out.println(this.nombre + " " + this.apellido + " está administrando los recursos del zoológico.");
        // Implementar lógica para administrar los recursos del zoológico
        administrarRecursos();
    }
    // Método para administrar los recursos del zoológico
    private void administrarRecursos() {
        // Lógica específica de administración de recursos del zoológico
        System.out.println("Revisando suministros en el área de " + area + "...");
        // Por ejemplo, se puede verificar la cantidad de comida y agua disponibles
        // y realizar pedidos de suministros si es necesario
        System.out.println("Haciendo pedidos de comida y agua...");
        // Lógica para realizar pedidos de suministros
        System.out.println("Gestionando mantenimiento de hábitats...");
        // Lógica para programar y realizar mantenimiento en los hábitats
        System.out.println("Registrando estado de hábitats...");
        // Lógica para registrar el estado de los hábitats (temperatura, humedad, limpieza, etc.)
        System.out.println("Administración de personal...");
        // Lógica para asignar tareas al personal y gestionar horarios
        System.out.println("¡Recursos del zoológico administrados en el área de " + area + "!");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}