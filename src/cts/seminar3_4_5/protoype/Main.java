package cts.seminar3_4_5.protoype;

public class Main {
    public static void main(String[] args) {
        Autobuz a1= new Autobuz("rjo9TPF", "wertyujhg");
        Tramvai t1=new Tramvai("akda09ma", "sdyj");
        try {
            MijlocDeTransport a2=a1.copiaza();
            MijlocDeTransport t2=t1.copiaza();

            System.out.println("Original - Autobuz"+a1);
            System.out.println("Original - Tramvai"+t1);
            System.out.println("Copie - Autobuz"+a2);
            System.out.println("Copie - Tramvai"+t2);

        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

