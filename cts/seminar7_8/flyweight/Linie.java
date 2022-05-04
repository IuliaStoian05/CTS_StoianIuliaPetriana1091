package cts.seminar7_8.flyweight;

public class Linie implements AutobuzLinie{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public String toString() {
        return "Linia" + nrLinie + "are primaStatie='" + primaStatie +"si ultimaStatie='" + ultimaStatie;
    }

    @Override
    public void afiseazaDescriere(Autobuz autobuz) {
        System.out.println(toString());
    }
}
