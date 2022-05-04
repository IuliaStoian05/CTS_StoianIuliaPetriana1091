package cts.seminar10.memento;

public class Autobuz {
    private String numeSofer;
    private Integer consumMediu;
    private String model;
    private Integer anFabricatie;
    private Integer nrLocuri;

    public Autobuz(String numeSofer, Integer consumMediu, String model, Integer anFabricatie, Integer nrLocuri) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(Integer consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
