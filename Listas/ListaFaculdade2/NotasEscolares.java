package notasescolares;

import java.util.Scanner;

public class NotasEscolares {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite as 3 notas do Aluno: ");
        
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3.0;
        
        double faltante = 6 - media;
        
        if (media < 6.0) {
            System.out.println("Reprovado!");
            System.out.printf("Média: %.1f",media);
            System.out.printf("\nFalta: %.1f \n", faltante);
        }
        if (media >= 6.0) {
            System.out.println("Aprovado!");
            System.out.printf("Média: %.1f",media);
        }
    }
    
}
