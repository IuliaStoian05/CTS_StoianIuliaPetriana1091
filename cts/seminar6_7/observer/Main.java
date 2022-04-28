package cts.seminar6_7.observer;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(1);
        Calator calator1 = new Calator("fds");
        Calator calator2 = new Calator("gfds");
        Calator calator3 = new Calator("esas");
        autobuz.aboneazaObserver(calator1);
        autobuz.aboneazaObserver(calator2);
        autobuz.aboneazaObserver(calator3);
        autobuz.pleacaDeLaCapat();
        autobuz.dezaboneazaObserver(calator1);

    }
}
