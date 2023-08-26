
package maiornumero;

import java.util.Scanner;


public class MaiorNumero {

   
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        double numero1 = Leitor.nextDouble();
        double numero2 = Leitor.nextDouble();
        if(numero1 < numero2){
            System.out.println(numero2);
        } else {
            System.out.println(numero1);
        }
        
    }
    
}
