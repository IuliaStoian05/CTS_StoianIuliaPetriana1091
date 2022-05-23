package cts.tests;

import cts.exceptii.ExceptieCNPGresit;
import cts.testarePersoana.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersoanaTest2 {
    @Test
    public void rightTestGetVarsta() {
        Persoana persoana = new Persoana("sda", "1002056789012");
        assertEquals(210, persoana.getVarsta());
    }

    @Test
    public void boundaryCheckGetVarsta1() {
        Persoana persoana1 = new Persoana("sda", "6221005678012");
        assertEquals(0, persoana1.getVarsta());
    }

    @Test
    public void boundaryCheckGetVarsta2() {
        Persoana persoana2 = new Persoana("sda", "5001001069012");
        assertEquals(21, persoana2.getVarsta());
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