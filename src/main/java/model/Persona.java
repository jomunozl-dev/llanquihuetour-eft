package model;

import interfaces.Registrable;

/**
 * Clase abstracta que representa una persona del sistema.
 * Sirve como clase base para Cliente, GuiaTuristico y Proveedor.
 * @author Jorge Munoz Leon
 */

public abstract class Persona implements Registrable {

    private String nombre;
    private Rut rut;
    private Direccion direccion;
    private String telefono;

    /**
     * Constructor vacío.
     */
    public Persona() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre de la persona.
     * @param rut RUT de la persona.
     * @param direccion Dirección de la persona.
     * @param telefono Teléfono de contacto.
     */
    public Persona(String nombre, Rut rut, Direccion direccion, String telefono) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre.
     *
     * @return Nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre.
     *
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el RUT.
     *
     * @return Objeto Rut.
     */
    public Rut getRut() {
        return rut;
    }

    /**
     * Modifica el RUT.
     *
     * @param rut Nuevo RUT.
     */
    public void setRut(Rut rut) {
        this.rut = rut;
    }

    /**
     * Obtiene la dirección.
     *
     * @return Dirección.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Modifica la dirección.
     *
     * @param direccion Nueva dirección.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el teléfono.
     *
     * @return Teléfono.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Modifica el teléfono.
     *
     * @param telefono Nuevo teléfono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve la información general de la persona.
     *
     * @return Información en formato texto.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nRUT: " + rut +
                "\nDirección: " + direccion +
                "\nTeléfono: " + telefono;
    }
}
