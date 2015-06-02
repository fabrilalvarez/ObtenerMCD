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
public class MensajeTest {

    public MensajeTest() {
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
     * Test of testSetNum1 method, of class Calculo.
     */
    @Test
    public void testMensajeria() {
        int num1 = -15;
        int num2 = 5;
        Calculo instance = new Calculo();
        String expResult = "Error, los números no pueden ser negativos";
        String result = instance.mensajeria(num1, num2);
        assertEquals(expResult, result);
        System.out.println("Validada entrada de datos");
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        int num1 = 15;
        int num2 = 5;
        Calculo instance = new Calculo();
        int expResult = 5;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
        System.out.println("Mensaje: " + instance.getMensajeResultado() + " " + expResult);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
