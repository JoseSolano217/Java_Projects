package projects.CustomData;

public class MovementVector {
    private Angle angle;
    private Position ownPosition;
    private Position targetPosition;
    private double magnitude;

    public MovementVector(Angle angle, double magnitude) {
        this.angle = angle;
        this.magnitude = magnitude;
    }
    public MovementVector(Position positionTarget, Position positionOwn, double magnitude) {
        this.angle = new Angle(positionTarget, positionOwn);
        this.magnitude = magnitude;
        this.ownPosition = positionOwn;
        this.targetPosition = positionTarget;
    }

    @Override
    public String toString() {
        return  "Angle = " + angle + "\n" +
                "Magnitude = " + magnitude + "\n" +
                "Own Position = " + ownPosition + "\n" +
                "Target Position = " + targetPosition;
    }
}
