package projects;

public class Vehicle {
    private int id;
    private int value;
    private String fuelType;
    private Integer model;
    private String state;

    public Vehicle() {
    }

    public Vehicle(int id, int value, String fuelType, Integer model, String state) {
        this.id = id;
        this.value = value;
        this.fuelType = fuelType;
        this.model = model;
        this.state = state;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public Integer getModel() {
        return model;
    }
    public void setModel(Integer model) {
        this.model = model;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                "\nId: " + id +
                "\nValue: " + value +
                "\nFuel Type: " + fuelType +
                "\nModel: " + model +
                "\nState: " + state + "\n";
    }
}
