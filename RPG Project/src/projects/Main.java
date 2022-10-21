package projects;

import projects.Entities.Enemy;
import projects.data.Move;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Move[] moves = new Move[9];
        /*Move moveBasic = new Move(0, "Attack", 1, 0.8, false, true);
        Move move1 = new Move(1, "Hyper Beam", 8, 0.8, true, false);
        Move move2 = new Move(2, "Magic-Powered Tackle", 4, 0.9, false, true);
        Move move3 = new Move(3, "Star Comet", 6, 1, true, false);
        Move move4 = new Move(4, "Galaxy of Brightness", 5, 1, true, false);
        Move move5 = new Move(5, "Sphere Wall", 4, 1, true, false);
        Move move6 = new Move(6, "Magic Cube", 2, 1, true, false);
        Move move7 = new Move(7, "Light Binding", 2, 0.9, true, true);
        Move move8 = new Move(8, "Super Nova", 10, 0.6, true, false);

        Move[] moves = {moveBasic, move1, move2, move3, move4, move5, move6, move7, move8};

        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\USUARIO\\documents\\moves.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(moves);
            objectOut.close();
            System.out.println("The Object was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }*/

        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\USUARIO\\documents\\moves.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            moves = (Move[]) objectIn.readObject();
            objectIn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        List<Move> moveList1 = new ArrayList<>();
        List<Move> moveList2 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 4; k++) {
                moveList1.add(moves[(int)Math.random()]);
            }
        }
    }
}
