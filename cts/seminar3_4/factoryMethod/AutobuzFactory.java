package cts.seminar3_4.factoryMethod;

public class AutobuzFactory implements Factory {
    @Override
    public MijlocTransportInComun creareMijloc(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
