package cts.seminar3.factoryMethod;

public class Microbuz extends MijlocTransportInComun {
    public Microbuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Microbuz: " + getNrInmatriculare();
    }
}

