package model;

/**
 * Representa a un proveedor de servicios de Llanquihue Tour.
 * @author Jorge Munoz Leon
 */
public class Proveedor extends Persona {

    private String servicio;

    /**
     * Constructor vacío.
     */
    public Proveedor() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del proveedor.
     * @param rut RUT del proveedor.
     * @param direccion Dirección del proveedor.
     * @param telefono Teléfono del proveedor.
     * @param servicio Servicio que ofrece.
     */
    public Proveedor(String nombre, Rut rut, Direccion direccion,
                     String telefono, String servicio) {

        super(nombre, rut, direccion, telefono);
        this.servicio = servicio;
    }

    /**
     * Obtiene el servicio que ofrece el proveedor.
     *
     * @return Servicio.
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * Modifica el servicio que ofrece el proveedor.
     *
     * @param servicio Nuevo servicio.
     */
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    /**
     * Registra al proveedor.
     */
    @Override
    public void registrar() {
        System.out.println("Proveedor registrado: " + getNombre());
    }

    /**
     * Muestra los datos del proveedor.
     */
    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    /**
     * Devuelve la información del proveedor.
     *
     * @return Información del proveedor.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nServicio: " + servicio;
    }
}