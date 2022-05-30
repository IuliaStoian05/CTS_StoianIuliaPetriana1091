package temaDP.factory1;

public class Main {
    public static void main(String[] args) {
        Bilet b1 = BiletFactory.creazaBilet(TipBilet.BiletBusinessClass, "Ana Andrei");
        Bilet b2 = BiletFactory.creazaBilet(TipBilet.BiletEconomicClass, "Andrei Popescu");
        System.out.println(b1);
        System.out.println(b2);

    }
}
