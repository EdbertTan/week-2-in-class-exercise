public class CreditCard{
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    public void CreditCard(String customer, String bank, String account, int limit, double balance){
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }
    public String getCustomer(){
        return this.customer;
    }
    public String getBank(){
        return this.bank;
    }

    public boolean charge(double price){
        return true;
    }
    public double makePayment(double amount){
        return amount;
    }
    public String getAccount(){
        return this.account;
    }
    public int getLimit(){
        return this.limit;
    }
    public double getBalance(){
        return this.balance;
    }
}