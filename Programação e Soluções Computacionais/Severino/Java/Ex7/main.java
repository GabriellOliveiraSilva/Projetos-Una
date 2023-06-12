package ExSeverino.Ex7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numeros[] = new float[5];
        float soma = 0;
        float multiplicacao = 1;

        //Recebendo números
        for(int x = 0;x<5; x++){
            System.out.println("Insira um número: ");
            numeros[x] = input.nextFloat();
        }

        //Multiplicação e soma
        for(int x = 0; x<5; x++){
            soma += numeros[x];
            multiplicacao *= numeros[x]; 
        }

        System.out.println("Soma = " + soma);
        System.out.println("Multiplicação = " + multiplicacao);
    }
}
