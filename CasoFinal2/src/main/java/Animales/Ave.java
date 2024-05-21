package Animales;
public class Ave extends Animal {
    private String alas;
    private String color;
    private double envergadura;
    private double longitud;

    public Ave(String nombre, int edad, double peso, double salud, String alas,String color, double envergadura, double longitud) {
        super(nombre, edad, peso, salud);
        this.alas = alas;
        this.color = color;
        this.envergadura = envergadura;
        this.longitud = longitud;
    }

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getEnvergadura() {
        return envergadura;
    }
    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public void emitirSonido() {
        System.out.println("La ave emite un sonido característico.");
    }

    @Override
    public String getTipo() {
        return "Ave";
    }
    @Override
    public String toString() {
        return super.toString() +
                ", color='" + color + '\'' +
                ", envergadura=" + envergadura + "m" +
                ", longitud=" + longitud + "cm" +
                ", alas='" + alas + '\'';
    }

    public void volar() {
        this.salud -= 10;
    }
    @Override
    public boolean esVenenoso() {
        return false; // Las aves no son venenosas
    }
    @Override
    public int getNumPatas() {
        return 2; // Las aves generalmente tienen dos patas
    }
}