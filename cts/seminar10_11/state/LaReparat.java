package cts.seminar10_11.state;

public class LaReparat implements StareAutobuz {
    public void modificaStare(Autobuz autobuz) {
        if (autobuz.getStare() instanceof LaCapatDeLinie) {
            autobuz.setStare(this);
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " este la reparat");
        } else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate fi la reparat deoarece nu a ajuns la capat de linie");
        }
    }
}
