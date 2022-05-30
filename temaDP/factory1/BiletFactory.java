package temaDP.factory1;

public class BiletFactory {
    public static Bilet creazaBilet(TipBilet tipBilet, String numeClient) {
        switch (tipBilet) {
            case BiletEconomicClass:
                return new BiletEconomicClass(numeClient);
            case BiletBusinessClass:
                return new BiletBusinessClass(numeClient);
            default:
                return null;
        }
    }
}