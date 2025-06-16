import java.util.Scanner;

    public class Main {
        public static void main (String[] args){
            Scanner in = new Scanner (System.in);
            int vlr, multp;

            System.out.println("Informe um valor: ");
            vlr = in.nextInt();

            System.out.println("A tabuada do " + vlr + " é: ");
            for (int i = 0; i<=10; i++) {
                System.out.println(vlr + " x " + i + " = " + (vlr * i));
            }
        }
    }