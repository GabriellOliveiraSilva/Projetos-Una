package ExSeverino.Ex2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Criar lista
        Integer input[] = new Integer[10];
        try (//Entrada de dados
        Scanner keyboard = new Scanner(System.in)) {
            //Recebe e armazena os números
            for(int x = 0; x < 10;x++){
                System.out.println("Inisira um número: ");
                input[x] = keyboard.nextInt();
                  
            }
        }

        //Mostra os números na ordem inversa
        //length pega o tamanho do array e considerando que um array tem indice 0, tira-se 1
        for(int x = input.length -1; x >= 0 ;x--){
            System.out.println("[" +x+ "] = " + input[x] );

        }
    }
}
