package ExSeverino.Ex8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso[] = new float[5];
        int idade[] = new int[5];

        //Recebimento das variaveis de peso
        for(int x = 0; x < 5;x++){
            System.out.println("Insira a idade: ");
            idade[x] = input.nextInt();
            System.out.println("Insira o peso: ");
            peso[x] = input.nextFloat();
        }

        for(int x = idade.length -1; x >= 0 ;x--){
            System.out.println("Idade[" +x+ "] = " + idade[x] );
            System.out.println("Peso[" +x+ "] = " + peso[x] );

        }


    }
}
