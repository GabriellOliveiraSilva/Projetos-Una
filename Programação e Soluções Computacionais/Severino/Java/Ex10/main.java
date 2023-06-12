package ExSeverino.Ex10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vetor1[] = new float[10];
        float vetor2[] = new float[10];
        float vetor3[] = new float[20];
        int contador = 0;


        //Vetor 1
        for(int x = 0; x < 10; x++){
            System.out.println("Insira para o vetor 1 na posição: [" + x +"]");
            vetor1[x] = input.nextFloat();
        }

        //Vetor 2
        for(int x = 0; x < 10; x++){
            System.out.println("Insira para o vetor 2 na posição: [" + x +"]");
            vetor2[x] = input.nextFloat();
        }

        //Vetor 3
        for(int x = 0; x < 20; x++){
            if(x%2==0){
                vetor3[x] = vetor1[contador];
                contador +=1;
            }
            else{
                vetor3[x] = vetor2[contador -1];
            }
        }

        for(int x = 0; x < 20; x++){
            System.out.println(vetor3[x]);
        }
    }
}
