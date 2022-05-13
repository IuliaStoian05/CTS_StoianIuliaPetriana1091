package cts.seminar6.adapter.adapter;
import cts.seminar6.adapter.validatorSubteran.ValidatorMetrou;
import cts.seminar6.adapter.validatorTerestru.ValidatorTerestru;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru {
    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }
    @Override
    public void valideazaAbonament() {
        super.valideazaAboonament();
    }
}