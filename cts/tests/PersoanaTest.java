package cts.tests;

import cts.testarePersoana.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersoanaTest {
    @Test
    public void esteDeSexMasculinTest() {
        Persoana persoana = new Persoana("sda", "123456789012");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void esteDeSexMSauFTest() {
        Persoana persoana1 = new Persoana("sda", "123456789012");
        Persoana persoana2 = new Persoana("sda", "123456789012");
        assertEquals("M", persoana1.getSex());
        assertEquals("F", persoana2.getSex());
    }

    @Test
    public void crossCheckTest() {
        Persoana persoana = new Persoana("sda", "123456789012");
        assertEquals(persoana.CNP.charAt(0) % 2 == 1 ? "M" : "F", persoana.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void errorConditionTest() {
        Persoana persoana = new Persoana("sda", "123456789012");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void performanceTestGetSex() {
        Persoana persoana = new Persoana("sda", "123456789012");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void formatCheckGetSex() {
        Persoana persoana1 = new Persoana("sda", "123456789012");
        Persoana persoana2 = new Persoana("sda", "223456789012");
        assertEquals("M", persoana1.getSex());
        assertEquals("F", persoana2.getSex());
    }

    @Test
    public void checkRangeGetSex() {
        Persoana persoana = new Persoana("sda", "123456789012");
        assertEquals("N/A", persoana.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void existanceCheckGetSex() {
        Persoana persoana = new Persoana("sda", "123456789012");
        persoana.getSex();
    }


}