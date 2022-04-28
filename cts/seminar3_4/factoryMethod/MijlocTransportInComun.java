package cts.seminar3_4.factoryMethod;

public abstract class MijlocTransportInComun {
    String nrInmatriculare;

    public MijlocTransportInComun(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }
}
