package temaDP.proxy2;

public class Bilet implements Rezervare {
    private int nrBilet;
    private int pret;

    public Bilet(int nrBilet, int pret) {
        super();
        this.nrBilet = nrBilet;
        this.pret = pret;
    }

    public int getNrBilet() {
        return nrBilet;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "nrBilet=" + nrBilet +
                ", pret=" + pret +
                '}';
    }

    @Override
    public void anuleazaRezervare() {
        if (pret < 100) {
            System.out.println("Rezervarea a fost anulata.");
        } else {
            System.out.println("Rezervarea nu verifica conditiile pentru anulare gratuita.");
        }
    }
}