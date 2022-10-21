package projects;

import java.util.*;

public class Main {
Bank bank = new Bank();
    public static void main(String[] args) {
        HashMap<Integer, Account> hmap = new HashMap<>();
        List<Account> accountList = new ArrayList<>();
        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard3 = new Scanner(System.in);
        List<Client> clientList = new ArrayList<>();
        Queue<Client> clientQueue = new LinkedList<>();
        Main m = new Main();
        m.bank.setClientQueue(clientQueue);
        for (int i = 0; i < 10; i++) {
            hmap.put(i + 1, new Account(0, String.valueOf(100 + i), 1 + i));
            accountList.add(new Account(0, String.valueOf(100 + i), 1 + i));
        }
        m.bank.setAccountHashMap(hmap);
        List<Account> normanAccounts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            normanAccounts.add(accountList.get(i));
        }
        Client client1 = new Client("Norman", 1001, null, normanAccounts);
        List<Account> nancyAccounts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            nancyAccounts.add(accountList.get(5 + i));
        }
        Client client2 = new Client("Nancy", 1002, null, nancyAccounts);
        clientList.add(client1); clientList.add(client2);
        boolean check1 = false;
        boolean check2 = false;
        while (!check1) {
            while (!check2) {
                System.out.println("Input your document number");
                int num = keyboard1.nextInt();
                for (Client client : clientList) {
                    if (client.getDocumentNumber() == num) {
                        m.bank.getClientQueue().add(client);
                        check2 = true;
                    }
                }
            }
            System.out.println("User added to the queue, add another user?");
            if (keyboard2.nextLine().toLowerCase(Locale.ROOT).equals("no")) {
                check1 = true;
            } else {
                check2 = false;
            }
        }
        System.out.println("Queue creation finished");
        for (Client client: m.bank.getClientQueue()) {
            Stack<Integer> actions = new Stack<>();
            client.setActions(actions);
            System.out.println("Hello " + client.getName() + ", what will it be?");
            boolean queueCheck = false;
            int action;
            while (!queueCheck) {
                do {
                    System.out.println("""
                        1. See money
                        2. Add money
                        3. Take money
                        4. Change password
                        5. Exit
                        """);
                    action = keyboard3.nextInt();
                    client.getActions().add(action);
                } while (action != 5);
                for (int i = 0; i < client.getActions().size(); i++) {
                    switch (client.getActions().get(i)) {
                        case 1 -> {
                            System.out.println("Input the account number to see money");
                            int num = keyboard2.nextInt();
                            boolean passCheck = false;
                            do {
                                for (Account account: client.getAccountList()) {
                                    if (account.getNumber() == num) {
                                        System.out.println("Input the password for this account");
                                        String password = keyboard3.nextLine();
                                        passCheck = m.bank.passCheck(account, password);
                                    }
                                }
                                if (!passCheck) {
                                    System.out.println("Try again");
                                }
                            } while (!passCheck);
                            for (Account account: client.getAccountList()) {
                                if (account.getNumber() == num) {
                                    System.out.println(account.getMoney());
                                }
                            }
                            System.out.println("Done");
                        }
                        case 2 -> {
                            System.out.println("Input the account number to add money");
                            int num = keyboard2.nextInt();
                            boolean passCheck = false;
                            do {
                                for (Account account: client.getAccountList()) {
                                    if (account.getNumber() == num) {
                                        System.out.println("Input the password for this account");
                                        String password = keyboard3.nextLine();
                                        passCheck = m.bank.passCheck(account, password);
                                    }
                                }
                                if (!passCheck) {
                                    System.out.println("Try again");
                                }
                            } while (!passCheck);
                            System.out.println("Input the amount of money to add");
                            int money = keyboard1.nextInt();
                            for (Account account: client.getAccountList()) {
                                if (account.getNumber() == num) {
                                    account.modifyMoney(money, true);
                                }
                            }
                            System.out.println("Done");
                        }
                        case 3 -> {
                            System.out.println("Input the account number to take money");
                            int num = keyboard2.nextInt();
                            boolean passCheck = false;
                            do {
                                for (Account account: client.getAccountList()) {
                                    if (account.getNumber() == num) {
                                        System.out.println("Input the password for this account");
                                        String password = keyboard3.nextLine();
                                        passCheck = m.bank.passCheck(account, password);
                                    }
                                }
                                if (!passCheck) {
                                    System.out.println("Try again");
                                }
                            } while (!passCheck);
                            System.out.println("Input the amount of money to take");
                            int money = keyboard1.nextInt();
                            for (Account account: client.getAccountList()) {
                                if (account.getNumber() == num) {
                                    account.modifyMoney(money, false);
                                }
                            }
                            System.out.println("Done");
                        }
                        case 4 -> {
                            System.out.println("Input the account number to change password");
                            int num = keyboard2.nextInt();
                            boolean passCheck = false;
                            do {
                                for (Account account: client.getAccountList()) {
                                    if (account.getNumber() == num) {
                                        System.out.println("Input the password for this account");
                                        String password = keyboard3.nextLine();
                                        passCheck = m.bank.passCheck(account, password);
                                    }
                                }
                                if (!passCheck) {
                                    System.out.println("Try again");
                                }
                            } while (!passCheck);
                            System.out.println("Input the new password");
                            String password = keyboard1.nextLine();
                            for (Account account: client.getAccountList()) {
                                if (account.getNumber() == num) {
                                    account.setPassword(password);
                                }
                            }
                            System.out.println("Done");
                        }
                        case 5 -> {
                            queueCheck = true;
                        }
                        default -> {
                            System.out.println("No");
                        }
                    }
                }
            }
            System.out.println("Have a good day " + client.getName());
        }
        m.bank.getClientQueue().clear();
    }
}