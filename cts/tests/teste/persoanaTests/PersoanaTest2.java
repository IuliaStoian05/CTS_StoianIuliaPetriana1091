package cts.tests.teste.persoanaTests;

import cts.exceptii.ExceptieCNPGresit;
import cts.tests.clase.persoana.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersoanaTest2 {
    private Persoana persoana;
    //Right-BICEP
    @Test
    public void getVarstaRight() {
        persoana = new Persoana("Teodora", "6000202263498");
        int varsta=persoana.getVarsta();
        assertEquals(22,varsta);
    }

    @Test
    public void getVarstaBoundary() {
        persoana = new Persoana("Teodora", "3000101263498");
        int varsta=persoana.getVarsta();
        assertEquals(222,varsta);
    }

    @Test
    public void getVarstaBoundary2() {
        persoana = new Persoana("Teodora", "2991231263498");
        int varsta=persoana.getVarsta();
        assertEquals(22,varsta);
    }
    @Test
    public void getVarstaBoundary3() {
        persoana = new Persoana("Teodora", "6220517263498");
        int varsta=persoana.getVarsta();
        assertEquals(0,varsta);
    }
    @Test
    public void getVarstaBoundary4() {
        persoana = new Persoana("Teodora", "6040518263498");
        int varsta=persoana.getVarsta();
        assertEquals(17,varsta);
    }

    @Test(expected = ExceptieCNPGresit.class)
    public void errorCheckGetVarsta() {
        Persoana persoana = new Persoana("sda", "5001001069012");
        persoana.getVarsta();
    }

    @Test(expected = NumberFormatException.class)
    public void errorFormatGetVarsta() {
        Persoana persoana = new Persoana("sda", "5001001069012");
        persoana.getVarsta();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void errorFormatCNPGetVarsta() {
        Persoana persoana = new Persoana("sda", "500112");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void performanceTestGetVarsta() {
        Persoana persoana = new Persoana("sda", "5001001069012");
        persoana.getVarsta();
    }

    @Test
    public void orderGetVarsta() {
        Persoana persoana1 = new Persoana("ion", "5001001069012");
        Persoana persoana2 = new Persoana("ana", "6021001069012");
        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void existanceGetVarsta() {
        Persoana persoana = new Persoana("ana", null);
        persoana.getVarsta();
    }
}