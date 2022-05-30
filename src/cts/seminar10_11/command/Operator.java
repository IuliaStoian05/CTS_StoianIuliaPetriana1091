package cts.seminar10_11.command;

import java.util.List;

public class Operator {
    private List<Comanda> comenzi;

    public Operator() {
        this.comenzi = comenzi;
    }

    public void addComanda(Comanda comanda) {
        comenzi.add(comanda);
    }

    public void executaComanda() {
        if (!comenzi.isEmpty()) {
            comenzi.get(0).executa();
            comenzi.remove(0);
        } else {
            System.out.println("Nu exista comenzi");
        }
    }
}
