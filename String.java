import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class String {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite 10 strings:");

        for (int i = 0; i < 10; i++) {
            System.out.print("String " + (i + 1) + ": ");
            String str = scanner.nextLine();
            lista.add(str);
        }

        System.out.println("\nStrings informadas:");
        for (String s : lista) {
            System.out.println(s);
        }

        Collections.sort(lista);

        System.out.println("\nStrings ordenadas:");
        for (String s : lista) {
            System.out.println(s);
        }

        scanner.close();
    }
}
