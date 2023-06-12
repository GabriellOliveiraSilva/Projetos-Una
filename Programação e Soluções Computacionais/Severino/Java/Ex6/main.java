package ExSeverino.Ex6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Recebe input do usuario
        Scanner input = new Scanner(System.in);

        //Media
        Float[] media = new Float[10];
        
        //Armazena temporariamente as notas
        float CalcMedia = 0;

        //Armazena as notas e as médias
        for(int x = 10; x<10; x++){
            for(int y = 4; y == 4; y++){
                System.out.println("Insira a nota " + y + " para o aluno " + x);
                CalcMedia += input.nextFloat();
            }
            media[x] = CalcMedia /4;
        }

        //Mostra as medias
        for(int x = 10; x < 10; x++){
            //Verifica se a média é maior que 7
            if(media[x] > 7){
                System.out.println(media[x]);
            }
        }
    }

}
