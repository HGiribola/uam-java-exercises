package x;

import java.util.Scanner;

public class Teste2{
    
    public static void main(String[] args){
        
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Quantos alunos existem na sala de Aula?");
        int NAlunos = Teclado.nextInt();

        int aux = 1;
        do{            
            System.out.println("Qual o nome do aluno numero " + aux + "?");
            String NomeAluno = Teclado.nextLine();
            meuMetodo(NomeAluno);
            
            public static void meuMetodo(String name){
                System.out.println(name);
            }
            
            aux ++;

        } while(aux < NAlunos);
    }
}

