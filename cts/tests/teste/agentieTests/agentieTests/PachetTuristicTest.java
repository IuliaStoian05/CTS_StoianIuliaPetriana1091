package cts.tests.teste.agentieTests.agentieTests;

import cts.tests.clase.agentie.IPersoana;
import cts.tests.clase.agentie.PachetTuristic;
import cts.tests.teste.agentieTests.agentieTests.categorii.TestCuFake;
import cts.tests.teste.agentieTests.agentieTests.categorii.TestDeRight;
import cts.tests.teste.agentieTests.agentieTests.categorii.TestCuStub;
import cts.tests.teste.agentieTests.dubluri.PersoanaFake;
import cts.tests.teste.agentieTests.dubluri.PersoanaStub;
import org.junit.experimental.categories.Category;
import org.junit.Test;
import static org.junit.Assert.*;

public class PachetTuristicTest {
    @Test
    @Category(TestCuStub.class)
    public void testPoateRezerva(){
        IPersoana p1 = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(p1 , "Moscova", 100.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TestCuFake.class, TestDeRight.class})
    public void testNuPoateRezerva(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(17);

        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake , "Moscova", 100.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
}