package cts.seminar3.factoryMethod;

public class AutobuzFactory implements Factory {
    @Override
    public MijlocTransportInComun creareMijloc(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
