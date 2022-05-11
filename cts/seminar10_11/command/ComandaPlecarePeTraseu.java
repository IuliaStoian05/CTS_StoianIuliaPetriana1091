package cts.seminar10_11.command;

public class ComandaPlecarePeTraseu implements Comanda{
    private int nrLinie;
    private Autobuz autobuz;

    public ComandaPlecarePeTraseu(int nrLinie, Autobuz autobuz) {
        this.nrLinie = nrLinie;
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.pleacaPeTraseu(nrLinie);
    }
}
