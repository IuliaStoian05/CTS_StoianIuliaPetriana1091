package cts.seminar3.simpleFactory;

public class Main {
    public static void main(String[] args) {
        MijlocTransportInComun mijloc1 = Factory.creareMijlocTransport(TipMijlocTransport.Autobuz, "dxss");
        MijlocTransportInComun mijloc2 = Factory.creareMijlocTransport(TipMijlocTransport.Tramvai, "ddaaass");
        MijlocTransportInComun mijloc3 = Factory.creareMijlocTransport(TipMijlocTransport.Troleibuz, "gsjklala");
        System.out.println(mijloc1);
        System.out.println(mijloc2);
        System.out.println(mijloc3);
    }
}
