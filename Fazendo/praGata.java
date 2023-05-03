package teste;
import java.util.Scanner;
public class Teste {

    public static void main(String[] args) {
        System.out.println("Insira o nome da menina mais linda que você conhece");
        Scanner teclado = new Scanner(System.in);
        String Nome = teclado.nextLine();
        System.out.println("Agora sua idada");
        int Idade = teclado.nextInt();
        System.out.println("E por último, sua altura");
        double Altura = teclado.nextDouble();
        
        System.out.printf("A %s que tem %d anos é linda e tem %2fm de altura %n",Nome, Idade, Altura);
    }
}
