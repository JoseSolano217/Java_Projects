package projects;

public class Public extends Vehicle{
    private int capacity;
    private String type;
    private boolean occupied;

    public Public() {
        super();
    }

    public Public(int id, int value, String fuelType, Integer model, String state, int capacity, String type, boolean occupied) {
        super(id, value, fuelType, model, state);
        this.capacity = capacity;
        this.type = type;
        this.occupied = occupied;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
        return "Public vehicle: " +
                "\nId: " + super.getId() +
                "\nValue: " + super.getValue() +
                "\nFuel Type: " + super.getFuelType() +
                "\nModel: " + super.getModel() +
                "\nState: " + super.getState() +
                "\nCapacity: " + capacity +
                "\nType: " + type +
                "\nOccupied: " + occupied + "\n";
    }
}
