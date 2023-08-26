import java.util.Scanner;

class MainFromCircleArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o raio da circunferência em centímetros");
        double raio = leitor.nextDouble();
        double QuadradoDoRaio = raio * raio;
        double  Area = QuadradoDoRaio * 3.14;
        System.out.printf("A area da circunferencia é de %.1fcm²", Area);
    }
}
