import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vl1, vl2;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        vl1 = in.nextInt();
        System.out.println("Informe o segundo valor: ");
        vl2 = in.nextInt();

        if(vl1 > vl2) {
            System.out.println("O primeiro valor informado é maior!");

        }else if (vl1 == vl2) {
            System.out.println("Os valores são iguais!");
        }else{
            System.out.println("O segundo valor informado é maior!");

            }
        }
    }