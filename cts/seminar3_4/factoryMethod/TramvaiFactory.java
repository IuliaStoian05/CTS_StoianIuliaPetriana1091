package cts.seminar3_4.factoryMethod;

public class TramvaiFactory implements Factory {
    @Override
    public MijlocTransportInComun creareMijloc(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
