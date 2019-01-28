import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < names.length; i++) {
            System.out.println("Podaj imię" + (i + 1) + "");
            names[i] = scanner.nextLine();
        }
        for (int i = names.length - 1; i >= 0; ) {


            System.out.println("Cześć" + names[i]);
            i--;
        }

    }

}
