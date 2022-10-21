package projects;

import java.util.Arrays;

public class Client {
    String name;
    String lastname;
    int number;
    Account[] accounts;

    public Client() {}

    public Client(String name, String lastname, int number, Account[] accounts) {
        this.name = name;
        this.lastname = lastname;
        this.number = number;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Account[] getAccounts() {
        return accounts;
    }
    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public void register(String name, String lastname, int number){
        setName(name);
        setLastname(lastname);
        setNumber(number);
    }

    public void addAccount(Account[] accounts){
        setAccounts(accounts);
    }

    @Override
    public String toString() {
        return "Client: \n" +
                "Name = " + name + "\n" +
                "Last Name = " + lastname + "\n" +
                "Number = " + number + "\n" +
                "Accounts =" + Arrays.toString(accounts);
    }
}