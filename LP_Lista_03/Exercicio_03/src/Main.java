import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        nota1 = in.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2)/2;


        if(media >= 50) {
            System.out.println("Aprovado! Sua média é de: "+media);
        }else {
            System.out.println("Reprovado! Sua média é de: "+media);
        }
        }
    }