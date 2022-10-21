package projects;

public class Token {
    private String color;
    private int number;

    public Token() {
    }

    public Token(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Token{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
