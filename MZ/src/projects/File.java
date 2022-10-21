package projects;

public class File {
    public String name;
    public String type;
    public double size;

    public File(String name, String type, double size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public File() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
