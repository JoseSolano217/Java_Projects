package projects.CustomData;

public class Position {
    private int posX;
    private int posY;

    public Position(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public Position(Angle angle) {
        Position temp = angleToPosition(angle.getAngle());
        this.posX = temp.getPosX();
        this.posY = temp.getPosY();
    }

    public Position angleToPosition(double x) {
        if (x < 0){
            return angleToPosition(-x);
        }
        double tolerance = 1.0E-6;
        double h1=1; double h2=0;
        double k1=0; double k2=1;
        double b = x;
        do {
            double a = Math.floor(b);
            double aux = h1; h1 = a*h1+h2; h2 = aux;
            aux = k1; k1 = a*k1+k2; k2 = aux;
            b = 1/(b-a);
        } while (Math.abs(x-h1/k1) > x*tolerance);
        return new Position((int)h1, (int)k1);
    }

    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return  posX + "," + posY;
    }
}
