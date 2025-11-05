import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Cuenta> cuentas = new ArrayList<>(){
            Cuenta c0 = new Cuenta(100, "waso", 4.5);
        }

        Cuenta cuenta = new Cuenta(1122, 20000);
        cuenta.setAnualInterestRate(4.5);

        cuenta.withdraw(2500);
        cuenta.deposit(3000);
        System.out.println(cuenta.getBalance());
        System.out.println(cuenta.getMonthlyInterest());
        System.out.println(cuenta.getDateCreated());

        

        do{
            System.out.println("Ingresa una identificación: ");
            int x = scanner.nextInt();
            for (Cuenta cuenta : cuentas) {
                cuenta.getId();
            }

        } while (1 > 0);


    }
}