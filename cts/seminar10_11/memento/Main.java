package cts.seminar10_11.memento;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("sdfghj", 7, "mercedes", 2000, 20);
        ManagerAutobuz manager = new ManagerAutobuz();
/*
        manager.adaugaMemento(new AutobuzMemento().adaugaMemento());
        autobuz.setNumeSofer("Viorel");
        System.out.println(autobuz.toString());
        manager.adaugaMemento(autobuz.genereazaMemento());
        autobuz.setConsumMediu(7);
        manager.adaugaMemento(autobuz.genereazaMemento());
        System.out.println(autobuz.toString());
        autobuz.revineLaOStareAnterioara(manager.getMemento(0));
        System.out.println(autobuz.toString());
    */
    }
}
