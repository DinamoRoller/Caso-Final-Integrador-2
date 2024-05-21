package Interfaz;
import java.util.List;
import Habitats.Habitats;

abstract class Trabajador {
    private String nombre;
    private String apellido;
    private String cargo;
    private double salario;

    public class InterfazTrabajador {
        private List<Habitats> habitats; // Atributo para almacenar la lista de hábitats

        public InterfazTrabajador(List<Habitats> habitats) {
            this.habitats = habitats;
        }

    }

    public Trabajador(String nombre, String apellido, String cargo, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void trabajar();
}