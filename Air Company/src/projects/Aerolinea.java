package projects;

import java.io.*;
import java.util.*;

public class Aerolinea implements Serializable{
    private HashMap<String, Trabajador> trabajadoresMap;
    private HashMap<String, Cliente> clientesMap;
    private List<Ciudad> ciudades;
    private List<Ruta> vuelos;

    public Aerolinea() {
        this.trabajadoresMap = new HashMap<>();
        this.clientesMap = new HashMap<>();
        this.ciudades = new ArrayList<>();
        this.vuelos = new ArrayList<>();
    }

    public HashMap<String, Trabajador> getTrabajadoresMap() {
        return trabajadoresMap;
    }
    public HashMap<String, Cliente> getClientesMap() {
        return clientesMap;
    }
    public List<Ruta> getVuelos() {
        return vuelos;
    }
    public void setVuelos(List<Ruta> vuelos) {
        this.vuelos = vuelos;
    }
    public List<Ciudad> getCiudades() {
        return ciudades;
    }
    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    //---------------------------------------------Admin------------------------------------------------------

    public Tiquete dispensarTiquetes(Ruta vuelo, Cliente cliente, String fecha) {
        Tiquete tiquete = new Tiquete(vuelo, fecha);
        cliente.addTicket(tiquete);
        return tiquete;
    }

    public boolean revisarLoginCliente(String nombre, String pass) {
        Cliente cliente = buscarCliente(nombre);
        return pass.equals(cliente.getPassword());
    }

    public boolean revisarLoginTrabajador(String nombre, String pass) {
        Trabajador trabajador = buscarTrabajador(nombre);
        return pass.equals(trabajador.getPassword());
    }

    // ----------------------------------------------Clientes--------------------------------------------------

    // Mas rapido que agregarCliente, pero solo puede usarse al inicio
    public void guardarCliente(Cliente cliente) {
        clientesMap.put(String.valueOf(this.clientesMap.size()), cliente);
    }

    // Mas lento, pero permite revisar si el cliente ya existe o no
    public void agregarCliente(Cliente cliente) {
        for (Cliente cliente1 : clientesMap.values()) {
            if (cliente1.getNombre().equals(cliente.getNombre()) || cliente1.getPassword().equals(cliente.getPassword())) {
                return;
            }
        }
        clientesMap.put(String.valueOf(this.clientesMap.size()), cliente);
    }

    public Cliente buscarCliente(String nombre) {
        for (int i = 0; i < clientesMap.size(); i++) {
            if (clientesMap.get(String.valueOf(i)).getNombre().equals(nombre)) {
                return clientesMap.get(String.valueOf(i));
            }
        }
        return null;
    }

    //--------------------------------------------Trabajadores-------------------------------------------------

    public Trabajador buscarTrabajador(String nombre) {
        for (int i = 0; i < trabajadoresMap.size(); i++) {
            if (trabajadoresMap.get(String.valueOf(i)).getNombre().equals(nombre)) {
                return trabajadoresMap.get(String.valueOf(i));
            }
        }
        return null;
    }

    public void guardarTrabajador(Trabajador trabajador) {
        this.trabajadoresMap.put(String.valueOf(this.trabajadoresMap.size()), trabajador);
    }

    //-------------------------------------------Ciudades y rutas----------------------------------------------

    public void guardarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    public void crearVuelos(Ciudad ciudad) {
        for (Ciudad ciudad1 : ciudad.getCiudadesDisponibles()) {
            vuelos.add(new Ruta(ciudad, ciudad1));
        }
    }

    public Ciudad buscarCiudades(String nombre) {
        for (Ciudad ciudad1: this.ciudades) {
            if (ciudad1.getNombre().equals(nombre)) {
                return ciudad1;
            }
        }
        return null;
    }

    public List<Ruta> buscarRutas(Ciudad ciudad) {
        List<Ruta> rutas = new ArrayList<>();
        for (Ruta ruta : this.vuelos) {
            if (ruta.getOrigen().getNombre().equals(ciudad.getNombre())) {
                rutas.add(ruta);
            }
        }
        return rutas;
    }

    public void crearVuelosIniciales() {
        for (Ciudad ciudad : ciudades) {
            for (Ciudad ciudad1 : ciudad.getCiudadesDisponibles()) {
                this.vuelos.add(new Ruta(ciudad, ciudad1));
            }
        }
    }

    public void verVuelosCiudad(Ciudad ciudad) {
        for (Ruta vuelo : vuelos) {
            if (vuelo.getOrigen().getNombre().equals(ciudad.getNombre())) {
                System.out.println("Hay un vuelo disponible desde la ciudad " + vuelo.getOrigen().getNombre() + " a la ciudad " + vuelo.getDestino().getNombre());
            }
        }
    }

    public void verTodosVuelos(Ciudad ciudad, List<String> listaCiudadesRevisadas) {
        List<Ruta> vuelosCiudad = buscarRutas(ciudad);
        if (!listaCiudadesRevisadas.contains(ciudad.getNombre())) {
            if (vuelosCiudad.size() > 0) {
                System.out.println("La ciudad " + ciudad.getNombre() + " no está vacía, empezando operaciones");
                for (Ruta ruta : vuelosCiudad) {
                    System.out.println("Hay un vuelo disponible de " + ciudad.getNombre() + " a " + ruta.getDestino().getNombre());
                    listaCiudadesRevisadas.add(ruta.getOrigen().getNombre());
                    verTodosVuelos(ruta.getDestino(), listaCiudadesRevisadas);
                }
            }
        } else {
            System.out.println("La ciudad " + ciudad.getNombre() + " no tiene ningun vuelo disponible o sus vuelos ya fueron listados");
        }
    }

    public Ruta buscarVuelos(Ciudad origen, Ciudad destino) {
        for (Ruta ruta : vuelos) {
            if (ruta.getOrigen().getNombre().equals(origen.getNombre()) || ruta.getDestino().getNombre().equals(destino.getNombre())) {
                return ruta;
            }
        }
        return null;
    }
}
