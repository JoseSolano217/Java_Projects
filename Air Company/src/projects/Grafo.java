package projects;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Ciudad> ciudades;

    public Grafo() {
        this.ciudades = new ArrayList<>();
    }

    public Grafo(List<Ciudad> ciudades, List<Ruta> vuelos) {
        this.ciudades = ciudades;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }
    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public List<Ruta> crearRutas(Ciudad ciudad) {
        List<Ruta> rutas = new ArrayList<>();
        for (Ciudad ciudad1 : ciudad.getCiudadesDisponibles()) {
            rutas.add(new Ruta(ciudad, ciudad1));
        }
        return rutas;
    }

    public void guardarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

}
