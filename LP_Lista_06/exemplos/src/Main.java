import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        n = in.nextInt();

        if (n % 5 == 0){
            System.out.println(+n+" É multiplo de 5: ");
        }else{
            System.out.println(+n+ " Não é multiplo de 5");
        }
    }
}