package cts.seminar9.template;

public class Main {
    public static void main(String[] args) {
        TramvaiAbstract tramvai = new Tramvai();
        TramvaiAbstract tramvaiProbe = new TramvaiProbe();
        tramvai.parcurgeTraseu();
        System.out.println("\n");
        tramvai.parcurgeTraseuInvers();
        System.out.println("\n");
        tramvaiProbe.parcurgeTraseu();
        System.out.println("\n");
        tramvaiProbe.parcurgeTraseuInvers();

    }
}
