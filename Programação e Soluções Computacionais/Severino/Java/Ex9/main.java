package ExSeverino.Ex9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float A[] = new float[5];
        float soma = 0;
        
        for(int x = 0; x< 5; x++){
            System.out.println("Insira o valor: ");
            A[x] = input.nextFloat();
        }

        for(int x = 0; x< 5; x++){
            soma += Math.pow(A[x], 2);
        }
    }

    
}
