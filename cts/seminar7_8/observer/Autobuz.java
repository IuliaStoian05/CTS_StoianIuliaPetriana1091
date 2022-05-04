package cts.seminar7_8.observer;
import java.util.HashSet;
import java.util.Set;

public class Autobuz implements Subject {
    private Set<Observer> observers;
    private int nrLinie;

    public Autobuz(int nrLinie) {
        this.nrLinie = nrLinie;
        observers = new HashSet<>();
    }

    @Override
    public void aboneazaObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dezaboneazaObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String mesaj) {
        for (Observer observer : observers) {
            observer.primesteMsj(mesaj);
        }
    }
    public void pleacaDeLaCapat(){
        notify("Autobuzul " + nrLinie + " pleaca de la capat.");
    }
}
