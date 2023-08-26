package proj1;

import java.util.Scanner;

public class Proj1 {

    /*Copia o seu nome, idade e RG*/
    public static void main(String[] args) {
        Scanner myOBJ = new Scanner (System.in);
        System.out.println("Digite nome, idade e RG, por obséquio");
        String name = myOBJ.nextLine();
        int age = myOBJ.nextInt();
        long RG = myOBJ.nextLong(); 
        System.out.println("Seu nome é " + name + " sua idade é " + age + " e seu RG é " + RG);
    }
    
}
