package projects;

public class Pet {
    public String name;
    public int id;
    public String type;
    public String illness;
    public int priority;

    public Pet() {
    }

    public Pet(String name, int id, String type, String illness, int priority) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.illness = illness;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getIllness() {
        return illness;
    }
    public void setIllness(String illness) {
        this.illness = illness;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void register(int id, String illness, String type, int priority, String name) {
            setId(id);
            setIllness(illness);
            setType(type);
            setPriority(priority);
            setName(name);
    }

    @Override
    public String toString() {
        return "\nPet: " +
                "\nName = " + name +
                "\nId=" + id +
                "\nType='" + type +
                "\nIllness='" + illness +
                "\nPriority=" + priority;
    }
}
