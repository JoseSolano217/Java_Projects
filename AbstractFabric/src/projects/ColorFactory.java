package ccreacion.abstractfactory;
public class ColorFactory implements AbstractFactory<Color> {
	 
    @Override
    public Color create(String type) {
        if ("white".equalsIgnoreCase(type)) {
            return new White();
        } 
        if ("Duck".equalsIgnoreCase(type)) {
            return new Black();
        }
 
        return null;
    }
 
}