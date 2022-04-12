package cts.seminar3.simpleFactory;

public class Autobuz extends MijlocTransportInComun{
    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }
    @Override
    public String toString() {
        return "Autobuz: " + getNrInmatriculare();
    }
}
