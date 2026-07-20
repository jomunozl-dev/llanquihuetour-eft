package app;

import data.GestorDatos;
import model.Cliente;
import model.GuiaTuristico;
import model.Proveedor;
import model.Tour;
import service.SistemaTurismo;

import java.util.ArrayList;

/**
 * Clase principal del sistema.
 * @author Jorge Munoz Leon
 */
public class Main {

    public static void main(String[] args) {

        SistemaTurismo sistema = new SistemaTurismo();
        GestorDatos gestor = new GestorDatos();

        // Leer archivos
        ArrayList<Cliente> clientes =
                gestor.leerClientes("resources/clientes.txt");

        ArrayList<GuiaTuristico> guias =
                gestor.leerGuias("resources/guias.txt");

        ArrayList<Proveedor> proveedores =
                gestor.leerProveedores("resources/proveedores.txt");

        ArrayList<Tour> tours =
                gestor.leerTours("resources/tours.txt");

        // Agregar clientes
        for (Cliente cliente : clientes) {
            sistema.agregarCliente(cliente);
        }

        // Agregar guías
        for (GuiaTuristico guia : guias) {
            sistema.agregarGuia(guia);
        }

        // Agregar proveedores
        for (Proveedor proveedor : proveedores) {
            sistema.agregarProveedor(proveedor);
        }

        // Agregar tours
        for (Tour tour : tours) {
            sistema.agregarTour(tour);
        }

        // Mostrar información
        System.out.println("===== CLIENTES =====");
        sistema.mostrarClientes();

        System.out.println("\n===== TOURS =====");
        sistema.mostrarTours();

        // Polimorfismo
        System.out.println("\n===== REGISTROS =====");
        sistema.mostrarRegistros();

        // instanceof
        System.out.println("\n===== TIPOS =====");
        sistema.mostrarTipoPersona();

    }

}