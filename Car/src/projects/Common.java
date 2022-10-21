package projects;

public class Common extends Vehicle{
    private int doors;
    private String color;
    private String engineType;

    public Common() {
        super();
    }

    public Common(int id, int value, String fuelType, Integer model, String state, int doors, String color, String engineType) {
        super(id, value, fuelType, model, state);
        this.doors = doors;
        this.color = color;
        this.engineType = engineType;
    }

    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Common vehicle: " +
                "\nId: " + super.getId() +
                "\nValue: " + super.getValue() +
                "\nFuel Type: " + super.getFuelType() +
                "\nModel: " + super.getModel() +
                "\nState: " + super.getState() +
                "\nDoors: " + doors +
                "\nColor: " + color +
                "\nEngine Type: " + engineType + "\n";
    }
}
