package cts.seminar8.chainOfResponsibility;

public class Tramvai extends TransportHandler{
    public Tramvai(int pragDist) {
        super(pragDist);
    }

    public void deplaseazaRequest(int distanta) {
        if(distanta<pragDist){
            System.out.println("Merge cu tramvaiul");
        }else handler.deplaseazaRequest(distanta);
    }
}
