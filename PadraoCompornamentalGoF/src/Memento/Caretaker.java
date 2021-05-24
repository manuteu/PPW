package Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoLista = new ArrayList<Memento>();

    public void add(Memento estado) {
        mementoLista.add(estado);
    }

    public Memento get(int index) {
        return mementoLista.get(index);
    }
}
