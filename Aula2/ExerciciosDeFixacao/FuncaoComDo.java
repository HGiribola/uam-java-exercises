public class FuncaoComDo {

    public static void main(String[] args) {
        int x = - 10;
        int NPotencia = 2;
        do{
            double ValorA = Math.pow(-x, NPotencia);
            double ValorB = 5 * x;
            double ValorC = -4;
            double Baskhara = ValorA + ValorB + ValorC;
            
            System.out.println("Para x = " + x + " o valor é " + Baskhara);
            
            x++;
        }
        while (x <= 10);
    }
    
}
