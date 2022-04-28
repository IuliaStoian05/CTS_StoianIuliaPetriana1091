package cts.seminar6_7.decorator;


public class Main {
    public static void main(String[] args) {
        Printer printer=new PrintBilet();
        printer.printeazaBilet();

        DecoratorAbstract decoratorAbstract=new DecoratorConcret(printer, "LMA");
        decoratorAbstract.printeazaBilet();
        decoratorAbstract.printeazaMesaj();
    }

}