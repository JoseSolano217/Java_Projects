package projects;

public class Bomb {
    private Double value;
    private int ammount;

    public Bomb(){}

    public Bomb(Double value, int ammount) {
        this.value = value;
        this.ammount = ammount;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }


}
