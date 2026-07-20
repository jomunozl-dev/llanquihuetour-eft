package model;

/**
 * Representa a un guía turístico de Llanquihue Tour.
 * @author Jorge Munoz Leon
 */
public class GuiaTuristico extends Persona {

    private String especialidad;

    /**
     * Constructor vacío.
     */
    public GuiaTuristico() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del guía.
     * @param rut RUT del guía.
     * @param direccion Dirección del guía.
     * @param telefono Teléfono del guía.
     * @param especialidad Especialidad del guía.
     */
    public GuiaTuristico(String nombre, Rut rut, Direccion direccion,
                         String telefono, String especialidad) {

        super(nombre, rut, direccion, telefono);
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la especialidad del guía.
     *
     * @return Especialidad.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Modifica la especialidad del guía.
     *
     * @param especialidad Nueva especialidad.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Registra al guía turístico.
     */
    @Override
    public void registrar() {
        System.out.println("Guía turístico registrado: " + getNombre());
    }

    /**
     * Muestra los datos del guía.
     */
    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    /**
     * Devuelve la información del guía turístico.
     *
     * @return Información del guía.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nEspecialidad: " + especialidad;
    }
}