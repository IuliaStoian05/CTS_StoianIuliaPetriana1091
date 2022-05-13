package cts.seminar3_4_5.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factory1 = new AutobuzFactory();
        Factory factory2 = new MicrobuzFactory();
        System.out.println(factory1.creareMijloc("dfghjk").getNrInmatriculare());
        System.out.println(factory2.creareMijloc("asdfghjkl").getNrInmatriculare());
    }
}
