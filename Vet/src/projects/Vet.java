package projects;
import java.util.Arrays;
import java.util.Scanner;

public class Vet {
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Vet m = new Vet();
        System.out.println("Input the amount of pets to be registered");
        Pet[] pets = new Pet[m.keyboard.nextInt()];
        for (int i = 0; i < pets.length; i++) {
            Pet pet = new Pet();
            pets[i] = pet;
            System.out.println("Input the illness of the pet " + (i + 1));
            String illness = m.keyboard.next();
            System.out.println("Input the name of the pet " + (i + 1));
            String name = m.keyboard.next();
            System.out.println("Input the species of the pet " + (i + 1));
            String species = m.keyboard.next();
            System.out.println("Input the priority of the pet " + (i + 1) + " (from 1 to 5, 5 being the least important)");
            int priority = m.keyboard.nextInt();
            pets[i].register(i + 1, illness, species, priority, name);
        }
        boolean check = false;
        while (!check) {
            switch (m.menu()) {
                case 1 -> {
                    quicksort(pets, 0, pets.length - 1);
                    for (Pet ignored : pets) {
                        System.out.println(Arrays.toString(pets));
                    }
                }
                case 2 -> {
                    System.out.println("Name of the pet: ");
                    String name = m.keyboard.next();
                    for (Pet pet : pets) {
                        if (pet.name.equals(name)) {
                            System.out.println(Arrays.toString(pets));
                            break;
                        }
                    }
                }
                case 3 -> check = true;
                default -> System.out.println("No");
            }
        }
    }

    public int menu() {
        System.out.println("""
                Select an option
                1. See pets (Sort by priority)
                2. Search pet
                3. Exit
                """);
        return keyboard.nextInt();
    }

    public static void quicksort(Pet[] v, int left, int right) {
        int pivot = v[0].getPriority();
        int i = left;
        int j = right;
        Pet temp;
        while(i < j){
            while(v[i].getPriority() <= pivot && i < j)
                i++;
            while(v[j].getPriority() > pivot)
                j--;
            if (i < j) {
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
        v[left] = v[j];
        v[j].priority = pivot;
        if(left < j - 1)
            quicksort(v,left,j - 1);
        if(j + 1 < right)
            quicksort(v,j + 1,right);
    }
}
