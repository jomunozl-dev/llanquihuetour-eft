package exceptions;

/**
 * Excepción personalizada para RUT inválido.
 * @author Jorge Munoz Leon
 */
public class RutInvalidoException extends Exception {

    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }

}