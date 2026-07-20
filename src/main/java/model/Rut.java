package model;

import exceptions.RutInvalidoException;
import utils.ValidadorRut;

/**
 * Representa el RUT de una persona.
 * @author Jorge Munoz Leon
 */
public class Rut {

    private String numero;

    /**
     * Constructor vacío.
     */
    public Rut() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param numero Número del RUT.
     * @throws RutInvalidoException Si el RUT es inválido.
     */
    public Rut(String numero) throws RutInvalidoException {

        ValidadorRut.validar(numero);
        this.numero = numero;

    }

    public String getNumero() {
        return numero;
    }

    /**
     * Modifica el RUT.
     *
     * @param numero Nuevo RUT.
     * @throws RutInvalidoException Si el RUT es inválido.
     */
    public void setNumero(String numero) throws RutInvalidoException {

        ValidadorRut.validar(numero);
        this.numero = numero;

    }

    @Override
    public String toString() {
        return numero;
    }

}