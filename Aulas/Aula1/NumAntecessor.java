import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite qualquer numero inteiro");
        int numero = leitor.nextInt();
        int antecessor = numero - 1;
        System.out.println("Seu antecessor é: " + antecessor);
    }
}
