package Suministros;

public class Agua extends Suministro {
    public Agua(int cantidad) {
        super("Agua", cantidad);
    }

    @Override
    public void abastecer() {
        this.cantidad += 100;
        System.out.println("Se han abastecido 100 litros de agua.");
    }
}