package cts.seminar5.proxy;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz("Andrei", 20, 3);
        autobuz.opresteInStatie();

        MijlocTransport autobuz1 = new Autobuz("Andrei", 20, 3);
        autobuz1.opresteInStatie();
        autobuz1.setNrCalatori(0);
        MijlocTransport autobuzDeNoapte = new AutobuzDeNoapte((Autobuz) autobuz1);
        autobuzDeNoapte.opresteInStatie();

    }

}