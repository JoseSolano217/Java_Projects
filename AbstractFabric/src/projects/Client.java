package ccreacion.abstractfactory;

public class Client {
   public static void main(String[] args) {
	   AbstractFactory abstractFactory;
       
       //creating a brown toy dog
       abstractFactory = FactoryProvider.getFactory("Animal");
       Animal animal = (Animal) abstractFactory.create("Dog");
       
       abstractFactory = FactoryProvider.getFactory("Color");
       Color color =(Color) abstractFactory.create("White");
       
       String result = "A " + animal.getAnimal() + " with color " + color.getColor() + " sonido:  " + animal.makeSound();
       System.out.println(result);
   }
}
