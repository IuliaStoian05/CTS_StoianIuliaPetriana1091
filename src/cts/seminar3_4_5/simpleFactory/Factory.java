package cts.seminar3_4_5.simpleFactory;

public class Factory {
    public static MijlocTransportInComun creareMijlocTransport(TipMijlocTransport tip, String nrInmatriculare) {
        switch (tip) {
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            case Tramvai:
                return new Tramvai(nrInmatriculare);
            case Troleibuz:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}

