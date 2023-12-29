import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cafe cafe = new Cafe();

        cafe.addProduse(new Produse("Cafea", 10));
        cafe.addProduse(new Produse("Ceai", 5));
        cafe.addProduse(new Produse("Kombucea", 45));
        cafe.addProduse(new Produse("Matcha", 15));

        System.out.println(cafe.afisareListProduse());
        try {
            System.out.println("Aelegeti un produs:");

            System.out.println(cafe.selectProdus(new Produse(scanner.next())));
        }catch (Exception e){
            System.out.println("Asa produs nu exista, exista doar: " + cafe.afisareListProduse() );
            try {
                System.out.println(cafe.selectProdus(new Produse(scanner.next())));
            }catch (Exception a){
                System.out.println("Podusul selectat nu exista!");
            }
        }

    }
}