package temaDP.proxy2;

public class Main {
    public static void main(String[] args) {
        Rezervare r1 = new Bilet(432134,120);
        r1.anuleazaRezervare();
        Rezervare r2 = new Bilet(300134,50);
        r2.anuleazaRezervare();
        Rezervare r3 = new Bilet(804,200);
        r3.anuleazaRezervare();
        Rezervare r4 = new Bilet(1034,500);
        r4.anuleazaRezervare();
        Rezervare r5 = new Bilet(99134,99);
        r5.anuleazaRezervare();
    }
}
