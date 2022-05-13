package cts.seminar7_8.strategy;

public class Validator {
    private float suma;
    ModPlata modPlata;

    public Validator(float suma, ModPlata modPlata) {
        this.suma = suma;
        this.modPlata = modPlata;
    }

    public float getSuma() {
        return suma;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }
    public void platesteCalatorie(){

    }
}
