package cts.seminar3_4_5.builder;

public class AutobuzBuilder2 implements Builder {
    // atributele
    // public AutobuzBuilder2(){ atribut = "valoare" }
    // override metoda din interfata
    // setterii
    private String model;
    private String numeSofer;
    private String nrInmatriculare;
    private Boolean stop;
    private Boolean openDoors;
    private String text;
    private Integer nrLinie;
    private Boolean isNew;

    public AutobuzBuilder2(){
        model = "Mercedes";
        numeSofer = "Dorel";
        nrInmatriculare = "B555STB";
        stop=true;
        openDoors=true;
        text="Buna ziua";
        nrLinie= 303;
        isNew=false;
    }

    @Override
    public Autobuz build() {
        return new Autobuz(model, numeSofer, nrInmatriculare, stop, openDoors, text,nrLinie,isNew);
    }

    public AutobuzBuilder2 setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder2 setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder2 setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return this;
    }

    public AutobuzBuilder2 setStop(Boolean stop) {
        this.stop = stop;
        return this;
    }

    public AutobuzBuilder2 setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
        return this;
    }

    public AutobuzBuilder2 setText(String text) {
        this.text = text;
        return this;
    }

    public AutobuzBuilder2 setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder2 setNew(Boolean aNew) {
        isNew = aNew;
        return this;
    }
}