package Interfaz.Visitantes;


public abstract class ToursVirtuales implements Visitable {


    private String name;

    public ToursVirtuales(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitable visitor) {
        visitor.visit(this);
    }
}