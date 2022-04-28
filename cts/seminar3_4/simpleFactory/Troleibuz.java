package cts.seminar3_4.simpleFactory;

public class Troleibuz extends MijlocTransportInComun{
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }
    @Override
    public String toString() {
        return "Troleibuz: " + getNrInmatriculare();
    }
}
