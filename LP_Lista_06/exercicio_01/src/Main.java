import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Digite um número inteiro positivo: ");
            n = in.nextInt();
        } while (n < 1);

        System.out.println(n + " = " + funcao(n));

    }

    public static int funcao(int n) {
        int funcao=1;
        for (int i = n; i >1; i--) {
            funcao +=i;

        }
        return funcao;
    }
}