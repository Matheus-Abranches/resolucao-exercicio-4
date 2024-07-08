import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero inteiro:");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("o antecessor é: " + antecessor);
        System.out.println("o sucessor é: " + sucessor);




    }
}