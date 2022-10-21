package projects;

import java.util.List;
import java.util.Stack;

public class Client {
    private final String name;
    private final int documentNumber;
    private Stack<Integer> actions;
    private List<Account> accountList;

    public Client(String name, int documentNumber, Stack<Integer> actions, List<Account> accountList) {
        this.name = name;
        this.documentNumber = documentNumber;
        this.actions = actions;
        this.accountList = accountList;
    }

    public Client(String name, int documentNumber) {
        this.name = name;
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }
    public int getDocumentNumber() {
        return documentNumber;
    }
    public Stack<Integer> getActions() {
        return actions;
    }
    public void setActions(Stack<Integer> actions) {
        this.actions = actions;
    }
    public List<Account> getAccountList() {
        return accountList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", documentNumber=" + documentNumber +
                ", actions=" + actions +
                ", accountList=" + accountList +
                '}' + "\n";
    }
}
