package cts.seminar3.simpleFactory;

public abstract class MijlocTransportInComun {
    String nrInmatriculare;

    public MijlocTransportInComun(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }
}
