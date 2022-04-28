package cts.seminar6_7.flyweight;

public class Main {
    Autobuz a1 = new Autobuz("fds", 2000, 50);
    Autobuz a2 = new Autobuz("fds", 2000, 50);
    Autobuz a3 = new Autobuz("fds", 2000, 50);
    Autobuz a4 = new Autobuz("fds", 2000, 50);
    Autobuz a5 = new Autobuz("fds", 2000, 50);
    LinieFactory factory = new LinieFactory();
    Linie l1 = factory.getLinie(168);
    Linie l2 = factory.getLinie(137);


}
