package Interfaz.Visitantes;

public interface Visitable<T extends Visitable<T>> {

    void visit(T tour);

    void accept(Visitable<T> visitor);

}
