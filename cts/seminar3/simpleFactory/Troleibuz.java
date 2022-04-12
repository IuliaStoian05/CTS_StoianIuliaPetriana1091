package cts.seminar3.simpleFactory;

public class Troleibuz extends MijlocTransportInComun{
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }
    @Override
    public String toString() {
        return "Troleibuz: " + getNrInmatriculare();
    }
}
