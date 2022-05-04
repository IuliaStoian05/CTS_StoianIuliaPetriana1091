package cts.seminar3_4_5.factoryMethod;

public class TroleibuzFactory implements Factory {
    @Override
    public MijlocTransportInComun creareMijloc(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
