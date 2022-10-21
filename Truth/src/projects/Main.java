package projects;

import projects.CustomData.Angle;
import projects.CustomData.MovementVector;
import projects.CustomData.Position;

public class Main {

    public static void main(String[] args) {
        Position position1 = new Position(0, 0);
        Position position2 = new Position(4, -20);
        Angle angle = new Angle(-5);
        MovementVector vector = new MovementVector(position1, position2, 4);
        System.out.println(angle);
    }
}
