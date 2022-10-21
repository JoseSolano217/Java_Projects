package projects;

public class Client {
    private String name;
    private int age;
    private int number;

    public Client() {
    }

    public Client(String name, int age, int number) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
