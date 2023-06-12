package ExSeverino.Ex11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vetor[] = new float[30];
        float vetor1[] = new float[10];
        float vetor2[] = new float[10];
        float vetor3[] = new float[20];



        //Vetor 
        for(int x = 0; x < 30; x++){
            System.out.println("Insira para o vetor  na posição: [" + x +"]");
            vetor[x] = input.nextFloat();
        }

        

        //Vetor 3
        for(int x = 0; x < 30; x++){
            if(x<10){
                vetor1[x] =  vetor[x];
            }
            else if(x>=10 && x<20){
                vetor2[x-10] = vetor[x];
            }
            else{
                vetor3[x-20] = vetor[x];
            }

        }

        for(int x = 0; x < 20; x++){
            System.out.println(vetor3[x]);
        }
    }
}
