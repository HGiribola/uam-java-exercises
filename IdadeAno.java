import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.println("Digite o ano de seu nascimento");
        int anoNascimento = Leitor.nextInt();

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        int idade = year - anoNascimento;
        System.out.println("Sua idade é " + idade);
    }
}