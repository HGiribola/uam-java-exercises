import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite 3 números quaisquer");
        double numero1 = leitor.nextDouble();
        double numero2 = leitor.nextDouble();
        double numero3 = leitor.nextDouble();
        double somaNum = numero1 + numero2 + numero3;
        System.out.println("A soma dos números é " + somaNum);
    }
}
