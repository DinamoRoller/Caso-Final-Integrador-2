package Animales;

public class Reptil extends Animal {
    private boolean venenoso;
    private double longitud;

    public Reptil(String nombre, int edad, double peso, double salud, boolean venenoso, double longitud) {
        super(nombre, edad, peso, salud);
        this.venenoso = venenoso;

        this.longitud = longitud;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public double getLongitud() {
        return longitud;
    }

    @Override
    public boolean esVenenoso() {
        return false;
    }

    public void mudarPiel() {
        this.salud -= 10;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El reptil emite un sonido característico.");
    }

    @Override
    public String getTipo() {
        return "Reptil";
    }

    @Override
    public String getColor() {
        return null; // Devuelve un valor predeterminado o nulo para el color del reptil
    }
    @Override
    public double getEnvergadura() {
        return -1;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", longitud=" + longitud + "cm" +
                ", es venenoso=" + (venenoso ? "Sí" : "No");
    }


    @Override
    public int getNumPatas() {
        return 0; // Los reptiles no tienen patas
    }


}