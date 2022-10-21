package projects;

import java.io.Serializable;

public class Trabajador extends Usuario implements Serializable {

    private Ruta origenDestino;
    private double tiempoRuta;
    private String horario;
    private boolean enVuelo;

    public Trabajador() {
        super();
        this.origenDestino = new Ruta();
        this.tiempoRuta = 0;
        this.horario = "";
        this.enVuelo = false;
    }

    public Trabajador(String nombre, String password) {
        super(2, nombre, password);
        this.origenDestino = new Ruta();
        this.tiempoRuta = 0;
        this.horario = "";
        this.enVuelo = false;
    }

    public Trabajador(String nombre, String password, Ruta origenDestino, double tiempoRuta, String horario, boolean enVuelo) {
        super(2, nombre, password);
        this.origenDestino = origenDestino;
        this.tiempoRuta = tiempoRuta;
        this.horario = horario;
        this.enVuelo = enVuelo;
    }

    public Ruta getOrigenDestino() {
        return origenDestino;
    }
    public void setOrigenDestino(Ruta origenDestino) {
        this.origenDestino = origenDestino;
    }
    public double getTiempoRuta() {
        return tiempoRuta;
    }
    public void setTiempoRuta(double tiempoRuta) {
        this.tiempoRuta = tiempoRuta;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public boolean isEnVuelo() {
        return enVuelo;
    }
    public void setEnVuelo(boolean enVuelo) {
        this.enVuelo = enVuelo;
    }

    public void darTiempo(Ruta ruta) {
        // Velocidad promedio de un vuelo = 575 millas por hora
        this.tiempoRuta = ruta.getMillas()/575;
    }

    public String estadoToString() {
        if (this.enVuelo) {
            return "Vuelo en curso";
        }
        return "En tierra";
    }

    public void actualizarEstados() {
        if (this.origenDestino != null) {
            darTiempo(this.origenDestino);
            this.horario = "Vuelo desde " + this.origenDestino.getOrigen().getNombre() + " a "
                    + this.origenDestino.getDestino().getNombre() + ", tiempo estimado: " + this.tiempoRuta +
                    " horas";
            this.enVuelo = true;
        } else {
            this.tiempoRuta = 0.0;
            this.horario = "Ningun vuelo en curso para este trabajador";
            this.enVuelo = false;
        }
    }

    @Override
    public String toString() {
        return  "\n" + super.toString() +
                "\nOrigenDestino=" + origenDestino +
                "\nTiempoRuta=" + tiempoRuta +
                "\nHorario='" + horario + '\'' +
                "\nEstado=" + estadoToString();
    }
}
