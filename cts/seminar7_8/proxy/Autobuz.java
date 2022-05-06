package cts.seminar7_8.proxy;

public class Autobuz implements MijlocTransport {
    private String model;
    private int nrLocuri;
    private int nrCalatori;

    public int getNrCalatori() {
        return nrCalatori;
    }

    public Autobuz(String model, int nrLocuri, int nrCalatori) {
        super();
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.nrCalatori = nrCalatori;
    }

    @Override
    public String toString() {
        return "Autobuz [numeSofer=" + model + ", nrLocuri=" + nrLocuri + ", nrCalatori=" + nrCalatori + "]";
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit in statie cu " + this.nrCalatori);
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }
}