package cts.seminar3_4_5.builder;


public class AutobuzBuilder1 implements Builder{
// private Autobuz autobuz;
    //constructor fara param
    //overide method
    //setteri
    private Autobuz autobuz;

    public AutobuzBuilder1(){
        autobuz=new Autobuz();
    }

    @Override
    public Autobuz build() {
        return autobuz;
    }

    public AutobuzBuilder1 setModel(String model) {
        autobuz.setModel(model);
        return this;
    }

    public AutobuzBuilder1 setNumeSofer(String numeSofer) {
        autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder1 setNrInmatriculare(String nrInmatriculare) {
        autobuz.setNrInmatriculare(nrInmatriculare);
        return this;
    }

    public AutobuzBuilder1 setStop(Boolean stop) {
        autobuz.setStop(stop);
        return this;
    }

    public AutobuzBuilder1 setOpenDoors(Boolean openDoors) {
        autobuz.setOpenDoors(openDoors);
        return this;
    }

    public AutobuzBuilder1 setText(String text) {
        autobuz.setText(text);
        return this;
    }

    public AutobuzBuilder1 setNrLinie(Integer nrLinie) {
        autobuz.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder1 setNew(Boolean aNew) {
        autobuz.setNew(aNew);
        return this;
    }
}