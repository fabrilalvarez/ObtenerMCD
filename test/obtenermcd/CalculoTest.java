package obtenermcd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class CalculoTest {

    public CalculoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        int num1 = 10;//Primer numero
        int num2 = 50;//Segundo numero
        Calculo instance = new Calculo();
        int expResult = 10;//Resultado esperado
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
        System.out.println("Calculo de metodo obtenerMCD: " + expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
