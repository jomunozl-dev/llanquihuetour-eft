package service;

import interfaces.Registrable;
import model.Cliente;
import model.GuiaTuristico;
import model.Proveedor;
import model.Reserva;
import model.Tour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Administra la información del sistema turístico.
 * @author Jorge Munoz Leon
 */
public class SistemaTurismo {

    private ArrayList<Cliente> clientes;
    private ArrayList<GuiaTuristico> guias;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Tour> tours;
    private ArrayList<Reserva> reservas;

    private HashMap<String, Cliente> mapaClientes;

    private List<Registrable> registros;

    /**
     * Constructor.
     */
    public SistemaTurismo() {

        clientes = new ArrayList<>();
        guias = new ArrayList<>();
        proveedores = new ArrayList<>();
        tours = new ArrayList<>();
        reservas = new ArrayList<>();

        mapaClientes = new HashMap<>();

        registros = new ArrayList<>();
    }

    //==========================
    // AGREGAR
    //==========================

    public void agregarCliente(Cliente cliente) {

        clientes.add(cliente);
        mapaClientes.put(cliente.getRut().getNumero(), cliente);
        registros.add(cliente);

    }

    public void agregarGuia(GuiaTuristico guia) {

        guias.add(guia);
        registros.add(guia);

    }

    public void agregarProveedor(Proveedor proveedor) {

        proveedores.add(proveedor);
        registros.add(proveedor);

    }

    public void agregarTour(Tour tour) {

        tours.add(tour);

    }

    public void agregarReserva(Reserva reserva) {

        reservas.add(reserva);

    }

    //==========================
    // MOSTRAR
    //==========================

    public void mostrarClientes() {

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            System.out.println("---------------------");
        }

    }

    public void mostrarTours() {

        for (Tour tour : tours) {
            System.out.println(tour);
            System.out.println("---------------------");
        }

    }

    public void mostrarReservas() {

        for (Reserva reserva : reservas) {
            System.out.println(reserva);
            System.out.println("---------------------");
        }

    }

    //==========================
    // BUSCAR
    //==========================

    public Cliente buscarCliente(String rut) {

        return mapaClientes.get(rut);

    }

    //==========================
    // POLIMORFISMO
    //==========================

    public void mostrarRegistros() {

        for (Registrable registro : registros) {

            registro.mostrarDatos();

            System.out.println("---------------------");

        }

    }

    //==========================
    // INSTANCEOF
    //==========================

    public void mostrarTipoPersona() {

        for (Registrable registro : registros) {

            if (registro instanceof Cliente) {

                System.out.println("Cliente");

            } else if (registro instanceof GuiaTuristico) {

                System.out.println("Guía Turístico");

            } else if (registro instanceof Proveedor) {

                System.out.println("Proveedor");

            }

        }

    }

}