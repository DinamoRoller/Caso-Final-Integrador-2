package Suministros;

public abstract class Suministro {
    private String nombre;
    int cantidad;

    public Suministro(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public abstract void abastecer();

    public class SuministroConcreto extends Suministro {

        public SuministroConcreto(String nombre, int cantidad) {
            super(nombre, cantidad);
        }

        @Override
        public void abastecer() {
            this.setCantidad(this.getCantidad() + 100);
            System.out.println("Se han abastecido 100 unidades de " + this.getNombre());
        }
    }
}