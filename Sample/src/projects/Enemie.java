package projects;

public class Enemie {

    private int life;
    private String name;

    public Enemie(){

    }

    public Enemie(int life, String name){
        this.life = life;
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hp(int damage){

    }
}
