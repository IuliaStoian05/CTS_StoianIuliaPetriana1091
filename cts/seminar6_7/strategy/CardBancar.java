package cts.seminar6_7.strategy;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Ati platit suma de "+ suma);
    }
}