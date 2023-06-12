package ExSeverino.Ex4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (//Input usuario
        Scanner input = new Scanner(System.in)) {
            //Criação da Lista
            String ListaLetras[] = new String[10];
            int consoantes = 0;


            //Adicionadno a Lista
            for(int i = 0; i<10 ; i++){

                System.out.println("Insira uma letra: ");
                String letra = input.next().toUpperCase();
       
                //Verifica se é consoante
                if(!letra.equals("A") &&  !letra.equals("E") &&  !letra.equals("I") &&  !letra.equals("O") && !letra.equals("U")){
                    consoantes ++;
                }
                //Adiciona a lista
                ListaLetras[i] = letra;
            }

            //loop que percorre a lista
            for(String letra : ListaLetras){
                //Verifica se é consoante
                if(!letra.equals("A") && !letra.equals("E") && !letra.equals("I") && !letra.equals("O") && !letra.equals("U")){
                    System.out.println(letra);
                }
            }

            //Printa o número de consoantes
            System.out.println("O Número de Consoantes é: " + consoantes);
        }
    }
}
