package temaDP.factory1;

public class BiletBusinessClass extends Bilet{
    public BiletBusinessClass(String numeClient) {
        super(numeClient);
    }
    @Override
    public String toString() {
        return "BiletBusinessClass: " + getNumeClient();
    }
}
