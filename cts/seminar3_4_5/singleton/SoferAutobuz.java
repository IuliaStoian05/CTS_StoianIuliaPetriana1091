package cts.seminar3_4_5.singleton;

    public class SoferAutobuz {
        private String nume;
        private static SoferAutobuz soferAutobuz = null;

        private SoferAutobuz(String nume) {
            this.nume = nume;
        }

        public String getNume() {
            return nume;
        }

        public synchronized static SoferAutobuz getInstance(String nume){
            if(soferAutobuz == null){
                soferAutobuz = new SoferAutobuz(nume);
            }
            return soferAutobuz;
        }
    }

