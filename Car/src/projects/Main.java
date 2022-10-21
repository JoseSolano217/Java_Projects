package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Store store;
    Scanner numberKeyboard;
    Scanner wordKeyboard;
    Scanner wordKeyboard2;
    public static void main(String[] args) {
        Main m = new Main();
        m.store = new Store();
        m.numberKeyboard = new Scanner(System.in);
        m.wordKeyboard = new Scanner(System.in);
        m.wordKeyboard2 = new Scanner(System.in);
        boolean check = false;
        int count = 0;
        while (!check) {
            System.out.println("Select an option");
            System.out.println("""
                    1. Register cars
                    2. Sell cars
                    3. See cars
                    4. See sold cars
                    5. Search price
                    6. Search model
                    7. Order by price
                    8. Order by model
                    9. Exit
                    """);
            switch (m.numberKeyboard.nextInt()) {
                case 1 -> {
                    System.out.println("What kind of car is it?");
                    System.out.println("""
                            1. Common
                            2. Public
                            """);
                    int registChoice = m.numberKeyboard.nextInt();
                    Vehicle vehicle = new Vehicle();
                    switch (registChoice) {
                        case 1 -> {
                            count++;
                            vehicle = new Common();
                            vehicle.setId(count);
                            System.out.println("Input the fuel type");
                            vehicle.setFuelType(m.wordKeyboard.nextLine());
                            System.out.println("Input the price of the car");
                            vehicle.setValue(m.numberKeyboard.nextInt());
                            System.out.println("Input the model of the car");
                            vehicle.setModel(m.numberKeyboard.nextInt());
                            System.out.println("Input the state of the car");
                            vehicle.setState(m.wordKeyboard2.nextLine());
                            Common common = (Common) vehicle;
                            System.out.println("Input the amount of doors");
                            common.setDoors(m.numberKeyboard.nextInt());
                            System.out.println("Input the color of the car");
                            common.setColor(m.wordKeyboard.nextLine());
                            System.out.println("Input the Engine of the car");
                            common.setEngineType(m.wordKeyboard2.nextLine());
                            m.store.registerVehicle(common);
                        }
                        case 2 -> {
                            count++;
                            vehicle = new Public();
                            vehicle.setId(count);
                            System.out.println("Input the fuel type");
                            vehicle.setFuelType(m.wordKeyboard.nextLine());
                            System.out.println("Input the price of the car");
                            vehicle.setValue(m.numberKeyboard.nextInt());
                            System.out.println("Input the model of the car");
                            vehicle.setModel(m.numberKeyboard.nextInt());
                            System.out.println("Input the state of the car");
                            vehicle.setState(m.wordKeyboard2.nextLine());
                            Public publics = (Public) vehicle;
                            System.out.println("Input the max person capacity");
                            publics.setCapacity(m.numberKeyboard.nextInt());
                            System.out.println("Input the type of vehicle");
                            publics.setType(m.wordKeyboard.nextLine());
                            System.out.println("Input the occupied value(True o False)");
                            publics.setOccupied(m.numberKeyboard.nextBoolean());
                            m.store.registerVehicle(publics);
                        }
                        default -> System.out.println("No");
                    }
                }
                case 2 -> {
                    System.out.println("What kind of car will be sold?");
                    System.out.println("""
                            1. Common
                            2. Public
                            """);
                    int sellChoice = m.numberKeyboard.nextInt();
                    System.out.println("Select the car to be sold (Use the id number)");
                    switch (sellChoice) {
                        case 1 -> {
                            for (int i = 0; i < m.store.getAvalibleCommons().size(); i++) {
                                System.out.println(m.store.getAvalibleCommons().get(i));
                            }
                            int choice = m.numberKeyboard.nextInt();
                            for (int i = 0; i < m.store.getAvalibleCommons().size(); i++) {
                                if (m.store.getAvalibleCommons().get(i).getId() == choice) {
                                    m.store.sellVehicle(m.store.getAvalibleCommons().get(i));
                                    break;
                                }
                            }
                            System.out.println("Finished");
                        }
                        case 2 -> {
                            for (int i = 0; i < m.store.getAvaliblePublics().size(); i++) {
                                System.out.println(m.store.getAvaliblePublics().get(i));
                            }
                            int choice2 = m.numberKeyboard.nextInt();
                            for (int i = 0; i < m.store.getAvaliblePublics().size(); i++) {
                                if (m.store.getAvaliblePublics().get(i).getId() == choice2) {
                                    m.store.sellVehicle(m.store.getAvaliblePublics().get(i));
                                    break;
                                }
                            }
                            System.out.println("Finished");
                        }
                    }
                }
                case 3 -> {
                    List showVehicle = m.store.showVehicle();
                    System.out.println(m.store.getAvaliblePublics().size() + " " + m.store.getAvalibleCommons().size());
                    for (Object vehicle : showVehicle) {
                        System.out.println(vehicle.toString());
                    }
                }
                case 4 -> {
                    for (int i = 0; i < m.store.getSoldVehicles().size(); i++) {
                        System.out.println(m.store.getSoldVehicles().get(i));
                    }
                }
                case 5 -> {
                    System.out.println("What kind of car are you searching");
                    System.out.println("""
                            1. Common
                            2. Public
                            """);
                    int searchChoice = m.numberKeyboard.nextInt();
                    System.out.println("What price are you looking for?");
                    int price = m.numberKeyboard.nextInt();
                    List pList = m.store.searchVehiclePrice(searchChoice, price);
                    for (Object object: pList) {
                        System.out.println(object.toString());
                    }
                }
                case 6 -> {
                    System.out.println("What kind of car are you searching");
                    System.out.println("""
                            1. Common
                            2. Public
                            """);
                    int searchChoice = m.numberKeyboard.nextInt();
                    System.out.println("What model are you looking for?");
                    int model = m.numberKeyboard.nextInt();
                    List mList = m.store.searchVehicleModel(searchChoice, model);
                    for (Object object: mList) {
                        System.out.println(object.toString());
                    }
                }
                case 7 -> {
                    m.store.orderVehiclePrice();
                    System.out.println("Ordered, see show vehicle");
                }
                case 8 -> {
                    m.store.orderVehicleModel();
                    System.out.println("Ordered, see show vehicle");
                }
                case 9 -> check = true;
                default -> System.out.println("Egg");
            }
        }
    }
}
