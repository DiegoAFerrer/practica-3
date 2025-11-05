import java.time.LocalDate;

public class Cuenta {
    private int id;
    private static int idCounter;
    private String name;
    private double balance;
    private double annualInterestRate;
    private final LocalDate dateCreated;

    public Cuenta(){
        this.id = ++idCounter;
        this.name = name;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = LocalDate.now();
    }

    public Cuenta(double balance, String name, double annualInterestRate){
        this.id = ++idCounter;
        this.name = name;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = LocalDate.now();

    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getAnualInterestRate(){
        return this.annualInterestRate;
    }

    public LocalDate getDateCreated(){
        return this.dateCreated;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return (this.annualInterestRate / 12) / 100;
    }

    public double getMonthlyInterest(){
        double x = balance * this.getMonthlyInterestRate();
        return x;
    }

    public String withdraw(double withdrawn){
        if(withdrawn <= this.balance){
            this.balance = this.balance - withdrawn;
            return "Amount withdrawn";
        } else{
            return "Not enough in account to withdraw";
        }
    }

    public String deposit(double deposited){
        if(deposited > 0){
            this.balance = this.balance + deposited;
            return "Amount deposited";
        } else{
            return "Can't deposit less than $0";
        }
    }
}