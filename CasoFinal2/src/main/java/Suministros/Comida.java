package Suministros;

public class Comida extends Suministro {
    public Comida(int cantidad) {
        super("Comida", cantidad);
    }

    @Override
    public void abastecer() {
        this.cantidad += 100;
        System.out.println("Se han abastecido 100 unidades de comida.");
    }
}