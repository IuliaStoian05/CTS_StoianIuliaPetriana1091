package cts.seminar3_4;


public class AutobuzBuilder implements Builder {
    private String model;
    private String numeSofer;
    private String numarInmatriculare;
    private boolean stop;
    private boolean openDoors;
    private String text;
    private String nrLinie;

    public AutobuzBuilder() {
        model = "Mercedes";
        numeSofer = "Dorel";
        numarInmatriculare = "B-555-STB";
        stop = true;
        openDoors = true;
        text = "Bun venit!";
        nrLinie = "555";
    }


    @Override
    public Autobuz build() {
        return new Autobuz(model, numeSofer, numarInmatriculare, stop, openDoors, text, nrLinie);
    }

    public AutobuzBuilder setModel(String model){
        this.model = model;
        return this;
    }
    public AutobuzBuilder setNumeSofer(String NumeSofer){
        this.numeSofer = NumeSofer;
        return this;
    }

    public AutobuzBuilder setNumarInmatriculare(String numarInmatriculare){
        this.numarInmatriculare = numarInmatriculare;
        return this;
    }
    public AutobuzBuilder setStop(boolean stop){
        this.stop = stop;
        return this;
    }
    public AutobuzBuilder setOpenDoors(boolean openDoors){
        this.openDoors = openDoors;
        return this;
    }
    public AutobuzBuilder setText(String text){
        this.text = text;
        return this;
    }
    public AutobuzBuilder setNrLinie(String nrLinie){
        this.nrLinie = nrLinie;
        return this;
    }
}