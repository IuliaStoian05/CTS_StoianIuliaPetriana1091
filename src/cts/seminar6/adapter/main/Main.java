package cts.seminar6.adapter.main;

import cts.seminar6.adapter.adapter.Adapter;
import cts.seminar6.adapter.validatorTerestru.ValidatorAutobuz;
import cts.seminar6.adapter.validatorTerestru.ValidatorTerestru;

public class Main {
    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();
        validatorAutobuz.valideazaBilet();
        validatorAutobuz.valideazaAbonament();

        ValidatorTerestru validatorMetrou = new Adapter();
        validatorMetrou.valideazaBilet();
        validatorMetrou.valideazaAbonament();
    }
}