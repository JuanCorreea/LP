import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double milhas, result;

        System.out.println("Digite a qntd. de milhas: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        milhas = in.nextDouble();


        result = milhas * 1.609;

        System.out.println("A qntd de milhas convertida para quilometros é:  "+ result);

    }
}