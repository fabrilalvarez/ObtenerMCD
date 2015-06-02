package obtenermcd;

/**
 *
 * @author damian
 */
public class Calculo {

    private int numero1;
    private int numero2;
    private String mensajeResultado = "", error;

    public Calculo() {
    }

    //setters
    public void setNumero1(int numero) {
        this.numero1 = numero;
        //si el número es negativo cambiamos a cero y
        //establecemos la propiedad "mensajeResultado" a "Error"
        if (numero < 0) {
            mensajeResultado = "";
        }

    }

    public void setNumero2(int numero) {
        this.numero2 = numero;
        //si el número es negativo cambiamos a cero y
        //establecemos la propiedad "mensajeResultado" a "Error"
        if (numero < 0) {
            mensajeResultado = "Error, los números no pueden ser negativos";
        }
    }

    //resultado del cálculo del MCD
    public String getMensajeResultado() {
        return mensajeResultado;
    }

    //getters
    //encapsulamos la modificación de las variables numero1 y numero2
    //para comprobar que los valores son correctos entre 
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public String mensajeria(int num1, int num2) {
        numero1 = num1;
        numero2 = num2;
        if (numero1 < 0 || numero2 < 0) {
            return error = "Error, los números no pueden ser negativos";
        }
        if (obtenerMCD(numero1, numero2) < 0) {
            return error = "Cálculo correcto";
        } else {
            return error = "Error en cálculo de MCD:";
        }
    }

    //método para calcular el MCD
    public int obtenerMCD(int num1, int num2) {
        int resto;
        int numDiv1 = num1;
        int numDiv2 = num2;

        if (num1 < 0 || num2 < 0) {
            return 0;
        }

        try {
            do {
                resto = numDiv1 % numDiv2;
                numDiv1 = numDiv2;
                if (resto != 0) {
                    numDiv2 = resto;
                }
            } while (resto != 0);
            //mensajeria();
            mensajeResultado = "Cálculo correcto";
            return numDiv2;
        } catch (Exception e) {
            mensajeResultado = "Error en cálculo de MCD: " + e.getMessage();
            return 0;
        }
    }
}
