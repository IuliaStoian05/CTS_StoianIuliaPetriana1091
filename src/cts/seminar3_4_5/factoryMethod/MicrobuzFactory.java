package cts.seminar3_4_5.factoryMethod;

public class MicrobuzFactory  implements Factory {
    @Override
    public MijlocTransportInComun creareMijloc(String nrInmatriculare) {
        return new Microbuz(nrInmatriculare);
    }
}
