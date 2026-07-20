package model;

/**
 * Representa la reserva de un tour realizada por un cliente.
 * @author Jorge Munoz Leon
 */
public class Reserva {

    private Cliente cliente;
    private Tour tour;
    private String fecha;

    /**
     * Constructor vacío.
     */
    public Reserva() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param cliente Cliente que realiza la reserva.
     * @param tour Tour reservado.
     * @param fecha Fecha de la reserva.
     */
    public Reserva(Cliente cliente, Tour tour, String fecha) {
        this.cliente = cliente;
        this.tour = tour;
        this.fecha = fecha;
    }

    /**
     * Obtiene el cliente.
     *
     * @return Cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Modifica el cliente.
     *
     * @param cliente Nuevo cliente.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el tour.
     *
     * @return Tour.
     */
    public Tour getTour() {
        return tour;
    }

    /**
     * Modifica el tour.
     *
     * @param tour Nuevo tour.
     */
    public void setTour(Tour tour) {
        this.tour = tour;
    }

    /**
     * Obtiene la fecha de la reserva.
     *
     * @return Fecha.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Modifica la fecha de la reserva.
     *
     * @param fecha Nueva fecha.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve la información de la reserva.
     *
     * @return Información de la reserva.
     */
    @Override
    public String toString() {
        return "===== RESERVA =====" +
                "\nFecha: " + fecha +
                "\n\n--- Cliente ---\n" +
                cliente +
                "\n\n--- Tour ---\n" +
                tour;
    }
}