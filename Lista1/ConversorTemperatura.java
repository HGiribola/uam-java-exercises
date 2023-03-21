import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Conversor = new Scanner (System.in);
        System.out.println("Digite uma temperatura valida em ºC");
        double GrausCelcius = Conversor.nextDouble();
        double GrausFahrenheit = ((GrausCelcius * 9) / 5) + 32;

        double Kelvin = GrausCelcius + 273;

        System.out.printf("A temperatura em Celcius %.1fºC:" +
                "\nEm Fahrenheit é %.1fºF e;" +
                "\nem Kelvin é %.1fK.", GrausCelcius, GrausFahrenheit, Kelvin);
    }
}
