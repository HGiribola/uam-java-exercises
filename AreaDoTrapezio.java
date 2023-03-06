package areadotrapezio;

import java.util.Scanner;

public class AreaDoTrapezio {
    
    public static void main(String[] args) {
        Scanner Area = new Scanner (System.in);
        System.out.println("Digite o valor da base menor, da base maior e da altura");
        float Bmenor = Area.nextInt();
        float Bmaior = Area.nextInt();
        float altura = Area.nextInt();
        float Bases = Bmenor + Bmaior;
        float comAltura = Bases * altura;
        float Calc = comAltura / 2;
        System.out.println("A área do trapézio é " + Calc + "m²");
        System.out.println("deu certo porraaaa");
    }
    
}
