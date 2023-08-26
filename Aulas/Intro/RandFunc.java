
package funções;

import java.util.Scanner;

public class Funções {

    public static void main(String[] args) {
      Scanner func = new Scanner (System.in);
      System.out.println("Digitge um valor para 'X'");
      float xValor = func.nextFloat();
      float somaComY = xValor * 2 + 3;
      System.out.println("Para a Função 'F(x) = 2x + 3' o valor de 'Y' é: " + somaComY);
    }
    
}
