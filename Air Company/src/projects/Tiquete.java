package projects;

public class Tiquete {
    private Ruta ruta;
    private String fecha;

    public Tiquete() {
        this.ruta = new Ruta();
        this.fecha = "";
    }

    public Tiquete(Ruta ruta, String fecha) {
        this.ruta = ruta;
        this.fecha = fecha;
    }

    public Ruta getRuta() {
        return ruta;
    }

    @Override
    public String toString() {
        return "\nInformación del tiquete: " +
                "\nOrigen: " + ruta.getOrigen() +
                "\nDestino: " + ruta.getDestino() +
                "\nFecha de salida: " + fecha;
    }
}
