package Animales;

public class Mamifero extends Animal {
    private String pelo;
    private int patas;

    public Mamifero(String nombre, int edad, double peso, double salud, String pelo, int patas) {
        super(nombre, edad, peso, salud);
        this.pelo = pelo;
        this.patas = patas;
    }

    public String getPelo() {
        return this.pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El mamífero emite un sonido característico.");
    }


    public void amamantar() {
        this.salud += 15;
    }

    @Override
    public String getTipo() {
        return "Mamífero";
    }

    @Override
    public String getColor() {
        return this.pelo;
    }
    @Override
    public double getLongitud() {
        return 0.0;
    }
    @Override
    public boolean esVenenoso() {
        return false;
    }
    @Override
    public int getNumPatas() {
        return this.patas;
    }
    @Override
    public double getEnvergadura() {
        return 0.0; // Valor predeterminado si la envergadura no es aplicable a los mamíferos
    }
}