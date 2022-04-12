package cts.seminar3;


public class AutobuzBuilder implements Builder{
    private String model;
    private String numeSofet;
    private String numarInmatriculare;
    private boolean stop;
    private boolean openDoors;
    private String text;
    private String nrLinie;

    public AutobuzBuilder() {
        model = "Mercedes";
        numeSofet = "Dorel";
        numarInmatriculare = "B-555-STB";
        stop = true;
        openDoors = true;
        text = "Bun venit!";
        nrLinie = "555";
    }


    @Override
    public Autobuz build() {
        return new Autobuz(model, numeSofet, numarInmatriculare, stop, openDoors, text, nrLinie);
    }

    public AutobuzBuilder setModel(String model){
        this.model = model;
        return this;
    }
    public AutobuzBuilder setNumeSofer(String NumeSofer){
        this.numeSofet = NumeSofer;
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