package data;

import exceptions.RutInvalidoException;
import model.Cliente;
import model.Direccion;
import model.GuiaTuristico;
import model.Proveedor;
import model.Rut;
import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de leer archivos de texto y convertirlos en objetos.
 * @author Jorge Munoz Leon
 */

public class GestorDatos {

    /**
     * Lee los clientes desde un archivo.
     *
     * Formato:
     * nombre;rut;calle;ciudad;region;telefono;correo
     *
     * @param rutaArchivo Ruta del archivo.
     * @return Lista de clientes.
     */
    public ArrayList<Cliente> leerClientes(String rutaArchivo) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 7) {

                    try {

                        Rut rut = new Rut(datos[1]);

                        Direccion direccion = new Direccion(
                                datos[2],
                                datos[3],
                                datos[4]);

                        Cliente cliente = new Cliente(
                                datos[0],
                                rut,
                                direccion,
                                datos[5],
                                datos[6]);

                        clientes.add(cliente);

                    } catch (RutInvalidoException e) {

                        System.out.println("Cliente no cargado: " + e.getMessage());

                    }

                }

            }

        } catch (IOException e) {

            System.out.println("Error al leer clientes: " + e.getMessage());

        }

        return clientes;

    }

    /**
     * Lee los guías turísticos desde un archivo.
     *
     * Formato:
     * nombre;rut;calle;ciudad;region;telefono;especialidad
     *
     * @param rutaArchivo Ruta del archivo.
     * @return Lista de guías turísticos.
     */
    public ArrayList<GuiaTuristico> leerGuias(String rutaArchivo) {

        ArrayList<GuiaTuristico> guias = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 7) {

                    try {

                        Rut rut = new Rut(datos[1]);

                        Direccion direccion = new Direccion(
                                datos[2],
                                datos[3],
                                datos[4]);

                        GuiaTuristico guia = new GuiaTuristico(
                                datos[0],
                                rut,
                                direccion,
                                datos[5],
                                datos[6]);

                        guias.add(guia);

                    } catch (RutInvalidoException e) {

                        System.out.println("Guía no cargado: " + e.getMessage());

                    }

                }

            }

        } catch (IOException e) {

            System.out.println("Error al leer guías: " + e.getMessage());

        }

        return guias;

    }

    /**
     * Lee los proveedores desde un archivo.
     *
     * Formato:
     * nombre;rut;calle;ciudad;region;telefono;servicio
     *
     * @param rutaArchivo Ruta del archivo.
     * @return Lista de proveedores.
     */
    public ArrayList<Proveedor> leerProveedores(String rutaArchivo) {

        ArrayList<Proveedor> proveedores = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 7) {

                    try {

                        Rut rut = new Rut(datos[1]);

                        Direccion direccion = new Direccion(
                                datos[2],
                                datos[3],
                                datos[4]);

                        Proveedor proveedor = new Proveedor(
                                datos[0],
                                rut,
                                direccion,
                                datos[5],
                                datos[6]);

                        proveedores.add(proveedor);

                    } catch (RutInvalidoException e) {

                        System.out.println("Proveedor no cargado: " + e.getMessage());

                    }

                }

            }

        } catch (IOException e) {

            System.out.println("Error al leer proveedores: " + e.getMessage());

        }

        return proveedores;

    }

    /**
     * Lee los tours desde un archivo.
     *
     * Formato:
     * nombre;destino;precio;duracion
     *
     * @param rutaArchivo Ruta del archivo.
     * @return Lista de tours.
     */
    public ArrayList<Tour> leerTours(String rutaArchivo) {

        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 4) {

                    Tour tour = new Tour(
                            datos[0],
                            datos[1],
                            Double.parseDouble(datos[2]),
                            Integer.parseInt(datos[3]));

                    tours.add(tour);

                }

            }

        } catch (IOException e) {

            System.out.println("Error al leer tours: " + e.getMessage());

        }

        return tours;

    }

}