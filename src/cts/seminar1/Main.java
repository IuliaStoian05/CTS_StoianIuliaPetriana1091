package cts.seminar1;

public class Main {
    public static void main(String[] args) {
        IngrijitorZoo ingrijitorZoo = new IngrijitorZoo("Ingrijitor1");
        ZOO zoo1 = new ZOO("Zoo1", ingrijitorZoo);
        Girafa girafa1 = new Girafa("girafa1");
        Girafa girafa2 = new Girafa("girafa2");
        Zebra zebra1 = new Zebra("zebra1");
        Zebra zebra2 = new Zebra("zebra2");

        zoo1.addAnimal(girafa1);
        zoo1.addAnimal(girafa2);
        zoo1.addAnimal(zebra1);
        zoo1.addAnimal(zebra2);

        zoo1.hranesteAnimale("mancare");
    }
    }
