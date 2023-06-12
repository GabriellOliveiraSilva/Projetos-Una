package ExSeverino.Ex3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Recebe variaveis do usuário
        Float nota[] = new Float[4];
        Scanner input = new Scanner(System.in);
        Float media = (float) 0;
        //Recebe as notas
        for(int x = 0 ; x < 4; x++){
            System.out.println("Inisira a nota");
            nota[x] = input.nextFloat();
        }


        for(int x = 0 ; x < 4; x++){
            System.out.println("Nota[]" + x + "=" + nota[x]);
            media += nota[x];
        }


        System.out.printf("A média é: %.2f", ((media)/4));
        
    }
}