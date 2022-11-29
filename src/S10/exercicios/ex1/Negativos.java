package S10.exercicios.ex1;

/*Problema "negativos":
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
 e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/


import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();

    Integer[] vect = new Integer[n];

    for (int i=0; i < vect.length; i++){
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextInt();
    }

    System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i < vect.length; i++){
            int t = vect[i];
            if (t < 0){
                System.out.println(t);
            }
        }

    }
}
