package Factory;

import Interface.ShapeDraw;
import projects.Circle;
import projects.Rectangulo;
import java.util.Locale;

public class ShapeFactory {
    public static ShapeDraw getShape(String shapeType) {
        switch (shapeType.toLowerCase(Locale.ROOT)) {
            case "rectangle" -> {
                return new Rectangulo();
            }
            case "circle" -> {
                return new Circle();
            }
            default -> {
                return null;
            }
        }
    }
}
