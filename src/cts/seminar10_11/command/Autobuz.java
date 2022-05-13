package cts.seminar10_11.command;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }
    public void pleacaPeTraseu(int nrLinie){
        System.out.println("Autobuzul cu numarul de inmatricular " + nrInmatriculare + " a plecat pe traseu pe linia " + nrLinie);
    }
}
