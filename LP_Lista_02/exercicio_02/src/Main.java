import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int result;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        number = in.nextInt();

        result = number * number;

        System.out.println("O seu número elevado ao quadrado é: "+ result);

    }
}