import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite qualquer número inteiro");
        long numero = leitor.nextLong();
        System.out.println("Você digitou o número " + numero);
    }
}
