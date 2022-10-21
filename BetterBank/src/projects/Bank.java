package projects;

import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class Bank {
    private HashMap<Integer, Account> accountHashMap;
    private Queue<Client> clientQueue;

    public HashMap<Integer, Account> getAccountHashMap() {
        return accountHashMap;
    }
    public void setAccountHashMap(HashMap<Integer, Account> accountHashMap) {
        this.accountHashMap = accountHashMap;
    }
    public Queue<Client> getClientQueue() {
        return clientQueue;
    }
    public void setClientQueue(Queue<Client> clientQueue) {
        this.clientQueue = clientQueue;
    }

    public boolean passCheck(Account account, String password) {
        return password.equals(account.getPassword());
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountHashMap=" + accountHashMap.toString() +
                ", clientQueue=" + clientQueue +
                '}';
    }
}
