package ExSeverino.Ex12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] idade = {10,12,13,14,15};
        double[] altura = {1.4,1.65,1.32,1.78,1.9};
        double mediaAltura = 0;
        int contador = 0;

        //define a media
        for(int x = 0;x<altura.length;x++){
            mediaAltura += altura[x];
        }
        mediaAltura = mediaAltura / altura.length;


        //Verifica se a idade é maior que 13
        for(int x = 0; x< idade.length;x++){
            if(idade[x] > 13 ){
                if(altura[x] > mediaAltura){
                    contador +=1;
                }
            }
        }

        System.out.println(contador);
    }
}
