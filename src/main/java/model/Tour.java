package model;

/**
 * Representa un tour ofrecido por Llanquihue Tour.
 * @author Jorge Munoz Leon
 */
public class Tour {

    private String nombre;
    private String destino;
    private double precio;
    private int duracion;

    /**
     * Constructor vacío.
     */
    public Tour() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del tour.
     * @param destino Destino del tour.
     * @param precio Precio del tour.
     * @param duracion Duración del tour en horas.
     */
    public Tour(String nombre, String destino, double precio, int duracion) {
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
        this.duracion = duracion;
    }

    /**
     * Obtiene el nombre del tour.
     *
     * @return Nombre del tour.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del tour.
     *
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el destino.
     *
     * @return Destino.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Modifica el destino.
     *
     * @param destino Nuevo destino.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene el precio.
     *
     * @return Precio.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio.
     *
     * @param precio Nuevo precio.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la duración del tour.
     *
     * @return Duración en horas.
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Modifica la duración del tour.
     *
     * @param duracion Nueva duración.
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Devuelve la información del tour.
     *
     * @return Información del tour.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nDestino: " + destino +
                "\nPrecio: $" + precio +
                "\nDuración: " + duracion + " horas";
    }
}