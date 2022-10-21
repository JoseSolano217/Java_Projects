package projects;

public class Student {
    private String name;
    private double note;

    public Student(){};

    public Student(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Nombre = " + name +
                "\nNota = " + note;
    }
}
