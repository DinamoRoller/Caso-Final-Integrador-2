package Habitats; // Asegúrate de definir el paquete correcto si es necesario

public class HabitatsAcuaticos extends Habitats{
    private String nombre;
    private int capacidad;
    private int temperatura;
    private int nivelAgua;
    private String descripcion;

    public HabitatsAcuaticos(String nombre, int capacidad, int temperatura, int nivelAgua, String descripcion) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.temperatura = temperatura;
        this.nivelAgua = nivelAgua;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public int getTemperatura() {
        return temperatura;
    }

    @Override
    public void analizarCondiciones() {
        if (this.getTemperatura() < 10 || this.getTemperatura() > 30) {
            // Tomar ciertas acciones si la temperatura está fuera del rango deseado
        }

    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void realizarLimpieza() {
        // Implementar lógica para limpiar el hábitat acuático
        System.out.println("Realizando limpieza en el hábitat acuático: " + getNombre());
    }
    public void realizarReparaciones() {
        // Implementación para realizar reparaciones en el hábitat acuático
        System.out.println("Realizando reparaciones en el hábitat acuático: " + getNombre());
    }

    public void realizarRenovaciones() {
        // Implementación para realizar renovaciones en el hábitat acuático
        System.out.println("Realizando renovaciones en el hábitat acuático: " + getNombre());
    }



}
