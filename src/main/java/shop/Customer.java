package shop;

public class Customer {

    private String name;
    private String password;
    private int balance;

    public Customer(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
