import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base,altura, result;

        System.out.println("Digite a base do seu triângulo:  ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        base = in.nextDouble();

        System.out.println("Digite a altura do seu triângulo:  ");

        in = new Scanner(System.in);
        altura = in.nextDouble();

        result = (base * altura)/2;

        System.out.println("A área do seu triângulo é de: "+ result);

    }
}