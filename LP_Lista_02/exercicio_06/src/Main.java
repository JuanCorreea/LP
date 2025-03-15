import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double velocidade, result;

        System.out.println("Digite a velocidade em m/s: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        velocidade = in.nextDouble();


        result = velocidade * 3.6;

        System.out.println("A velocidade convertida em kh/m é:  "+ result);

    }
}