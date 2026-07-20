package model;

/**
 * Representa la dirección de una persona.
 * @author Jorge Munoz Leon
 */
public class Direccion {

    private String calle;
    private String ciudad;
    private String region;

    /**
     * Constructor vacío.
     */
    public Direccion() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param calle Nombre de la calle.
     * @param ciudad Ciudad de residencia.
     * @param region Región de residencia.
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    /**
     * Obtiene la calle.
     *
     * @return Calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Modifica la calle.
     *
     * @param calle Nueva calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene la ciudad.
     *
     * @return Ciudad.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Modifica la ciudad.
     *
     * @param ciudad Nueva ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene la región.
     *
     * @return Región.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Modifica la región.
     *
     * @param region Nueva región.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Devuelve la dirección completa.
     *
     * @return Dirección en formato texto.
     */
    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}
