package temaDP.factory1;

public class BiletEconomicClass extends Bilet {
    public BiletEconomicClass(String numeClient) {
        super(numeClient);
    }
    @Override
    public String toString() {
        return "BiletEconomicClass: " + getNumeClient();
    }
}
