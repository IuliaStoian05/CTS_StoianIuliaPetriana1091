package temaDP.observer3;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion(133821);
        Calator c1 = new Calator("Stefan Alina");
        Calator c2 = new Calator("Stan Alexandru");
        Calator c3 = new Calator("Ene Cosmin");
        avion.activeazaAnunturi(c1);
        avion.decoleaza();
        avion.dezactiveazaAnunturi(c1);
        avion.decoleaza();
        avion.dezactiveazaAnunturi(c2);
        avion.activeazaAnunturi(c3);
        avion.aterizeaza();
    }
}
