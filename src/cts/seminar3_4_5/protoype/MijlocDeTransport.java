package cts.seminar3_4_5.protoype;


public abstract class MijlocDeTransport implements Cloneable{
    private String nrInmatriculare;

    public MijlocDeTransport(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public abstract MijlocDeTransport copiaza() throws CloneNotSupportedException;
}