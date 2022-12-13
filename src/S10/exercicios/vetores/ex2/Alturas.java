package S10.exercicios.vetores.ex2;

/*
Problema "alturas":
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
*/

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        double t = 0;
        double d = 0;

        Pessoa[] vect = new Pessoa[n];

        for (int i=0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Idade:");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura:");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
        }

        for (int i=0; i < vect.length; i++){
             t += vect[i].getAltura();

             if (vect[i].getIdade() < 16){
                 d++;
             }
        }

        t = t / vect.length;
        d = (d * 100) / vect.length;
        System.out.printf("Altura média: %.2f%n" , t);
        System.out.println("Pessoas com menos de 16 anos: " + d + "%");

        for (int i=0; i < vect.length; i++){
            if (vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }

    }
}
