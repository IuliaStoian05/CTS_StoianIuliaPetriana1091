package cts.seminar8.chainOfResponsibility;

public class Metrou extends TransportHandler {
    public Metrou(int pragDist) {
        super(pragDist);
    }

    public void deplaseazaRequest(int distanta) {
        System.out.println("Merge cu metroul");
    }
}
