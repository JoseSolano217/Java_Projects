package projects;

public class Ruta {
    private Ciudad origen;
    private Ciudad destino;
    private double millas;

    public Ruta() {
        this.origen = new Ciudad();
        this.destino = new Ciudad();
        calcularMillas();
    }

    public Ruta(Ciudad origen, Ciudad destino) {
        this.origen = origen;
        this.destino = destino;
        calcularMillas();
    }

    public Ciudad getOrigen() {
        return origen;
    }
    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }
    public Ciudad getDestino() {
        return destino;
    }
    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }
    public double getMillas() {
        return millas;
    }
    public void setMillas(double millas) {
        this.millas = millas;
    }

    public double coordenadasAMillas(int num) {
        // 1 unidad(coordenadas) = 3.4 millas
        return num*3.4;
    }

    public void calcularMillas() {
        double a = Math.abs(coordenadasAMillas(origen.getCoordenadas()[1])-coordenadasAMillas(destino.getCoordenadas()[1]));
        double b = Math.abs(coordenadasAMillas(origen.getCoordenadas()[0])-coordenadasAMillas(destino.getCoordenadas()[0]));
        this.millas = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public String toString() {
        return "\nRuta:" +
                "\nOrigen=" + origen +
                "\nDestino=" + destino +
                "\nMillas=" + millas;
    }
}
