package cts.seminar7_8.observer;

public class Calator implements Observer {
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMsj(String mesaj) {
        System.out.println(nume + " ati primit urmatorul mesaj: " + mesaj);
    }
}
