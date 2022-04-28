package cts.seminar8.template;


public class TramvaiProbe extends TramvaiAbstract{
    @Override
    public void opresteInStatia1() {
        System.out.println("Tramvaiul pleaca din statie");
    }

    @Override
    public void opresteInStatia2() {
        System.out.println("Nu opreste in statia 2"); //pt ca nu ia calatori
    }

    @Override
    public void opresteInStatia3() {
        System.out.println("Tramvaiul ajunge la capat de linie");
    }
}
