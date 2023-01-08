package s14.herancaepolimorfismo;

import s14.herancaepolimorfismo.entities.ImportedProduct;
import s14.herancaepolimorfismo.entities.Product;
import s14.herancaepolimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int a = i;
            System.out.println("Product #" + (a+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char resp = sc.next().charAt(0);

            if (resp == 'c'){
                Product product = new Product();
                System.out.print("Name: ");
                String name = sc.nextLine();
                product.setName(name);
                sc.nextLine();

                System.out.print("Price: ");
                Double price = sc.nextDouble();
                product.setPrice(price);
                sc.nextLine();
                System.out.println("");

                productList.add(product);
            } if (resp == 'u'){
                UsedProduct product = new UsedProduct();
                System.out.print("Name: ");
                String name = sc.nextLine();
                product.setName(name);
                sc.nextLine();

                System.out.print("Price: ");
                Double price = sc.nextDouble();
                product.setPrice(price);
                sc.nextLine();

                //System.out.println("Manufacture da (DD/MM/YYYY): ");
               // String date = sc.nextLine();
               // LocalDate d1 = LocalDate.parse(date);
                product.setManufactureDate(LocalDate.ofEpochDay(2017/05/05));
                sc.nextLine();
                System.out.println("");

                productList.add(product);
            } if (resp == 'i'){
                ImportedProduct product = new ImportedProduct();
                System.out.print("Name: ");
                String name = sc.nextLine();
                product.setName(name);
                sc.nextLine();

                System.out.print("Price: ");
                Double price = sc.nextDouble();
                product.setPrice(price);
                sc.nextLine();

                System.out.print("Customs fee: ");
                Double custom = sc.nextDouble();
                sc.nextLine();
                product.setCustomsFee(custom);

                System.out.println("");
            }
        }

        sc.close();

        System.out.println("PRICE TAGS");
        for(int i = 0; i < productList.size(); i++){
            System.out.println(productList.get(i).priceTag());
        }


    }
}
