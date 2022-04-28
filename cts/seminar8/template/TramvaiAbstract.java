package cts.seminar8.template;

public abstract class TramvaiAbstract {
    protected abstract void opresteInStatia1();
    protected abstract void opresteInStatia2();
    protected abstract void opresteInStatia3();
    public final void parcurgeTraseu(){
        opresteInStatia1();
        opresteInStatia2();
        opresteInStatia3();
    }
    public final void parcurgeTraseuInvers(){
        opresteInStatia3();
        opresteInStatia2();
        opresteInStatia1();
    }
}
