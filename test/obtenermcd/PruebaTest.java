package obtenermcd;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PruebaTest {

    private int num1, num2;
    private float resultado;
    private Calculo primeNumberChecker;

    @Before
    public void initialize() {
        primeNumberChecker = new Calculo();
    }

    // Each parameter should be placed as an argument here
    // Every time runner triggers, it will pass the arguments
    // from parameters we defined in primeNumbers() method
    public PruebaTest(int numeroA, int numeroB, int result) {
        this.num1 = numeroA;
        this.num2 = numeroB;
        this.resultado = result;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {10, 50, 10},
            {10, 2, 2},
            {12, 10, 2},
            {8, 4, 4},});
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized is : " + resultado);
        assertEquals(resultado, primeNumberChecker.obtenerMCD(num1, num2), 0);
    }
}
