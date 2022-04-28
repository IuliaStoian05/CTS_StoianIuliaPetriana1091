package cts.seminar6_7.observer;

public interface Subject {
    void aboneazaObserver(Observer observer);
    void dezaboneazaObserver(Observer observer);
    void notify(String mesaj);
}
