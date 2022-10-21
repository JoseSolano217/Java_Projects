package projects;

public class Account {
    private int money;
    private String password;
    private final int number;

    public Account(int money, String password, int number) {
        this.money = money;
        this.password = password;
        this.number = number;
    }

    public int getMoney() {
        return money;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getNumber() {
        return number;
    }

    public void modifyMoney(int amount, boolean adding) {
        if (adding) {
            this.money += amount;
        } else {
            this.money -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", password='" + password + '\'' +
                ", number=" + number +
                '}';
    }
}
