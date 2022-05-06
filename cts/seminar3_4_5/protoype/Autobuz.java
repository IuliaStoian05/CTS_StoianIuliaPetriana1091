package cts.seminar3_4_5.protoype;

public class Autobuz extends MijlocDeTransport{
    private String numeSofer;

    public Autobuz(String nrInmatriculare, String numeSofer) {
        super(nrInmatriculare);
        this.numeSofer=numeSofer;
    }
    public String getNumeSofer() {
        return numeSofer;
    }
    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }
    @Override
    public MijlocDeTransport copiaza() throws CloneNotSupportedException {
        return (MijlocDeTransport) this.clone();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(" - ");
        sb.append("nrInmatriculare='").append(getNrInmatriculare()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

