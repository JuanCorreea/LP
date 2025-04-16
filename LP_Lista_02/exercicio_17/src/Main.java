import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vlcinicial,aceleracao, tempo, result;

        Scanner in = new Scanner(System.in); //configura o Scanner

        System.out.println("Digite a velocidade inicial:  ");
        vlcinicial = in.nextDouble();

        System.out.println("Digite a aceleração:  ");

        in = new Scanner(System.in);
        aceleracao = in.nextDouble();

        System.out.println("Digite o tempo do percurso:  ");

        in = new Scanner(System.in);
        tempo = in.nextDouble();

        result = vlcinicial + (aceleracao * tempo)/2;

        System.out.println("A velocidade final do corpo é de: "+ result);

    }
}