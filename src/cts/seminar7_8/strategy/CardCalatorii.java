package cts.seminar7_8.strategy;

public class CardCalatorii implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Ati platit suma de "+ suma);
    }
}
