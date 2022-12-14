package ccreacion.abstractfactory;
public class AnimalFactory implements AbstractFactory<Animal> {
	 
    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } 
        if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
 
        return null;
    }
 
}