package projects;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Token> stack = new Stack<Token>();
        Token token1 = new Token("Blue", 1);
        Token token2 = new Token("Grene", 2);
        Token token3 = new Token("Yelowe", 3);
        Token token4 = new Token("Broune", 4);
        Token token5 = new Token("Dyeurs Coloures", 5);

        stack.push(token1);
        stack.push(token2);
        stack.push(token3);
        stack.push(token4);
        stack.push(token5);

        for (Token token : stack) {
            System.out.println(token.toString());
        }
        System.out.println("");

        stack.pop();
        stack.pop();

        for (Token token : stack) {
            System.out.println(token.toString());
        }
        System.out.println("");

        stack.push(token5);
        stack.push(token5);

        for (Token token : stack) {
            System.out.println(token.toString());
        }
        System.out.println("");
    }
}
