package projects;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{

    private List<Tiquete> historial;
    private int millas;

    public Cliente() {
        super();
        this.historial = new ArrayList<>();
        this.millas = 0;
    }

    public Cliente(String nombre, String password, List<Tiquete> historial) {
        super(1, nombre, password);
        this.historial = historial;
        this.millas = 0;
    }

    public List<Tiquete> getHistorial() {
        return historial;
    }
    public void setHistorial(List<Tiquete> historial) {
        this.historial = historial;
    }
    public int getMillas() {
        return millas;
    }
    public void setMillas(int millas) {
        this.millas = millas;
    }

    public void addTicket(Tiquete tiquete) {
        historial.add(tiquete);
        this.millas += tiquete.getRuta().getMillas();
    }

    public void addMiles(Ruta ruta) {
        this.millas += ruta.getMillas();
    }



    @Override
    public String toString() {
        return "Cliente{" +
                super.toString() +
                "historial=" + historial +
                ", millas=" + millas +
                '}';
    }
}
