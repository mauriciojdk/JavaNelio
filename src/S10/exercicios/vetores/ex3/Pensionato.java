package S10.exercicios.vetores.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[10];

        System.out.print("How many rooms will be rented? ");
        int r = sc.nextInt();

        String[] name = new String[r];
        String[] email = new String[r];

        for (int i=0; i < r; i++ ){
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Email: ");
            email[i] = sc.nextLine();
            System.out.print("Room: ");
            int q = sc.nextInt();
            vect[q] = "" + name[i] + ", " + email[i];
        }

        System.out.println("Busy Rooms:");

        for (int i = 0; i < vect.length; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }

    }
}
