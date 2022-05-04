package cts.seminar3_4_5.factoryMethod;

public class Troleibuz extends MijlocTransportInComun {
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }
    @Override
    public String toString() {
        return "Troleibuz: " + getNrInmatriculare();
    }
}
