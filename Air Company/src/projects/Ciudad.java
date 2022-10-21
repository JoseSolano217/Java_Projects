package projects;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private String nombre;
    private String pais;
    private Double altura;
    private String clima;
    private int[] coordenadas;
    private List<Ciudad> ciudadesDisponibles;

    public Ciudad() {
        this.nombre = "";
        this.pais = "";
        this.altura = 0.0;
        this.clima = "";
        this.coordenadas = new int[]{0, 0};
        this.ciudadesDisponibles = new ArrayList<>();
    }

    public Ciudad(String nombre, String pais, Double altura, String clima, int[] coordenadas) {
        this.nombre = nombre;
        this.pais = pais;
        this.altura = altura;
        this.clima = clima;
        this.coordenadas = coordenadas;
    }

    public Ciudad(String nombre, String pais, Double altura, String clima, int[] coordenadas, List<Ciudad> ciudadesDisponibles) {
        this.nombre = nombre;
        this.pais = pais;
        this.altura = altura;
        this.clima = clima;
        this.coordenadas = coordenadas;
        this.ciudadesDisponibles = ciudadesDisponibles;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public String getClima() {
        return clima;
    }
    public void setClima(String clima) {
        this.clima = clima;
    }
    public int[] getCoordenadas() {
        return coordenadas;
    }
    public void setCoordenadas() {
        this.coordenadas = new int[2];
    }
    public List<Ciudad> getCiudadesDisponibles() {
        return ciudadesDisponibles;
    }
    public void setCiudadesDisponibles(List<Ciudad> ciudadesDisponibles) {
        this.ciudadesDisponibles = ciudadesDisponibles;
    }

    public void addCiudad(Ciudad ciudad) {
        this.ciudadesDisponibles.add(ciudad);
    }

    @Override
    public String toString() {
        return "\n" + nombre +
                "\n" + "Coordenadas: " + coordenadas[0] + "," + coordenadas[1];
    }
}
