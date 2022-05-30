package cts.tests.teste.agentieTests.agentieTests;
import cts.tests.clase.agentie.AgentieTurism;
import cts.tests.clase.agentie.IPachetTuristic;
import cts.tests.teste.agentieTests.agentieTests.categorii.TestCuDummy;
import cts.tests.teste.agentieTests.agentieTests.categorii.TestCuFake;
import cts.tests.teste.agentieTests.agentieTests.categorii.TestDeRight;
import cts.tests.teste.agentieTests.dubluri.PachetDummy;
import cts.tests.teste.agentieTests.dubluri.PachetFake;
import org.junit.experimental.categories.Category;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgentieTurismTest {

    @Test
    @Category(TestCuDummy.class)
    public void testAdaugaTurism(){
        AgentieTurism agentieTurism = new AgentieTurism();
        IPachetTuristic pachetD= new PachetDummy();
        agentieTurism.adaugaPachet(pachetD);
        assertEquals(1,agentieTurism.getNumarPacheteTuristice());
    }

    @Test
    @Category({TestCuFake.class, TestDeRight.class})
    public void testCalculSumaTotalaPachete(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake pachetF1 = new PachetFake();
        PachetFake pachetF2 = new PachetFake();

        pachetF1.setPret(1000.0);
        pachetF2.setPret(500.0);

        agentieTurism.adaugaPachet(pachetF1);
        agentieTurism.adaugaPachet(pachetF2);

        assertEquals(1500, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }
}