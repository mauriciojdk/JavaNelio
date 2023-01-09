package s15.tratamentodeexcecoes;

import s15.tratamentodeexcecoes.entities.Account;
import s15.tratamentodeexcecoes.entities.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            Double initial = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            Double limit = sc.nextDouble();
            Account account = new Account(number,holder,initial,limit);

            System.out.println("");
            System.out.print("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();

            account.withdraw(withdraw);
            System.out.println("New balance: " + account.getBalance());

        }catch (DomainException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
