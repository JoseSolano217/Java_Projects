package projects.data;
import java.io.Serializable;

public class Move implements Serializable{
    private int id;
    private String name;
    private int strenght;
    private double accuracy;
    private boolean isMagic;
    private boolean isPhysical;

    public Move(int id, String name, int strenght, double accuracy, boolean isMagic, boolean isPhysical) {
        this.name = name;
        this.strenght = strenght;
        this.accuracy = accuracy;
        this.isMagic = isMagic;
        this.isPhysical = isPhysical;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public boolean isMagic() {
        return isMagic;
    }

    public void setMagic(boolean magic) {
        isMagic = magic;
    }

    public boolean isPhysical() {
        return isPhysical;
    }

    public void setPhysical(boolean physical) {
        isPhysical = physical;
    }

    @Override
    public String toString() {
        return "Move: " +
                "\nId:" + id +
                "\nName:" + name +
                "\nStrength:" + strenght +
                "\nAccuracy:" + accuracy +
                "\nIs magic:" + isMagic +
                "\nIs physical:" + isPhysical;
    }
}
