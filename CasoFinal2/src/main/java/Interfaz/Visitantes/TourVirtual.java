package Interfaz.Visitantes;

public abstract class TourVirtual implements Visitable<TourVirtual> {

    private String name;

    public TourVirtual(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    @Override

    public void accept(Visitable<TourVirtual> visitor) {

        visitor.visit(this);

    }

}