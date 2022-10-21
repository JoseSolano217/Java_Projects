package projects;

public class Account {
    String type;
    int money;
    int numberId;

    public Account(){}

    public Account(String type, int money, int numberId) {
        this.type = type;
        this.money = money;
        this.numberId = numberId;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getNumberId() {
        return numberId;
    }
    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    public void register(String type, int numberId){
        setType(type);
        setNumberId(numberId);
        setMoney(0);
    }

    public void addMoney(int moneyAdded){
        money += moneyAdded;
    }

    @Override
    public String toString() {
        return "Account: " +
                "Type = " + type + '\n' +
                "Money = " + money + "\n" +
                "Number Id = " + numberId;
    }
}