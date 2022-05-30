package cts.seminar9.chainOfResponsibility;

public class Troleibuz extends TransportHandler {
    public Troleibuz(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int distanta) {
        if(distanta<pragDist){
            System.out.println("Merge cu troleibuzul");
        }else handler.deplaseazaRequest(distanta);
    }
}
