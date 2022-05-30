package temaDP.observer3;

import java.util.HashSet;
import java.util.Set;

public class Avion implements Subject{
    private Set<Observer> observers;
    private int nrZbor;

    public Avion(int nrZbor) {
        this.nrZbor = nrZbor;
        observers = new HashSet<>();
    }
    @Override
    public void activeazaAnunturi(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dezactiveazaAnunturi(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notify(String anunt) {
        for (Observer observer : observers) {
            observer.primesteAnunt(anunt);
        }
    }

    public void decoleaza() {
        notify("Avionul " + nrZbor + " va decola.");
    }


    public void aterizeaza() {
        notify("Avionul " + nrZbor + " va ateriza.");
    }
}