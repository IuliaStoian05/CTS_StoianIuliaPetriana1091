package cts.seminar10_11.state;

public class LaCapatDeLinie implements StareAutobuz {
    public void modificaStare(Autobuz autobuz) {
        if (!(autobuz.getStare() instanceof LaCapatDeLinie)) {
            autobuz.setStare(this);
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " a ajuns la capat de linie");
        } else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " este deja la capat de linie");
        }
    }
}
