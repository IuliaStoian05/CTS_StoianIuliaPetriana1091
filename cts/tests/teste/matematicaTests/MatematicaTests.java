package cts.tests.teste.matematicaTests;

import cts.tests.clase.matematica.Matematica;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.*;


public class MatematicaTests {
    private Matematica mate;

    @Before
    public void setUp() {
        Matematica mate = new Matematica();
    }

    @Test
    public void testSumaCorecta() {
//        Matematica mate = new Matematica();
        int rezultat = mate.suma(5, 9);
        assertEquals(14, rezultat);
    }

    @Test
    public void testRaportCorect() {
//        Matematica mate = new Matematica();
        double rezultat = mate.raport(24, 6);
        assertEquals(4.0, rezultat, 0.001);
    }

    @Test
    public void testRaportZecimalCorect() {
//        Matematica mate = new Matematica();
        double rezultat = mate.raport(27, 6);
        assertEquals(4.5, rezultat, 0.001);
    }

    @Test
    public void testRaportShouldThrowException() {
//        Matematica mate = new Matematica();
        try {
            mate.raport(34, 0);
            fail("Nu trebuia sa ajunga aici.");
        } catch (IllegalArgumentException exceptie) {

        }
    }

    @Test
    public void testEsteParCorect() {
        assertTrue(mate.estePar(78));
        assertTrue(mate.estePar(6));
        assertTrue(mate.estePar(18));
        assertFalse(mate.estePar(5));
        assertFalse(mate.estePar(89));
    }

    @Test
    public void testNNumerePareListNotNull(){
        List<Integer> lista = mate.nNumerePare(2);
        assertNotNull(lista);
    }
}