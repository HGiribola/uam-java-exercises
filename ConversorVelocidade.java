import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Conversor = new Scanner (System.in);
        System.out.println("Digite qualquer velocidade em Km/h");
        double KilometrosPorHora = Conversor.nextDouble();
        double MetrosPorSegundo = KilometrosPorHora / 3.6;
        System.out.printf("A velocidade %.1fKm/h em metros por segundo é %.1fm/s", KilometrosPorHora, MetrosPorSegundo
        );
    }
}
