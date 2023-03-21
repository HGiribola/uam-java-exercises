import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Conversor = new Scanner (System.in);
        System.out.println("Digite uma temperatura valida em ºC");
        double GrausCelcius = Conversor.nextDouble();
        double GrausFahrenheit = ((GrausCelcius * 9) / 5) + 32;
        System.out.println("A temperatura em °F é " + GrausFahrenheit);
    }
}
