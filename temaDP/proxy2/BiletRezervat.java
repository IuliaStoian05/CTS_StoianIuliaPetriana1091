package temaDP.proxy2;

public class BiletRezervat implements Rezervare{
    Bilet bilet;
    public BiletRezervat(Bilet bilet){this.bilet=bilet;}

    @Override
    public void anuleazaRezervare() {
            bilet.anuleazaRezervare();
    }
}
