package temaDP.observer3;

public interface Subject {
    void notify(String anunt);
    void activeazaAnunturi(Observer observer);
    void dezactiveazaAnunturi(Observer observer);

}
