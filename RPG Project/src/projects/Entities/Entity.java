package projects.Entities;

import projects.data.Move;
import java.util.List;

public abstract class Entity {
    private int healt;
    private double attack;
    private int defense;
    private List<Move> moves;

    public Entity(int healt, double attack, int defense, int[] moves) {
        this.healt = healt;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Entity:" +
                "\nHealt=" + healt +
                "\nAttack=" + attack +
                "\nDefense=" + defense +
                "\nMoves:" + moves;
    }
}
