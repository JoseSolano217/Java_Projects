package app;

public class Stat {
    private final String name;
    private int quantity;

    public Stat(String name, int quantity) {
        this.name = name;
        this.quantity = Math.max(quantity, 0);
    }

    public void recalculateStat(float statPercent) {
        int statNum = 0;
        statNum = (int) Math.floor(quantity*100/statPercent);
        if (statNum > 255) {
            statNum = 255;
        } else statNum = Math.max(statNum, 0);
        quantity = statNum;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
