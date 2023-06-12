package ExSeverino.Ex14;

import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] perguntas = {
            "Telefonou Para Vítima?\nS-Sim\nN-Não",
            "Esteve no local do crime?\nS-Sim\nN-Não",
            "Mora perto da vítima?\nS-Sim\nN-Não",
            "Devia para a vítima\nS-Sim\nN-Não",
            "Já trabalhou com a vítima?\nS-Sim\nN-Não"

        };
        String respostas[] = new String[5];
        int contadorRespostas = 0;

        //loop que faz as perguntas e armazena as respostas
        for(int x = 0; x<5; x++){
            while(true){
                System.out.println(perguntas[x]);
                String resposta = input.next().toUpperCase();
                //Verifica se a resposta é válida
                //Se sim, para o loop, se não, pergunta novamente
                if(ConfereResposta(resposta)){
                    respostas[x] = resposta;
                    break;
                }
            }

        }
        
        //Soma as perguntas positivas
        for(int x = 0; x<5; x++){
            if(respostas[x].equals("S")){
                contadorRespostas +=1;
            }
        }

        //Emite o diagnostico de acordo com as condições
        if(contadorRespostas <=1){
            System.out.println("Inocente");
        }
        else if(contadorRespostas == 2){
            System.out.println("Suspeito");
        }
        else if(contadorRespostas == 3 || contadorRespostas == 4){
            System.out.println("Cúmplice");
        }
        else{
            System.out.println("Assassino");
        }
    }
    




    //Função que verifica se a resposta é válida
    public static boolean ConfereResposta(String resposta){
        
        if(resposta.equals("S") || resposta.equals("N")){
            return true;
        }
        return false;

    }
}
