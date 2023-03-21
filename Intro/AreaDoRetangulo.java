
package areadoretangulo;

import java.util.Scanner;

public class AreaDoRetangulo {
 
    public static void main(String[] args) {
        Scanner Area = new Scanner (System.in);
        System.out.println("Digite os valores de dois lados perpendiculares do retângulo separados por enter");
        int Lado1 = Area.nextInt();
        int Lado2 = Area.nextInt();
        int Calc = Lado1 * Lado2;
        System.out.println("A área é " + Calc + "m²");
    }
    
}
