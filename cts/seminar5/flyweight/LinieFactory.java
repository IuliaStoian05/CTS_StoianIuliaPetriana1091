package cts.seminar5.flyweight;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    private Map<Integer,Linie> linie;

    public LinieFactory(Map<Integer, Linie> linie) {
        this.linie = new HashMap<Integer, Linie>();
    }

    public LinieFactory() {

    }

    public Linie getLinie(int nrLinie){
        if(linie.containsKey(nrLinie)){
            return linie.get(nrLinie);
        }else {
            Linie linie = new Linie(nrLinie, "HJK","hs");
            this.linie.put(nrLinie,linie);
        }
        return null;
    }
}
