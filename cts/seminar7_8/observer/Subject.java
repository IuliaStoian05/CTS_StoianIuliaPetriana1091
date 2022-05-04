package cts.seminar7_8.observer;

public interface Subject {
    void aboneazaObserver(Observer observer);
    void dezaboneazaObserver(Observer observer);
    void notify(String mesaj);
}
