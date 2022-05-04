package cts.seminar3_4_5.builder;

    public class Main {
        public static void main(String[] args) {
            Autobuz autobuz1;
            Autobuz autobuz2;
            Autobuz autobuz3;
            AutobuzBuilder1 builder=new AutobuzBuilder1();
            autobuz1=builder.build();
            autobuz2=new AutobuzBuilder1().setNumeSofer("Marian").build();
            autobuz3=new AutobuzBuilder1().setStop(false).setNrInmatriculare("B333AAA").build();

            System.out.println(autobuz1);
            System.out.println(autobuz2);
            System.out.println(autobuz3);

            AutobuzBuilder2 autobuzBuilder=new AutobuzBuilder2();
            Autobuz a1= autobuzBuilder.setStop(true).setOpenDoors(true).setText("La multi ani!").build();
            Autobuz a2=autobuzBuilder.setNumeSofer("Io").build();
            Autobuz a3=autobuzBuilder.build();
            System.out.println("Noile autobuze: ");
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
        }
    }

