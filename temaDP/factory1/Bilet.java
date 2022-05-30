package temaDP.factory1;

public abstract class Bilet {
    private String numeClient;

    public Bilet(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumeClient() {
        return numeClient;
    }
}
