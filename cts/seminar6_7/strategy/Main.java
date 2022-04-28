package cts.seminar6_7.strategy;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(3,new CardCalatorii());
        validator.platesteCalatorie();
        validator.setModPlata(new CardBancar());
        validator.platesteCalatorie();
        validator.setModPlata(new SMS());
        validator.platesteCalatorie();
    }
}
