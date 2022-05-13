package cts.seminar9.chainOfResponsibility;

public class Autobuz extends TransportHandler {
    public Autobuz(int pragDist) {
        super(pragDist);
    }

    public void deplaseazaRequest(int distanta) {
        if (distanta < pragDist) {
            System.out.println("Merge cu autobuzul");
        } else handler.deplaseazaRequest(distanta);
    }
}
