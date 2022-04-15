package cts.seminar5.strategy;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Ati platit suma de "+ suma);
    }
}
