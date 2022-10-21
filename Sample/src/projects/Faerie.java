package projects;
import projects.Enemie;

public class Faerie extends Enemie{
    private String pattern;

    public Faerie(){
        super();
    }

    public Faerie(int life, String name, String pattern){
        super(life, name);
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
