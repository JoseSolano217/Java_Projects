package projects;

import java.util.Arrays;
import java.util.Scanner;

public class Bank {
    public Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Bank m = new Bank();
        Account def = new Account("Default", 0, 0);
        Account[] accounts = new Account[3];
        Arrays.fill(accounts, def);
        boolean check1 = false;
        boolean check2;
        int accountNum = 0;
        System.out.println("Before starting, users must be added");
        System.out.println("How many users are to be added?");
        Client[] clients = new Client[m.keyboard.nextInt()];
        for (int i = 0; i < clients.length; i++) {
            Client client = new Client();
            clients[i] = client;
            System.out.println("Input the name of the client " + (i + 1));
            String name = m.keyboard.next();
            System.out.println("Input the lastname of the client " + (i + 1));
            String lastname = m.keyboard.next();
            System.out.println("Input the cellphone number of the client " + (i + 1));
            int cellnum = m.keyboard.nextInt();
            clients[i].register(name, lastname, cellnum);
            clients[i].setAccounts(accounts);
        }
        for (Client client : clients) {
            System.out.println(client.toString());
        }
        System.out.println("Clients added successfully");
        while (!check1) {
            check2 = false;
            switch (m.menu()) {
                case 1:
                    while (!check2) {
                        switch (m.userMenu()) {
                            case 1:
                                for (int i = 0; i < clients.length; i++) {
                                    for (int f = 0; f < clients[i].accounts.length; f++) {
                                        String type;
                                        System.out.println("Input the type of the account " + (f + 1) + " from the client " + (i + 1));
                                        System.out.println("Tip: Input 2 to set it as a current type, any other number will set it as saving");
                                        if (m.keyboard.nextInt() == 2) {
                                            type = "Current";
                                        } else {
                                            type = "Saving";
                                        }
                                        accountNum++;
                                        clients[i].accounts[f].register(type, accountNum);
                                    }
                                }
                                System.out.println("Accounts added successfully");
                                break;
                            case 2:
                                for (int i = 0; i < clients.length; i++) {
                                    for (int f = 0; f < clients[i].accounts.length; f++) {
                                        System.out.println("Input the amount to be deposited to account number " + (f + 1) + " from the client " + (i + 1));
                                        clients[i].accounts[f].addMoney(m.keyboard.nextInt());
                                    }
                                }
                                break;
                            case 3:
                                int count = 0;
                                int totalAccounts = clients.length*3;
                                Account[] savings = new Account[totalAccounts];
                                for (Client value : clients) {
                                    for (int f = 0; f < value.accounts.length; f++) {
                                        savings[count] = value.accounts[f];
                                        count++;
                                    }
                                }
                                sortLow(savings, 0, savings.length-1);
                                for (Account saving : savings) {
                                    if (saving.getType().equals("Savings")) {
                                        System.out.println(saving.toString());
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                int countH = 0;
                                int totalAccountsH = clients.length*3;
                                Account[] current = new Account[totalAccountsH];
                                for (Client client : clients) {
                                    for (int f = 0; f < client.accounts.length; f++) {
                                        current[countH] = client.accounts[f];
                                        countH++;
                                    }
                                }
                                sortHigh(current, 0, current.length-1);
                                for (Account account : current) {
                                    if (account.getType().equals("Current")) {
                                        System.out.println(account.toString());
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                check2 = true;
                                break;
                            default:
                                System.out.println("No");
                        }
                    }
                    break;
                case 2:
                    //See users z
                    for (Client client : clients) {
                        System.out.println(client.toString());
                    }
                    break;
                case 3:
                    check1 = true;
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public int menu() {
        System.out.println("Welcome to santotoBank" + "\nSelect an option from below");
        System.out.println("""
                1. Manage users
                2. See users (Alphabetical order)
                3. Exit""");
        return keyboard.nextInt();
    }

    public int userMenu() {
        System.out.println("What to do with the users?");
        System.out.println("""
                1. Add Account
                2. Add money
                3. See user with the lowest amount of money in 
                4. See user with the highest amount of money in
                5. Exit""");
        return keyboard.nextInt();
    }
    public static void sortHigh(Account[] v, int left, int right) {
        int pivot = v[0].money;
        int i = left;
        int j = right;
        int temp;
        while(i < j){
            while(v[i].money <= pivot && i < j)
                i++;
            while(v[j].money > pivot)
                j--;
            if (i < j) {
                temp = v[i].money;
                v[i].money = v[j].money;
                v[j].money = temp;
            }
        }
        v[left].money = v[j].money;
        v[j].money = pivot;
        if(left < j - 1)
            sortHigh(v,left,j - 1);
        if(j + 1 < right)
            sortHigh(v,j + 1,right);
    }
    public static void sortLow(Account[] v, int left, int right) {
        int pivot = v[0].money;
        int i = left;
        int j = right;
        int temp;
        while(i < j){
            while(v[i].money <= pivot && i < j)
                i++;
            while(v[j].money > pivot)
                j--;
            if (i > j) {
                temp = v[i].money;
                v[i].money = v[j].money;
                v[j].money = temp;
            }
        }
        v[left].money = v[j].money;
        v[j].money = pivot;
        if(left < j - 1)
            sortLow(v,left,j - 1);
        if(j + 1 < right)
            sortLow(v,j + 1,right);
    }
}