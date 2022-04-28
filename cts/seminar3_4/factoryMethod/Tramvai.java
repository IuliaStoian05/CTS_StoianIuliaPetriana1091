package cts.seminar3_4.factoryMethod;

public class Tramvai extends MijlocTransportInComun {
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Tramvai: " + getNrInmatriculare();
    }
}
