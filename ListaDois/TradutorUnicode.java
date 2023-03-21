import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Tradutor = new Scanner(System.in);
        System.out.print("Insira uma letra: ");
        char letra = Tradutor.next().charAt(0);
        int emUnicode = (int) letra;
        System.out.println("O encode UTF-8 da letra " + letra + " é " + emUnicode);
    }
}
