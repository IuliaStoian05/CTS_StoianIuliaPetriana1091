package cts.tests.teste.agentieTests.agentieTests.suite;

import cts.tests.teste.agentieTests.agentieTests.AgentieTurismTest;
import cts.tests.teste.agentieTests.agentieTests.PachetTuristicTest;
import cts.tests.teste.agentieTests.agentieTests.categorii.TestCuStub;
import cts.tests.teste.agentieTests.agentieTests.categorii.TestCuFake;
import cts.tests.teste.agentieTests.agentieTests.categorii.TestDeRight;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory({TestCuFake.class, TestCuStub.class})
@Categories.ExcludeCategory(TestDeRight.class)
public class SuitaTesteCuStubDarNuDeRight {
}