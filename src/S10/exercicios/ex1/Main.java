package S10.exercicios.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Empregado> emp = new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos empregados vai registrar? ");
        int r = sc.nextInt();

        for (int i=0; i < r; i++ ){
            System.out.println("Empregado #" + (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            System.out.println(" ");

            emp.add(new Empregado(id, nome, salario));
        }

        System.out.print("Qual Id do empregado que receberá aumento de salario? ");
        int s = sc.nextInt();
        List<Empregado> result = emp.stream().filter(x -> x.getId() == s).collect(Collectors.toList());
            if (result.isEmpty() == true){
                System.out.println("Id não existe");
            } else {
                System.out.print("Qual a porcetagem? ");
                int f = sc.nextInt();
                for (Empregado x : result) {
                x.setSalario((x.getSalario() * f) / 100 + x.getSalario());
            }
        }

        System.out.println(" ");

            System.out.println("Lista de empregados:");
        for (Empregado x : emp){
            System.out.println(x.getId() + ", " + x.getNome() + ", " + x.getSalario());

        }

    }
}
