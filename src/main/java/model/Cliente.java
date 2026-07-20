package model;

/**
 * Representa a un cliente de Llanquihue Tour.
 * @author Jorge Munoz Leon
 */

public class Cliente extends Persona {

    private String correo;

    /**
     * Constructor vacío.
     */
    public Cliente() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del cliente.
     * @param rut RUT del cliente.
     * @param direccion Dirección del cliente.
     * @param telefono Teléfono del cliente.
     * @param correo Correo electrónico del cliente.
     */
    public Cliente(String nombre, Rut rut, Direccion direccion,
                   String telefono, String correo) {

        super(nombre, rut, direccion, telefono);
        this.correo = correo;
    }

    /**
     * Obtiene el correo electrónico.
     *
     * @return Correo.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Modifica el correo electrónico.
     *
     * @param correo Nuevo correo.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Registra al cliente.
     */
    @Override
    public void registrar() {
        System.out.println("Cliente registrado correctamente.");
    }

    /**
     * Muestra la información del cliente.
     */
    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    /**
     * Devuelve la información del cliente.
     *
     * @return Información del cliente.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nCorreo: " + correo;
    }
}