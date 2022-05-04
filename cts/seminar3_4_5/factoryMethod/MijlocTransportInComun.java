package cts.seminar3_4_5.factoryMethod;

public abstract class MijlocTransportInComun {
    String nrInmatriculare;

    public MijlocTransportInComun(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }
}
