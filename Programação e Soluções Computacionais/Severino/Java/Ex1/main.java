package ExSeverino.Ex1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Criar lista
        Integer input[] = new Integer[5];
        try (//Entrada de dados
        Scanner keyboard = new Scanner(System.in)) {
            //Recebe e armazena os números
            for(int x =0; x<5;x++){
                System.out.println("Inisira um número: ");
                input[x] = keyboard.nextInt();
                  
            }
        }

        //Mostra os números
        for(int x =0; x<5;x++){
            System.out.println("[" +x+ "] = " + input[x] );

              
        }
    }
}
