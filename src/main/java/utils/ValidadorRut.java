package utils;

import exceptions.RutInvalidoException;

/**
 * Clase utilitaria para validar un RUT chileno.
 * @author Jorge Munoz Leon
 */
public class ValidadorRut {

    /**
     * Valida un RUT chileno.
     *
     * @param rut RUT ingresado.
     * @throws RutInvalidoException Si el RUT es inválido.
     */
    public static void validar(String rut) throws RutInvalidoException {

        if (rut == null || rut.trim().isEmpty()) {
            throw new RutInvalidoException("El RUT no puede estar vacío.");
        }

        // Elimina puntos y guión
        String rutLimpio = rut.replace(".", "")
                              .replace("-", "")
                              .trim();

        // Debe tener entre 8 y 9 caracteres
        if (rutLimpio.length() < 8 || rutLimpio.length() > 9) {
            throw new RutInvalidoException("El RUT debe tener entre 8 y 9 caracteres.");
        }

        // Separa cuerpo y dígito verificador
        String cuerpo = rutLimpio.substring(0, rutLimpio.length() - 1);

        // El cuerpo debe contener solo números
        if (!cuerpo.matches("\\d+")) {
            throw new RutInvalidoException("El cuerpo del RUT solo puede contener números.");
        }

        // El dígito verificador puede ser número o K
        char dv = rutLimpio.charAt(rutLimpio.length() - 1);

        if (!(Character.isDigit(dv) || dv == 'K' || dv == 'k')) {
            throw new RutInvalidoException("El dígito verificador es inválido.");
        }

    }

}