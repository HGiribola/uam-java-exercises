import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
       Scanner Scnr = new Scanner(System.in);
       System.out.println("Digite um número inteiro: ");
       int numeroInteiro = Scnr.nextInt();
       int aux1 = 1;
       System.out.println("A tabuada até o 10 é: ");
       while(aux1 <= 10) {
           System.out.println(numeroInteiro * aux1);
           aux1++;
       }
   
    }

}
