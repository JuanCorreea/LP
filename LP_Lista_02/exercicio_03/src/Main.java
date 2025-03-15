import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result,number;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        number = in.nextDouble();

        result = number / 5;

        System.out.println("A quinta parte do número informado é: "+ result);

    }
}