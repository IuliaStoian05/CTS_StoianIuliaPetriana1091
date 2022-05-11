package cts.seminar10_11.command;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("B123STB");
        Autobuz autobuz2 = new Autobuz("B555STB");
        Operator operator = new Operator();
        operator.addComanda(new ComandaPlecarePeTraseu(1, autobuz2));
        operator.addComanda(new ComandaPlecarePeTraseu(10, autobuz1));
        operator.executaComanda();
    }
}
